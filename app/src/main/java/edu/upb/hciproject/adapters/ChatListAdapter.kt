package edu.upb.hciproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.hciproject.R
import edu.upb.hciproject.model.Chat

class ChatListAdapter: RecyclerView.Adapter<ChatListViewHolder>() {
    val elementList: MutableList<Chat> = mutableListOf()

    fun addAll(newElementList: MutableList<Chat>){
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_chat,parent,false)
        return ChatListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        holder.bind(elementList[position])
    }

    override fun getItemCount(): Int {
        return elementList.size
    }
}

class ChatListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
    private val ivChat = itemView.findViewById<ImageView>(R.id.ivChat)
    private val tvName = itemView.findViewById<TextView>(R.id.tvName)
    private val tvMessage = itemView.findViewById<TextView>(R.id.tvMessage)
    private val tvTime = itemView.findViewById<TextView>(R.id.tvTime)

    fun bind(chat:Chat){
        Glide.with(itemView)
            .load(chat.imageUrl)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(ivChat)
        tvName.text = chat.from
        tvMessage.text = chat.message
        tvTime.text = "${chat.date}"
    }
}