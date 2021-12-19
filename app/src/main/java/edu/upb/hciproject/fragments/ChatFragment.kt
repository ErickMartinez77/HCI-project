package edu.upb.hciproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.upb.hciproject.R
import edu.upb.hciproject.adapters.ChatListAdapter
import edu.upb.hciproject.data.ChatDataSource
import edu.upb.hciproject.interfaces.OnChatItemClickListener
import edu.upb.hciproject.model.Chat

class ChatFragment: Fragment() {

    private val chatListAdapter = ChatListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chat, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvChat)
        recyclerView.adapter = chatListAdapter

        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)

        chatListAdapter.addAll(ChatDataSource.chatList)

        chatListAdapter.setOnChatItemClickListener{
            val fragment = ChatDetailsFragment().apply {
                arguments = Bundle().apply{
                    putSerializable("chat", it)
                }
            }

            val ft = parentFragmentManager.beginTransaction()
            ft.add(R.id.container, fragment)
            ft.addToBackStack("Test")
            ft.commit()
        }
    }
}