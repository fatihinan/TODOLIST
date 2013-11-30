package com.example.todolist;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class yapilacak_listesi extends Activity
{
	
	TextView textview_0_1;
	TextView textview_1_2;
	TextView textview_2_3;
	TextView textview_3_4;
	TextView textview_4_5;
	TextView textview_5_6;
	TextView textview_6_7;
	TextView textview_7_8;
	TextView textview_8_9;
	TextView textview_9_10;
	TextView textview_10_11;
	TextView textview_11_12;
	TextView textview_12_13;
	TextView textview_13_14;
	TextView textview_14_15;
	TextView textview_15_16;
	TextView textview_16_17;
	TextView textview_17_18;
	TextView textview_18_19;
	TextView textview_19_20;
	TextView textview_20_21;
	TextView textview_21_22;
	TextView textview_22_23;
	TextView textview_23_24;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yapilacak_listesi);
		
		
		
		
		textview_0_1 = (TextView) findViewById(R.id.editText1);
		textview_1_2 = (TextView) findViewById(R.id.editText2);
		textview_2_3 = (TextView) findViewById(R.id.editText3);
		textview_3_4 = (TextView) findViewById(R.id.editText4);
		textview_4_5 = (TextView) findViewById(R.id.editText5);
		textview_5_6 = (TextView) findViewById(R.id.editText6);
		textview_6_7 = (TextView) findViewById(R.id.editText7);
		textview_7_8 = (TextView) findViewById(R.id.editText8);
		textview_8_9 = (TextView) findViewById(R.id.editText9);
		textview_9_10 = (TextView) findViewById(R.id.editText10);
		textview_10_11 = (TextView) findViewById(R.id.editText11);
		textview_11_12 = (TextView) findViewById(R.id.editText12);
		textview_12_13 = (TextView) findViewById(R.id.editText13);
		textview_13_14 = (TextView) findViewById(R.id.editText14);
		textview_14_15 = (TextView) findViewById(R.id.editText15);
		textview_15_16 = (TextView) findViewById(R.id.editText16);
		textview_16_17 = (TextView) findViewById(R.id.editText17);
		textview_17_18 = (TextView) findViewById(R.id.editText18);
		textview_18_19 = (TextView) findViewById(R.id.editText19);
		textview_19_20 = (TextView) findViewById(R.id.editText20);
		textview_20_21 = (TextView) findViewById(R.id.editText21);
		textview_21_22 = (TextView) findViewById(R.id.editText22);
		textview_22_23 = (TextView) findViewById(R.id.editText23);
		textview_23_24 = (TextView) findViewById(R.id.editText24);
	}
	
	
	 public Document YeniDosyaAcmaAyari ()
	    {
	        try
	        {
	        	DocumentBuilderFactory belge_ureteci = DocumentBuilderFactory.newInstance();
	        	
		   		DocumentBuilder belge_yapici = belge_ureteci.newDocumentBuilder();
		   		
		   		Document doc_belge = belge_yapici.newDocument();
		   		
		   		return doc_belge;
		    } 
	        catch ( ParserConfigurationException e ) 
	        {
				e.printStackTrace();
				return null;
		    }		
	    }
	    
		

}


