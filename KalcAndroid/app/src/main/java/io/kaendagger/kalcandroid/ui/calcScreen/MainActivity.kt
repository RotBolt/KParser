package io.kaendagger.kalcandroid.ui.calcScreen

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import io.kaen.dagger.*
import io.kaendagger.kalcandroid.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_main.*
import kotlinx.coroutines.*
import java.lang.Exception
import java.util.Stack
import kotlin.coroutines.CoroutineContext


class MainActivity : AppCompatActivity(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
    private val expressionHolder = StringBuilder()
    private val clrStack = Stack<String>()

    private var inDegrees = false
    private val expressionParser = ExpressionParser().also {
        it.enableLog(true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setNavDrawer()
        val calcPadPagerAdaper = CalcpadPagerAdaper(
            supportFragmentManager,
            object : OnCalcBtnClickListener {
                override fun onCalcBtnClick(data: String) {
                    when (data) {
                        "=" -> showResult(true)
                        "C" -> {
                            clearAction()
                            showResult(false)
                        }
                        else -> {
                            displayExpression(data)
                            smoothScrollToEnd()
                        }
                    }
                }
            }
        ) {
            expressionHolder.clear()
            clrStack.clear()
            tvDisplay.animClear()
            tvResult.animClear()
        }

        keypadPager.apply {
            offscreenPageLimit = 2
            adapter = calcPadPagerAdaper
            setPageTransformer(true, ZoomOutPageTransformer())
        }
    }

    private fun setNavDrawer() {


        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = ""
        }
        val toggle = object : ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.nav_open, R.string.nav_close
        ) {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                val scaleFactor = 7f
                val slideX = drawerView.width * slideOffset

                mainContainer.translationX = slideX
                mainContainer.scaleX = 1 - slideOffset / scaleFactor
                mainContainer.scaleY = 1 - slideOffset / scaleFactor
                super.onDrawerSlide(drawerView, slideOffset)
            }
        }
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        drawer.setScrimColor(Color.TRANSPARENT);


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.extras_menu, menu)
        return true
    }

    private fun clearAction() {
        if (clrStack.isNotEmpty()) {
            val removeIndex = expressionHolder.length - clrStack.pop().length
            expressionHolder.delete(removeIndex, expressionHolder.length)
            tvDisplay.text = expressionHolder.toString()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.degRad -> {
                if (inDegrees) {
                    item.title = "RAD"
                    expressionParser.isDegrees = false
                } else {
                    item.title = "DEG"
                    expressionParser.isDegrees = true
                }
                inDegrees = !inDegrees
                showResult(true)
            }
        }
        return true
    }

    private fun displayExpression(extraData: String) {
        expressionHolder.append(extraData)
        clrStack.push(extraData)
        tvDisplay.text = expressionHolder.toString()
        showResult(false)
    }

    private fun showResult(toShow: Boolean) {
        val result = try {
            expressionParser.evaluate(expressionHolder.toString())
        } catch (bs: BadSyntaxException) {
            if (toShow) "Bad Syntax" else ""
        } catch (de: DomainException) {
            if (toShow) "Domain Error" else ""
        } catch (ie: ImaginaryException) {
            if (toShow) "Complex number" else ""
        } catch (bnf: BaseNotFoundException) {
            if (toShow) "Invalid log statement" else ""
        } catch (e: Exception) {
            if (toShow) {
                if (e.message?.contains("Unsupported Operation") == true) {
                    "Unsupported Operation"
                } else {
                    throw e
                }
            } else {
                ""
            }
        }
        tvResult.text = result.toString()
    }

    private fun smoothScrollToEnd() {
        launch {
            delay(100)
            displayScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT)
        }
    }

    private fun TextView.animClear() {
        launch {
            this@animClear.animate().alpha(0f).duration = 300
            delay(300)
            this@animClear.text = ""
            this@animClear.animate().alpha(1f)
        }
    }

}
