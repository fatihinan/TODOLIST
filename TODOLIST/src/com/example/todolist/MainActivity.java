package com.example.todolist;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	public static CalendarView takvim;
	public static String str_year;
	public static String str_month;
	public static String str_day;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		takvim = (CalendarView) findViewById(R.id.takvim);
		
		takvim.setOnDateChangeListener(new OnDateChangeListener(){
			 
			@Override
			public void onSelectedDayChange(CalendarView view,
			int year, int month, int dayOfMonth) {
			Toast.makeText(getApplicationContext(),
			dayOfMonth +"/"+(month+1)+"/"+ year,Toast.LENGTH_LONG).show();
			
			str_year = Integer.toString(year);
			str_month = Integer.toString(month);
			str_day = Integer.toString(dayOfMonth);
			
	    	startActivity(new Intent("android.intent.action.YAPILACAK_LISTESI"));
			
			}
		
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*uygulamadan çýkmak istenildiðinde çýkmak istiyormusunuz diye soracak */
	public boolean onKeyDown(int KeyCode,KeyEvent event)
	{
		if(KeyCode==KeyEvent.KEYCODE_BACK && event.getRepeatCount()==0)
		{
			try{
				AlertDialog.Builder builder=new AlertDialog.Builder(this);
				builder.setTitle("Çýkmak istediðinize emin misiniz?").setCancelable(false).setPositiveButton("EVET", new OnClickListener(){
					
						
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
						android.os.Process.killProcess(android.os.Process.myPid());
						
					}
					
				}).setNegativeButton("IPTAL",new OnClickListener(){
					public void onClick(DialogInterface dialog,int which){
						
					}
				});
				
				AlertDialog alert=builder.create();
				alert.show();
				
				return super.onKeyDown(KeyCode, event);
				
			}catch(IllegalStateException e){
				e.printStackTrace();
			}
			return true;
		}
		return  super.onKeyDown(KeyCode, event);
	}

	
}
