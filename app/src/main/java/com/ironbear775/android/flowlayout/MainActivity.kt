package com.ironbear775.android.flowlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ironbear775.android.flowlayoutlibrary.FlowLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = arrayListOf(
        "蜘蛛侠：英雄远征",
        "鼠胆英雄",
        "狂热",
        "阿拉丁与神灯2",
        "希望与反抗",
        "天马行空的铃木",
        "结伴婚礼",
        "薇塔与弗吉尼亚",
        "飞翔吧！埼玉",
        "极限逃生",
        "巧虎大飞船历险记",
        "不能说的游戏",
        "我们是小僵尸",
        "居同居2(2019)",
        "最大的小小农场",
        "徒手攀岩",
        "漫威崛起：乐队之战"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.forEach {
            val view = MovieView(this)
            view.setName(it)
            flowLayout.addView(view)

        }

        var addCount = 0
        AddViewButton.setOnClickListener {
            if (addCount >= list.size) {
                addCount = 0
            }
            val view = MovieView(this)
            view.setName(list[addCount])
            flowLayout.addView(view)
            addCount++
        }

        var gravityCount = 0
        changeGravity.setOnClickListener {
            when (gravityCount) {
                0 -> {
                    flowLayout.setGravity(FlowLayout.CENTER)
                    changeGravity.text = "center"
                    gravityCount = 1
                }
                1 -> {
                    flowLayout.setGravity(FlowLayout.END)
                    changeGravity.text = "end"
                    gravityCount = 2
                }
                2 -> {
                    flowLayout.setGravity(FlowLayout.START)
                    changeGravity.text = "start"
                    gravityCount = 0
                }
            }
        }
    }
}























