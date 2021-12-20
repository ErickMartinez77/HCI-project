package edu.upb.hciproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import edu.upb.hciproject.R
import edu.upb.hciproject.fragments.ChatFragment
import edu.upb.hciproject.fragments.FeedFragment
import edu.upb.hciproject.replaceFragment

class MainMenuActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    private val chatFragment = ChatFragment()
    private val feedFragment = FeedFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        supportActionBar?.hide()

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menuItemChat -> {
                    replaceFragment(R.id.container, chatFragment)
                }
                R.id.menuItemFeed -> {
                    replaceFragment(R.id.container, feedFragment)
                }
            }
            true
        }
    }
}