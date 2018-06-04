package com.systembug.stetho;

import android.content.Context;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;

public class StethoSetup {
    public static void setup(Context context) {
        Stetho.initializeWithDefaults(context);
    }

    public static void setupOkhttp(OkHttpClient.Builder builder) {
        builder.addNetworkInterceptor(new StethoInterceptor());
    }
}
