package kr.hs.emirim.yeon8091.lotto2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*



//fun getShuffleLottoNumbers():MutableList<Int>{
//    val list= mutableListOf<Int>()
//    for (number in 1..45){
//        list.add(number)
//    }
//
//    list.shuffle()
//
//    return list.subList(0,6)
//}


//fun getRandomLottoNumber():Int{
//    return Random().nextInt(45)+1
//}

//fun getRandomLottoNumbers():MutableList<Int>{
//    val lottoNumbers= mutableListOf<Int>()
//
//    for (i in 1..6){
//        var number:Int=0
//        do{
//            number= getRandomLottoNumber()
//        }while (lottoNumbers.contains(number))
//
//        lottoNumbers.add(number)
//
//    }
//    return lottoNumbers
//}




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  Toast.makeText(this,"MainActivity 입니다.",Toast.LENGTH_SHORT).show()

        randomCard.setOnClickListener {
            val intent=Intent(this,ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result",ArrayList(LottoNumberMaker.getShuffleLottoNumbers()))
            startActivity(intent)
        }


        constellationCard.setOnClickListener {
            startActivity(Intent(this,ConstellationActivity::class.java))
        }

        nameCard.setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }


    }


}
