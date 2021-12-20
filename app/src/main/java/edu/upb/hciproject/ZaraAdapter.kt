package edu.upb.hciproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


val ropa1 = arrayOf("Canguro","Polera","Sudadera")
val precio1 = arrayOf(
    "100$",
    "50$",
    "200$")

var imagen1 = intArrayOf(
    R.drawable.falda_zara,
    R.drawable.pantalon_zara,
    R.drawable.vestido_zara,
)

class ZaraAdapter: RecyclerView.Adapter<ZaraAdapter.ViewHolder>(){
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
        viewHolder.itemRopa.text=ropa1[i]
        viewHolder.itemPrecio.text=precio1[i]
        viewHolder.itemImagen.setImageResource(imagen1[i])

    }

    override fun getItemCount(): Int {
        return ropa.size
    }
}