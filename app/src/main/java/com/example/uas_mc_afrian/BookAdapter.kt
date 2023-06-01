package com.example.uas_mc_afrian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter (private val BookList: ArrayList<Book>): RecyclerView.Adapter<BookAdapter.ImageViewHolder>() {

    var onItemClick : ((Book) -> Unit)? = null

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id._image)
        val imageTitle: TextView = itemView.findViewById(R.id._title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,
            false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return BookList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val Book = BookList[position]
        holder.imageView.setImageResource(Book.imageSource)
        holder.imageTitle.text = Book.ImageTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(Book)
        }
    }
}