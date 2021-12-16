package edu.upb.hciproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.hciproject.R
import edu.upb.hciproject.model.Chat

class ChatDetailsFragment: Fragment() {

    var chat: Chat? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_messages, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val ivAvatarUser = view.findViewById<ImageView>(R.id.ivAvatarUser)
        val tvUserName = view.findViewById<TextView>(R.id.tvUserName)
        val tvMessageUser = view.findViewById<TextView>(R.id.tvMessageUser)

        chat = arguments?.getSerializable("chat") as Chat?
        chat?.let{
            Glide.with(view)
                .load(it.imageUrl)
                .transform(CenterCrop(), RoundedCorners(24))
                .into(ivAvatarUser)
            tvUserName.text = it.from
            tvMessageUser.text = it.message
        }
    }

}