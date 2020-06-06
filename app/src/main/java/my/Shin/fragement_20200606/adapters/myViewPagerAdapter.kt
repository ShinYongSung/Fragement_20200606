package my.Shin.fragement_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import my.Shin.fragement_20200606.fragments.FirstFragment
import my.Shin.fragement_20200606.fragments.SecondFragment

class myViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        }
        else if (position == 1) {
            return SecondFragment()
        }
        // () 붙이는게 객체화 한다.
        else {
            return ThirdFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}