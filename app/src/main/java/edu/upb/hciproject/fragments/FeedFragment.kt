package edu.upb.hciproject.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.upb.hciproject.CustomAdapter
import edu.upb.hciproject.R
import edu.upb.hciproject.activities.LoginActivity

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
        adapter.setOnItemClickListener(object:CustomAdapter.onBrandClickListener{
            override fun onItemClick(position: Int) {

                if (position===0){val fragment = ZaraFragment().apply {}
                    val ft = parentFragmentManager.beginTransaction()
                    ft.remove(this@FeedFragment)
                    ft.add(R.id.container, fragment)
                    ft.addToBackStack(null)
                    ft.commit()


                }else if (position===1){
                    val fragment = Forever21Fragment().apply {}
                    val ft = parentFragmentManager.beginTransaction()
                    ft.remove(this@FeedFragment)
                    ft.add(R.id.container, fragment)
                    ft.addToBackStack(null)
                    ft.commit()
                }
            }

        })

    }

  
}