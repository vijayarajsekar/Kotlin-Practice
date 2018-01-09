package com.kotlin.Menu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.kotlin.lesson1.R

/**
 * Created by vijayaraj_s on 09/01/18.
 */

class MenuAdapter(context: Context, mData: List<String>?) : BaseAdapter() {

    private val mInflator: LayoutInflater
    var mMenuData: List<String>? = null

    init {
        this.mInflator = LayoutInflater.from(context)
        this.mMenuData = mData
    }

    override fun getCount(): Int {
        return mMenuData!!.size
    }

    override fun getItem(position: Int): Any {
        return mMenuData!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {

        val view: View?
        val vh: ListRowHolder

        if (convertView == null) {

            view = this.mInflator.inflate(R.layout.menulistitems, parent, false)
            vh = ListRowHolder(view)
            view.tag = vh

        } else {

            view = convertView
            vh = view.tag as ListRowHolder

        }

        vh.label.text = mMenuData!!.get(position).toString()

        return view

    }
}

private class ListRowHolder(row: View?) {

    public val label: TextView

    init {
        this.label = row?.findViewById<TextView>(R.id.mtitle)!!
    }

}
