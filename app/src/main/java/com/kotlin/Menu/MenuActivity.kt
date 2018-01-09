package com.kotlin.Menu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.kotlin.lesson1.R
import java.util.*

/**
 * Created by vijayaraj_s on 09/01/18.
 */

class MenuActivity : AppCompatActivity() {

    //Variable Declaration
    var mMenuList: ListView? = null
    var mMenuAdapter: MenuAdapter? = null

    var mMenuData: List<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_menuactivity);

        mMenuData = Arrays.asList(*resources.getStringArray(R.array.MenuList))

        mMenuList = findViewById<ListView>(R.id.lessonlist)
        mMenuAdapter = MenuAdapter(this, mMenuData)
        (mMenuList as ListView).adapter = mMenuAdapter
        mMenuAdapter?.notifyDataSetChanged()


        // On Click Listener
        (mMenuList as ListView).onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, mMenuData?.get(i).toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
