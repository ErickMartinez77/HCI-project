package edu.upb.hciproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.upb.hciproject.CustomAdapter
import edu.upb.hciproject.R

class FeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_feed, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CustomAdapter()

        recyclerView.layoutManager =LinearLayoutManager(context)
        recyclerView.adapter=adapter
    }

    //override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_feed)
//
    //    val recyclerView =findViewById<RecyclerView>(R.id.recyclerView)
    //    val adapter = CustomAdapter()
//
    //    recyclerView.layoutManager =LinearLayoutManager(this)
    //    recyclerView.adapter=adapter
    //}
}