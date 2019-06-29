package com.ohjooyeo.ohjooyeoandroid.components.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.ohjooyeo.ohjooyeoandroid.R
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var disposeBag = CompositeDisposable()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.tab_list -> {
                message.setText(R.string.title_list)
                return@OnNavigationItemSelectedListener true
            }
            R.id.tab_advertisement -> {
                message.setText(R.string.title_advertisement)
                return@OnNavigationItemSelectedListener true
            }
            R.id.tab_more
            -> {
                message.setText(R.string.title_more)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
