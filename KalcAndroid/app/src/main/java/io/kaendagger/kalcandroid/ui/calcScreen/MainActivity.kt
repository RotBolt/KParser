package io.kaendagger.kalcandroid.ui.calcScreen

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.HorizontalScrollView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import io.kaen.dagger.*
import io.kaendagger.kalcandroid.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Stack


class MainActivity : AppCompatActivity() {

    private val expressionHolder = StringBuilder()
    private val textSizesSP = arrayOf(70.0f, 60.0f, 50.0f, 40.0f)
    private var currentTextSizeSP = textSizesSP[0]

    private val clrStack = Stack<String>()

    private var inDegrees = false
    private val expressionParser = ExpressionParser().also {
        it.enableLog(true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      setUpTvDisplay()
        tvDisplay.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentTextSizeSP)

        setNavDrawer()
        val calcPadPagerAdaper = CalcpadPagerAdaper(
            supportFragmentManager,
            object : OnCalcBtnClickListener {
                override fun onCalcBtnClick(data: String) {
                    when (data) {
                        "=" -> showResult()
                        "C" -> {
                            clearAction()
                            adjustExpressionDisplay(true)
                        }
                        else -> {
                            displayExpression(data)
                            adjustExpressionDisplay(false)
                        }
                    }

                }
            })

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
            }
        }
        return true
    }

    private fun displayExpression(extraData: String) {
        expressionHolder.append(extraData)
        clrStack.push(extraData)
        tvDisplay.text = expressionHolder.toString()
    }

    private fun adjustExpressionDisplay(isClearAction: Boolean) {
        val scrollViewWidth = displayScrollView.width
        val tvDisplayWidth = tvDisplay.width
        Log.i("PUI", "scroll $scrollViewWidth, tvdisplay $tvDisplayWidth")

        if (!isClearAction) {
            if (tvDisplayWidth > scrollViewWidth)
                adjustTextSize(false)
        } else if (isClearAction && tvDisplayWidth < scrollViewWidth) {
            adjustTextSize(true)
        }
        tvDisplay.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentTextSizeSP)
        smoothScrollToEnd()
    }

    private fun adjustTextSize(direction: Boolean) {

        currentTextSizeSP = if (!direction) {
            when (currentTextSizeSP) {
                textSizesSP[0] -> textSizesSP[1]
                textSizesSP[1] -> textSizesSP[2]
                textSizesSP[2] -> textSizesSP[3]
                else -> textSizesSP[3]
            }
        } else {
            when (currentTextSizeSP) {
                textSizesSP[3] -> textSizesSP[2]
                textSizesSP[2] -> textSizesSP[1]
                textSizesSP[1] -> textSizesSP[0]
                else -> textSizesSP[0]
            }
        }
    }

    private fun showResult() {
        Log.i("PUI","expression ${expressionHolder}")
        val result = try {
            expressionParser.evaluate(expressionHolder.toString())
        } catch (bs: BadSyntaxException) {
            "Bad Syntax"
        } catch (de: DomainException) {
            "Domain Error"
        } catch (ie: ImaginaryException) {
            "Complex Operation not supported"
        }
        tvResult.text = result.toString()
    }

    private fun smoothScrollToEnd() {
        GlobalScope.launch {
            delay(100)
            displayScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT)
        }
    }

}
