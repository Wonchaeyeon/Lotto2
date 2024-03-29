package kr.hs.emirim.yeon8091.lotto2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
    val lottoImageStartId=R.drawable.ball_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
       // Toast.makeText(this,"ResultActivity 입니다..", Toast.LENGTH_SHORT).show()


        val result=intent.getIntegerArrayListExtra("result")

        val name=intent.getStringExtra("name")


        val constellation=intent.getStringExtra("constellation")
        resultLabel.text="랜덤으로 생성된\n로또번호입니다"

        if(!TextUtils.isEmpty(name)){
            resultLabel.text="${name}님의\n${SimpleDateFormat("yyyy년 MM월 dd일")
                .format(Date())}\n로또 번호 입니다"
        }
        if (!TextUtils.isEmpty(name)){
            resultLabel.text="${constellation}의 \n ${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())}\n 로또번호입니다."
        }

       result?.let {
           updateLottoBallImage(result.sortedBy { it })
       }

    }

    fun updateLottoBallImage(result: List<Int>){
        if(result.size < 6) return
        imageView1.setImageResource(lottoImageStartId+(result[0]-1))
        imageView2.setImageResource(lottoImageStartId+(result[1]-1))
        imageView3.setImageResource(lottoImageStartId+(result[2]-1))
        imageView4.setImageResource(lottoImageStartId+(result[3]-1))
        imageView5.setImageResource(lottoImageStartId+(result[4]-1))
        imageView6.setImageResource(lottoImageStartId+(result[5]-1))
    }
}
