package com.vishnevskiypro.retrofitpractice6.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice6.R
import com.vishnevskiypro.retrofitpractice6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: FirstAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val mViewModel = ViewModelProvider(this).get(FirstViewModel::class.java)

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        adapter = FirstAdapter()
        recyclerView = binding.rvFirst
        recyclerView.adapter = adapter
        mViewModel.getNalichkaViewModel()
        mViewModel.myMoneyListLiveData.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })

        return binding.root
    }
}