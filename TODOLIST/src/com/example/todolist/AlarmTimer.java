package com.example.todolist;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.net.Uri;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.widget.Toast;
import android.media.MediaPlayer;
import android.util.Log;

public class AlarmTimer extends BroadcastReceiver {

	final public static String ONE_TIME = "onetime";
	MediaPlayer mp=null ;
	@Override
	public void onReceive(Context context, Intent intent) {
		 PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
         PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "YOUR TAG");
         //Acquire the lock
         wl.acquire();

         //You can do the processing here update the widget/remote views.
         Bundle extras = intent.getExtras();
         StringBuilder msgStr = new StringBuilder();
         
         if(extras != null && extras.getBoolean(ONE_TIME, Boolean.FALSE)){
        	 msgStr.append("One time Timer : ");
         }
         Format formatter = new SimpleDateFormat("hh:mm:ss a");
         msgStr.append(formatter.format(new Date()));

         Toast.makeText(context, msgStr, Toast.LENGTH_LONG).show();
         
         //Release the lock
         wl.release();
         
	}
	public void SetAlarm(Context context)
    {
        AlarmManager am=(AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmTimer.class);
        intent.putExtra(ONE_TIME, Boolean.FALSE);
        PendingIntent pi = PendingIntent.getBroadcast(context, 0, intent, 0);
        //After after 30 seconds
        am.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 1000 * 10 , pi); 
    }

    public void CancelAlarm(Context context)
    {
        Intent intent = new Intent(context, AlarmTimer.class);
        PendingIntent sender = PendingIntent.getBroadcast(context, 0, intent, 0);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.cancel(sender);
    }
  
    /*alarm çaldýrma fonksiyonu*/
    private void playSound(final Context context, Uri alert) {
        
        
        Thread background = new Thread(new Runnable() {
            public void run() {
                try {
                     
                   mp.start();
                    
                } catch (Throwable t) {
                    Log.i("Animation", "Thread  exception "+t);
                }   
            }
     });
     background.start();
   }
}
