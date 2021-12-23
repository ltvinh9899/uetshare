package ie.app.uetstudents.ui.notifications

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import ie.app.uetstudents.utils.PreferenceUtils

class MyApplication : Application() {

    public  final val CHANNEL_ID : String = "CHANNEL_1"
    override fun onCreate() {
        super.onCreate()
        PreferenceUtils.init(this)
        createChannelNotification()
    }

    fun createChannelNotification()
    {
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
        {
            val channel : NotificationChannel = NotificationChannel(
                CHANNEL_ID,
                "CHANNEL_1",
                NotificationManager.IMPORTANCE_DEFAULT
            )
             val manager : NotificationManager = getSystemService(NotificationManager::class.java)
            if (manager!= null)
            {
                manager.createNotificationChannel(channel)
            }

        }
    }
}