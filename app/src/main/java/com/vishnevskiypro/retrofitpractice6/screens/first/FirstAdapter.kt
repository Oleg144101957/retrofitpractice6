package com.vishnevskiypro.retrofitpractice6.screens.first

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice6.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice6.models.nal.NalichkaModelItem

class FirstAdapter : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    private var firstMoneyList = emptyList<NalichkaModelItem>()

    inner class FirstViewHolder(val binding: ItemMoneyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(ItemMoneyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }


    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        val item = firstMoneyList[position]
        holder.binding.apply {
            itemName.text = item.ccy
            itemBuy.text = item.buy
            itemSale.text = item.sale
        }
    }


    override fun getItemCount() = firstMoneyList.size

    fun setList(list: List<NalichkaModelItem>){
        firstMoneyList = list
        notifyDataSetChanged()
    }
}