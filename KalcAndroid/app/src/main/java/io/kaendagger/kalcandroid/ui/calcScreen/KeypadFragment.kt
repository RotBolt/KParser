package io.kaendagger.kalcandroid.ui.calcScreen


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.kaendagger.kalcandroid.R
import kotlinx.android.synthetic.main.layout_keypad.*

class KeypadFragment : Fragment(), View.OnClickListener {

    lateinit var onCalcBtnClickListener: OnCalcBtnClickListener
    lateinit var clrLongClick: () -> Unit
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_keypad, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachListeners()
    }

    private fun attachListeners() {
        val basicKeyBtns = arrayOf(
            btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSub, btnMul, btnDivide, btnDecimal,
            btnEq, btnClr, btnBracketOpen, btnBracketClose
        )

        for (btn in basicKeyBtns) {
            btn.setOnClickListener(this)
        }

        btnClr.setOnLongClickListener {
            clrLongClick()
            true
        }
    }

    override fun onClick(v: View) {
        with(onCalcBtnClickListener) {
            when (v.id) {
                R.id.btn0 -> onCalcBtnClick("0")
                R.id.btn1 -> onCalcBtnClick("1")
                R.id.btn2 -> onCalcBtnClick("2")
                R.id.btn3 -> onCalcBtnClick("3")
                R.id.btn4 -> onCalcBtnClick("4")
                R.id.btn5 -> onCalcBtnClick("5")
                R.id.btn6 -> onCalcBtnClick("6")
                R.id.btn7 -> onCalcBtnClick("7")
                R.id.btn8 -> onCalcBtnClick("8")
                R.id.btn9 -> onCalcBtnClick("9")
                R.id.btnAdd -> onCalcBtnClick("+")
                R.id.btnSub -> onCalcBtnClick("-")
                R.id.btnMul -> onCalcBtnClick("*")
                R.id.btnDivide -> onCalcBtnClick("/")
                R.id.btnDecimal -> onCalcBtnClick(".")
                R.id.btnBracketClose -> onCalcBtnClick(")")
                R.id.btnBracketOpen -> onCalcBtnClick("(")
                R.id.btnEq -> onCalcBtnClick("=")
                R.id.btnClr -> onCalcBtnClick("C")
            }
        }
    }
}
