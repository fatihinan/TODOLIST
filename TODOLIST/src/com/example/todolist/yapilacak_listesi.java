package com.example.todolist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Element;
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
	
	
	
	
	
	
	
	   public void DosyaKaydet( String str_klasor_adi,
								   	String str_dosya_adi,
								   	String str_kaydedilecek_dosya
								  )
	   	{
			try 
			{
				String str_dizin = "/sdcard/" + str_klasor_adi + "/" + str_dosya_adi;
				
				File yeni_dosya = new File( str_dizin );
				
				
				if( !yeni_dosya.exists() )
				{
					yeni_dosya.getParentFile().mkdir();	    				
				}
				
				
				yeni_dosya.createNewFile();
				
				FileOutputStream dosya_cikti = new FileOutputStream( yeni_dosya );
				
				OutputStreamWriter cikti_yazici = new OutputStreamWriter( dosya_cikti );
				
				cikti_yazici.append( str_kaydedilecek_dosya );
				
				cikti_yazici.close();
				
				dosya_cikti.close();
			} 
			catch ( Exception e )
			{
			}
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
	    
		
	   public String Im_BelgedenStringYarat( Document doc_belge )
	   {
	       try
	       {
				DOMSource belge_kaynagi = new DOMSource( doc_belge );
				
				StringWriter yazici = new StringWriter();
				
				StreamResult sonuc = new StreamResult( yazici );
	          
				TransformerFactory donusum_ureteci = TransformerFactory.newInstance();
				
				Transformer donusturucu = donusum_ureteci.newTransformer();
	          
				donusturucu.transform( belge_kaynagi, sonuc );
				
				String str_yazici = yazici.toString();
				return str_yazici;
	       }
	       catch( TransformerException ex )
	       {
				ex.printStackTrace();
				return null;
	       }
	   }
	   
	   public void Kaydet()
		{
		   
			Document doc_belge = YeniDosyaAcmaAyari(); 
			
	   		Element kok_eleman = (Element) doc_belge.createElement( "saatler" );	
	   		doc_belge.appendChild( (Node) kok_eleman );
	   		
	   		Element eleman_00_01 = (Element) doc_belge.createElement("00-01");
	   		Element eleman_01_02 = (Element) doc_belge.createElement("01-02");
	   		Element eleman_02_03 = (Element) doc_belge.createElement("02-03");
	   		Element eleman_03_04 = (Element) doc_belge.createElement("03-04");
	   		Element eleman_04_05 = (Element) doc_belge.createElement("04-05");
	   		Element eleman_05_06 = (Element) doc_belge.createElement("05-06");
	   		Element eleman_06_07 = (Element) doc_belge.createElement("06-07");
	   		Element eleman_07_08 = (Element) doc_belge.createElement("07-08");
	   		Element eleman_08_09 = (Element) doc_belge.createElement("08-09");
	   		Element eleman_09_10 = (Element) doc_belge.createElement("09-10");
	   		Element eleman_10_11 = (Element) doc_belge.createElement("10-11");
	   		Element eleman_11_12 = (Element) doc_belge.createElement("11-12");
	   		Element eleman_12_13 = (Element) doc_belge.createElement("12-13");
	   		Element eleman_13_14 = (Element) doc_belge.createElement("13-14");
	   		Element eleman_14_15 = (Element) doc_belge.createElement("14-15");
	   		Element eleman_15_16 = (Element) doc_belge.createElement("15-16");
	   		Element eleman_16_17 = (Element) doc_belge.createElement("16-17");
	   		Element eleman_17_18 = (Element) doc_belge.createElement("17-18");
	   		Element eleman_18_19 = (Element) doc_belge.createElement("18-19");
	   		Element eleman_19_20 = (Element) doc_belge.createElement("19-20");
	   		Element eleman_20_21 = (Element) doc_belge.createElement("20-21");
	   		Element eleman_21_22 = (Element) doc_belge.createElement("21-22");
	   		Element eleman_22_23 = (Element) doc_belge.createElement("22-23");
	   		Element eleman_23_00 = (Element) doc_belge.createElement("23-00");
	   		
	   		
	   		((Node) eleman_00_01).setTextContent((String) textview_0_1.getText());
	   		((Node) eleman_01_02).setTextContent((String) textview_1_2.getText());
	   		((Node) eleman_02_03).setTextContent((String) textview_2_3.getText());
	   		((Node) eleman_03_04).setTextContent((String) textview_3_4.getText());
	   		((Node) eleman_04_05).setTextContent((String) textview_4_5.getText());
	   		((Node) eleman_05_06).setTextContent((String) textview_5_6.getText());
	   		((Node) eleman_06_07).setTextContent((String) textview_6_7.getText());
	   		((Node) eleman_07_08).setTextContent((String) textview_7_8.getText());
	   		((Node) eleman_08_09).setTextContent((String) textview_8_9.getText());
	   		((Node) eleman_09_10).setTextContent((String) textview_9_10.getText());
	   		((Node) eleman_10_11).setTextContent((String) textview_10_11.getText());
	   		((Node) eleman_11_12).setTextContent((String) textview_11_12.getText());
	   		((Node) eleman_12_13).setTextContent((String) textview_12_13.getText());
	   		((Node) eleman_13_14).setTextContent((String) textview_13_14.getText());
	   		((Node) eleman_14_15).setTextContent((String) textview_14_15.getText());
	   		((Node) eleman_15_16).setTextContent((String) textview_15_16.getText());
	   		((Node) eleman_16_17).setTextContent((String) textview_16_17.getText());
	   		((Node) eleman_17_18).setTextContent((String) textview_17_18.getText());
	   		((Node) eleman_18_19).setTextContent((String) textview_18_19.getText());
	   		((Node) eleman_19_20).setTextContent((String) textview_19_20.getText());
	   		((Node) eleman_20_21).setTextContent((String) textview_20_21.getText());
	   		((Node) eleman_21_22).setTextContent((String) textview_21_22.getText());
	   		((Node) eleman_22_23).setTextContent((String) textview_22_23.getText());
	   		((Node) eleman_23_00).setTextContent((String) textview_23_24.getText());
	   		
	   		
	   		((Node) kok_eleman).appendChild((Node) eleman_00_01);
	   		((Node) kok_eleman).appendChild((Node) eleman_01_02);
	   		((Node) kok_eleman).appendChild((Node) eleman_02_03);
	   		((Node) kok_eleman).appendChild((Node) eleman_03_04);
	   		((Node) kok_eleman).appendChild((Node) eleman_04_05);
	   		((Node) kok_eleman).appendChild((Node) eleman_05_06);
	   		((Node) kok_eleman).appendChild((Node) eleman_06_07);
	   		((Node) kok_eleman).appendChild((Node) eleman_07_08);
	   		((Node) kok_eleman).appendChild((Node) eleman_08_09);
	   		((Node) kok_eleman).appendChild((Node) eleman_09_10);
	   		((Node) kok_eleman).appendChild((Node) eleman_10_11);
	   		((Node) kok_eleman).appendChild((Node) eleman_11_12);
	   		((Node) kok_eleman).appendChild((Node) eleman_12_13);
	   		((Node) kok_eleman).appendChild((Node) eleman_13_14);
	   		((Node) kok_eleman).appendChild((Node) eleman_14_15);
	   		((Node) kok_eleman).appendChild((Node) eleman_15_16);
	   		((Node) kok_eleman).appendChild((Node) eleman_16_17);
	   		((Node) kok_eleman).appendChild((Node) eleman_17_18);
	   		((Node) kok_eleman).appendChild((Node) eleman_18_19);
	   		((Node) kok_eleman).appendChild((Node) eleman_19_20);
	   		((Node) kok_eleman).appendChild((Node) eleman_20_21);
	   		((Node) kok_eleman).appendChild((Node) eleman_21_22);
	   		((Node) kok_eleman).appendChild((Node) eleman_22_23);
	   		((Node) kok_eleman).appendChild((Node) eleman_23_00);
	   		
	        String str_string_belgeden = Im_BelgedenStringYarat( doc_belge );
	   		
	   		DosyaKaydet( "", "", str_string_belgeden );

	}  
	   
	   public void EmailYolla(String subject, String body, String chooserTitle) {
		   Intent mailIntent = new Intent();
		   mailIntent.setAction(Intent.ACTION_SEND);
		   mailIntent.setType("message/rfc822");
		   mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {""});
		   mailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
		   mailIntent.putExtra(Intent.EXTRA_TEXT, body);
		   startActivity(Intent.createChooser(mailIntent, chooserTitle));
		 }	

}




