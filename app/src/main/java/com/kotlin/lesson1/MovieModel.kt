package com.kotlin.lesson1

/**
 * Created by vijayaraj_s on 05/01/18.
 */

class MovieModel {
    var mTitle: String = ""
    var mYear: Int = 0
    var mImageUrl: String = ""

    constructor(title: String, year: Int, image: String) {
        this.mTitle = title;
        this.mYear = year;
        this.mImageUrl = image
    }
}