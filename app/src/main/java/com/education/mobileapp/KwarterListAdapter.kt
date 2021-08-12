package com.education.mobileapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KwarterListAdapter(private val localDataSet: Array<String>) : RecyclerView.Adapter<KwarterListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_view, viewGroup, false)
        return ViewHolder(viewGroup.context, view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv.text = localDataSet[position]
        holder.img.setImageResource(R.drawable.copy_of_wika_skwela)
    }

    override fun getItemCount(): Int {
        return localDataSet.size
    }

    inner class ViewHolder(context: Context, itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val tv: TextView
        val img: ImageView
        private val context: Context

        override fun onClick(v: View) {
            val position = layoutPosition
            topic_name =tv.text.toString()
            val intent = Intent(context, Pdfview::class.java)
            context.startActivity(intent)
        }

        init {
            tv = itemView.findViewById<View>(R.id.title) as TextView
            img = itemView.findViewById<View>(R.id.logo) as ImageView
            this.context = context
            itemView.setOnClickListener(this)
        }
    }

    companion object {
        var topic_name:String =""
    }

}