package com.example.a10pahlawanindonesia

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter (private val listHero: ArrayList<President>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
//        val tvNamaNegara: TextView? = itemView.findViewById(R.id.Edt_Nama_Negara)
//        val tvPeriodeMenjabat: TextView = itemView.findViewById(R.id.Edt_Periode_Menjabat)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo, country, period) = listHero[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description
//        holder.tvNamaNegara?.text = country
//        holder.tvPeriodeMenjabat.text = period

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu Memilih " + listHero[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()

            val intentDetail = Intent(holder.itemView.context, DetailActivity::class.java)
            intentDetail.putExtra("key_president", listHero[holder.adapterPosition])

            holder.itemView.context.startActivity(intentDetail, ActivityOptionsCompat.makeSceneTransitionAnimation(holder.itemView.context as Activity).toBundle())
        }

    }

    override fun getItemCount(): Int = listHero.size
}


