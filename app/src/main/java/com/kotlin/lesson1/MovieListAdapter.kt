package com.kotlin.lesson1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/**
 * Created by vijayaraj_s on 05/01/18.
 */
public class MovieListAdapter(private val mCtx: Context, moviesList: List<MovieModel>) : BaseAdapter() {

    private var mData = ArrayList<MovieModel>()

    init {
        this.mData = moviesList as ArrayList<MovieModel>
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var mRowView: View? = null
        val mInflater = mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        mRowView = mInflater.inflate(R.layout.listitems, null)

        val mTitle = mRowView.findViewById<TextView>(R.id.mtitle)
        val mYear = mRowView.findViewById<TextView>(R.id.myear)
        var mImageTile = mRowView.findViewById<ImageView>(R.id.movieimage)

        mTitle.text = mData.get(position).mTitle
        mYear.text = "Year : " + mData.get(position).mYear.toString()

        Glide.with(mCtx).load(mData.get(position).mImageUrl).into(mImageTile)

        return mRowView

    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mData.size
    }

}