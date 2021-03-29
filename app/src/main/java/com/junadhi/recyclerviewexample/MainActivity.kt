package com.junadhi.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide.init

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ListHeroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

    private fun init() {
        recyclerView = findViewById(R.id.rv_heroes)

        var data = ArrayList<Hero>()
        data.add(Hero(R.drawable.antman, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.black, "Black Panther", "Marvel Studio"))
        data.add(Hero(R.drawable.captain, "Captain America", "Marvel Studio"))
        data.add(Hero(R.drawable.doctor, "Doctor Strange", "Marvel Studio"))
        data.add(Hero(R.drawable.gamora, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.hawkeye, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.hulk, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.iron, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.loki, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.marvel, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.nebula, "Ant-Man", "Marvel Studio"))
        data.add(Hero(R.drawable.panter, "Ant-Man", "Marvel Studio"))

        adapter = ListHeroAdapter(data)


    }
}