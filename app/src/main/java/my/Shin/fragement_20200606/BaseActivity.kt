package my.Shin.fragement_20200606

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setupEvent()
    abstract fun setValues()

}