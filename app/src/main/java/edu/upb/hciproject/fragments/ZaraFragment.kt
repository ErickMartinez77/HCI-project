package edu.upb.hciproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.upb.hciproject.Forever21Adapter
import edu.upb.hciproject.R
import edu.upb.hciproject.ZaraAdapter

class ZaraFragment : Fragment(){

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.activity_zara, container,false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

            val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView2)
            val adapter = ZaraAdapter()

            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter=adapter
        }
    }
