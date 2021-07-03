package com.sungbin.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sungbin.myrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    var modelList = ArrayList<MyModel>()

    private lateinit var adapter: MyRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        for(i in 1..10){
            var myModel = MyModel(name = "성빈 $i", profileImage = "https://img.icons8.com/ios/452/kotlin.png")
            this.modelList.add(myModel)
        }

        adapter = MyRecyclerAdapter()
        adapter.setList(modelList)

        binding.run {
            recyclerview.apply {
                layoutManager = LinearLayoutManager(
                    this@MainActivity,
                    LinearLayoutManager.VERTICAL,
                    false)

                adapter = this@MainActivity.adapter
            }
        }
    }
}