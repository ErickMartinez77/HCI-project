package edu.upb.hciproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


val titles = arrayOf("ZARA","Forever 21","Bershka","LEVI'S", "Calvin Klein")
val details = arrayOf(
    "Vestidos ,Faldas , Pantalones",
    "Poleras, Sudaderas, Canguros",
    "Camisetas, Abrigos, Vestidos",
    "Jeans, Poleras, Canguros",
    "Boxers, Gorras, Poleras")
var images = intArrayOf(
    R.drawable.zara_logo,
    R.drawable.forever_21_logo,
    R.drawable.bershka_logo,
    R.drawable.levis_logo,
    R.drawable.calvinklein_logo)

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init{
            itemImage =itemView.findViewById(R.id.item_image)
            itemTitle =itemView.findViewById(R.id.item_title)
            itemDetail =itemView.findViewById(R.id.item_details)
        }
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v=LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview, viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text=titles[i]
        viewHolder.itemDetail.text=details[i]
        viewHolder.itemImage.setImageResource(images[i])

    }

    override fun getItemCount(): Int {
        return titles.size
    }
}