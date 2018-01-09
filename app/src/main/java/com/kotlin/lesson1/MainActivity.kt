package com.kotlin.lesson1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Variable Declaration
    var mMovieslist = ArrayList<MovieModel>();

    var mListview: ListView? = null
    var mAdapter: MovieListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Preparing Model List With Sample Data
        prepareData()

        // Initializing ListView and Adapter
        mListview = findViewById<ListView>(R.id.mlist)
        mAdapter = MovieListAdapter(this, mMovieslist)

        // Setting Adapter
        (mListview as ListView).adapter = mAdapter
        mAdapter?.notifyDataSetChanged()

        // On Click Listener
        (mListview as ListView).onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, mMovieslist?.get(i)?.mTitle, Toast.LENGTH_SHORT).show()
        }

    }

    // Preparing Dummy Data

    private fun prepareData() {

        var movies = MovieModel("Dawn of the Planet of the Apes", 2014, "https://api.androidhive.info/json/movies/1.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("District 9", 2009, "https://api.androidhive.info/json/movies/2.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("Transformers: Age of Extinction", 2014, "https://api.androidhive.info/json/movies/3.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("X-Men: Days of Future Past", 2014, "https://api.androidhive.info/json/movies/4.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("The Machinist", 2004, "https://api.androidhive.info/json/movies/5.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("The Last Samurai", 2003, "https://api.androidhive.info/json/movies/6.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("The Amazing Spider-Man 2", 2014, "https://api.androidhive.info/json/movies/7.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("Tangled", 2010, "https://api.androidhive.info/json/movies/8.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("Rush", 2013, "https://api.androidhive.info/json/movies/9.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("Drag Me to Hell", 2009, "https://api.androidhive.info/json/movies/10.jpg\"")
        mMovieslist.add(movies)

        movies = MovieModel("Despicable Me 2", 2013, "https://api.androidhive.info/json/movies/11.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("Kill Bill: Vol. 1", 2003, "https://api.androidhive.info/json/movies/12.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("A Bug's Life", 1998, "https://api.androidhive.info/json/movies/13.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("Life of Brian", 1972, "https://api.androidhive.info/json/movies/14.jpg")
        mMovieslist.add(movies)

        movies = MovieModel("How to Train Your Dragon", 2010, "https://api.androidhive.info/json/movies/15.jpg")
        mMovieslist.add(movies)


    }
}




