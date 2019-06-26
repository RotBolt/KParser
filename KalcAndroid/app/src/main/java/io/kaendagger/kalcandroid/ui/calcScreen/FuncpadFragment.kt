package io.kaendagger.kalcandroid.ui.calcScreen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.kaendagger.kalcandroid.R
import kotlinx.android.synthetic.main.layout_funcpad.view.*
import kotlinx.android.synthetic.main.layout_keypad.*
import kotlinx.android.synthetic.main.layout_keypad.view.*


class FuncpadFragment : Fragment(), View.OnClickListener {

    lateinit var onCalcBtnClickListener: OnCalcBtnClickListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_funcpad, container, false)

        val funcBtns = arrayOf(
            view.btnExp, view.btnPercent, view.btnFact, view.btnSqrt,
            view.btnSin, view.btnCos, view.btnTan,
            view.btnSinh, view.btnCosh, view.btnTanh,
            view.btnAsin, view.btnAcos, view.btnAtan,
            view.btnLogx, view.btnLog10, view.btnLn,
            view.btnE, view.btnPI, view.btnEqf
        )
        for (btn in funcBtns) {
            btn.setOnClickListener(this@FuncpadFragment)
        }
        return view

    }

    override fun onClick(v: View) {
        with(onCalcBtnClickListener) {
            when (v.id) {
                R.id.btnPercent -> onCalcBtnClick("%")
                R.id.btnFact -> onCalcBtnClick("!")
                R.id.btnSqrt -> onCalcBtnClick("sqrt(")
                R.id.btnSin -> onCalcBtnClick("sin(")
                R.id.btnCos -> onCalcBtnClick("cos(")
                R.id.btnTan -> onCalcBtnClick("tan(")
                R.id.btnLogx -> onCalcBtnClick("log")
                R.id.btnAsin -> onCalcBtnClick("asin(")
                R.id.btnAcos -> onCalcBtnClick("acos(")
                R.id.btnAtan -> onCalcBtnClick("atan(")
                R.id.btnLog10 -> onCalcBtnClick("log10(")
                R.id.btnSinh -> onCalcBtnClick("sinh(")
                R.id.btnCosh -> onCalcBtnClick("cosh(")
                R.id.btnTanh -> onCalcBtnClick("tanh(")
                R.id.btnLn -> onCalcBtnClick("ln(")
                R.id.btnE -> onCalcBtnClick("e")
                R.id.btnPI -> onCalcBtnClick("PI")
                R.id.btnExp -> onCalcBtnClick("exp(")
                R.id.btnEqf -> onCalcBtnClick("=")
            }
        }
    }
}
