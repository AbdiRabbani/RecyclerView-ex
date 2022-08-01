package com.example.recyclerview_ex.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_ex.data.DataSiswa
import com.example.recyclerview_ex.databinding.ItemNamaBinding

class Adapter(private val listSiswa: ArrayList<DataSiswa>) :
    RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemNamaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        ItemNamaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listSiswa[position]) {
                name.text = nama
                age.text = umur
            }
        }
    }

    override fun getItemCount(): Int = listSiswa.size
}