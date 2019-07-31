package kr.hs.emirim.yeon8091.lotto2

import android.content.Intent
import android.content.QuickViewConstants
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*
import java.util.jar.Attributes

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button.setOnClickListener {
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/"))
            startActivity(Intent)
        }

    }

    fun goConstellation(view: View){
        val intent = Intent(this, ConstellationActivity::class.java)
        startActivity(intent)
    }

}
