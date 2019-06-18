package com.example.fastlnedemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.push.Push



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "e4ecb1b0-c5f5-4f8d-bfaa-6ba04a1faf4f",
            Analytics::class.java, Crashes::class.java
        )



        AppCenter.start(application, "{Your App Secret}", Push::class.java)
    }
}
