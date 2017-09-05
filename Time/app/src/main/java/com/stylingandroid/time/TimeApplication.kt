package com.stylingandroid.time

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

/**
 * Created by user on 9/1/2017.
 */

class TimeApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        AndroidThreeTen.init(this)
    }
}
