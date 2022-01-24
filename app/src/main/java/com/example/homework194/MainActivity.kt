package com.example.homework194

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {


    private var titeList= mutableListOf<String>()
    private var descList= mutableListOf<String>()
    private var imageList= mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        posttolist()


    //      indicator.setBackgroundColor(Color.BLUE);


        royxat.setOnClickListener {
            Toast.makeText(this, "Intent to somewhere", Toast.LENGTH_SHORT).show()
        }
        skip.setOnClickListener {
            view_pager2.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }

//        skip.setOnClickListener {
//            Intent(applicationContext,MainActivity::class.java)
//        }


        view_pager2.adapter=ViewPagerAdapter(titeList,descList, imageList )
        view_pager2.orientation= ViewPager2.ORIENTATION_HORIZONTAL


        val indicator= findViewById<CircleIndicator3>(R.id.indicator)

        indicator.setViewPager(view_pager2)


    }
    private fun addtolist(title:String, description: String, image:Int){
        titeList.add(title)
        descList.add(description)
        imageList.add(image)
    }
    private fun posttolist(){


        addtolist(" Geoaxborot","Geoaxborot moduli orqali siz o'zingizga yaqin " +
                "bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin", R.drawable.homework1931)

        addtolist("Huquqiy axborot","Huquqiy axborot moduli orqali siz migratsiya sohasiga" +
                " oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin", R.drawable.homework1932)

        addtolist(" To'lovlar xizmatlari","To'lov xizmatlari moduli orqali siz" +
                " masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin", R.drawable.homework1933)

        addtolist("Qo'shimcha imkoniyat","Qo'shimcha imkoniyatlar" +
                " moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin", R.drawable.homework194)

    }
}