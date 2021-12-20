package edu.upb.hciproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


val ropa = arrayOf("Sudadera","Polera","Canguro")
val precio = arrayOf(
    "140$                                                                                       ",
    "50$                                                                                        ",
    "30$                                                                                        ")

var imagen = intArrayOf(
    R.drawable.sudadera_forever21,
    R.drawable.polera_forever21,
    R.drawable.canguro_forever21,
 )

class Forever21Adapter: RecyclerView.Adapter<Forever21Adapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagen: ImageView
        var itemRopa: TextView
        var itemPrecio: TextView

        init{
            itemImagen =itemView.findViewById(R.id.item_image)
            itemRopa =itemView.findViewById(R.id.item_title)
            itemPrecio =itemView.findViewById(R.id.item_details)
        }
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v= LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview, viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemRopa.text=ropa[i]
        viewHolder.itemPrecio.text=precio[i]
        viewHolder.itemImagen.setImageResource(imagen[i])

    }

    override fun getItemCount(): Int {
        return ropa.size
    }
}