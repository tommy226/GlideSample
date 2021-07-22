package com.sungbin.myrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sungbin.myrecyclerview.data.MyModel
import com.sungbin.myrecyclerview.databinding.ItemLayoutBinding

class MyRecyclerAdapter : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>() {
    private var modelList = ArrayList<MyModel>()

    fun setList(modelList: ArrayList<MyModel>){
        this.modelList = modelList
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyRecyclerAdapter.ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyRecyclerAdapter.ViewHolder, position: Int) {
        holder.setUp(modelList.get(position))
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    inner class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setUp(myModel: MyModel){
            binding.data = myModel
        }
    }
}