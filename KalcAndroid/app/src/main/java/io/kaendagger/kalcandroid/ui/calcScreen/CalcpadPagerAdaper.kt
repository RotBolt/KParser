package io.kaendagger.kalcandroid.ui.calcScreen

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.lang.Exception

class CalcpadPagerAdaper(
    fm: FragmentManager,
    val onCalcBtnClickListener: OnCalcBtnClickListener
) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int) = when (position) {
        0 -> {
            KeypadFragment().also {
                it.onCalcBtnClickListener = onCalcBtnClickListener
            }
        }
        1 -> FuncpadFragment()
        else -> throw Exception("Illegal Page")
    }

    override fun getCount() = 2

}