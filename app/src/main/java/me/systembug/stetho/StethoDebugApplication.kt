package me.systembug.stetho

import android.content.Context
import com.systembug.stetho.StethoSetup

class StethoDebugApplication : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        StethoSetup.setup(this);
    }
}