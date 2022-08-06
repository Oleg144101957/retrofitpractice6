package com.vishnevskiypro.retrofitpractice6.screens.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice6.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice6.models.beznal.BeznalichkaItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){

    private var secondMoneyList = emptyList<BeznalichkaItem>()

    inner class SecondViewHolder(val binding: ItemMoneyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(ItemMoneyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        val item = secondMoneyList[position]
        holder.binding.apply {
            itemName.text = item.ccy
            itemBuy.text = item.buy
            itemSale.text = item.sale
        }
    }


    override fun getItemCount() = secondMoneyList.size

    fun setList(list: List<BeznalichkaItem>){
        secondMoneyList = list
        notifyDataSetChanged()
    }
}