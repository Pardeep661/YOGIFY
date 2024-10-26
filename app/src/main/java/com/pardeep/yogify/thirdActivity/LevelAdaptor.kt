package com.pardeep.yogify.thirdActivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.pardeep.yogify.R

class LevelAdaptor() : RecyclerView.Adapter<LevelAdaptor.ViewHolder>() {

    class ViewHolder(var view : View) : RecyclerView.ViewHolder(view){
        var image = view.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_custom_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(R.drawable.beginner_pose)

    }

}