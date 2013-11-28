package com.example.todolist;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	CalendarView takvim;

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
			dayOfMonth +"/"+month+"/"+ year,Toast.LENGTH_LONG).show();
			
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

}
