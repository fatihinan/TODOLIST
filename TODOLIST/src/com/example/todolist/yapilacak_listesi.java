package com.example.todolist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
		
		
		TextView [] text_view_dizisi;
		text_view_dizisi = new TextView [24];
		
		text_view_dizisi[0]=textview_0_1;
		text_view_dizisi[1]=textview_1_2;
		text_view_dizisi[2]=textview_2_3;
		text_view_dizisi[3]=textview_3_4;
		text_view_dizisi[4]=textview_4_5;
		text_view_dizisi[5]=textview_5_6;
		text_view_dizisi[6]=textview_6_7;
		text_view_dizisi[7]=textview_7_8;
		text_view_dizisi[8]=textview_8_9;
		text_view_dizisi[9]=textview_9_10;
		text_view_dizisi[10]=textview_10_11;
		text_view_dizisi[11]=textview_11_12;
		text_view_dizisi[12]=textview_12_13;
		text_view_dizisi[13]=textview_13_14;
		text_view_dizisi[14]=textview_14_15;
		text_view_dizisi[15]=textview_15_16;
		text_view_dizisi[16]=textview_16_17;
		text_view_dizisi[17]=textview_17_18;
		text_view_dizisi[18]=textview_18_19;
		text_view_dizisi[19]=textview_19_20;
		text_view_dizisi[20]=textview_20_21;
		text_view_dizisi[21]=textview_21_22;
		text_view_dizisi[22]=textview_22_23;
		text_view_dizisi[23]=textview_23_24;
		
		String str_dosya_ismi = MainActivity.str_day + "_" + MainActivity.str_month + "_" + MainActivity.str_year + ".xml";
		for(int i=0,j=0,z=-1 ; i<24;i++,j++)
		{	
			if(j%10==0)
				z++;
			
			String name="saat_"+(z%10)+(j%10)+"_"+(z%10)+((j%10)+1); 
		    if(XMLEtiketVerisiOku("TODO", str_dosya_ismi, "saatler", name)!="")
		    {
				text_view_dizisi[j].setText(XMLEtiketVerisiOku("TODO", str_dosya_ismi,"saatler", name));
		    }
		   
		}
		

		
		
		textview_0_1.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_0_1.getText().toString();
		            textview_0_1.setText(text);
		        } 
		    }
		}
		);
		textview_1_2.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {   
		        	String text = textview_1_2.getText().toString();
		        	textview_1_2.setText(text);
		        } 
		    }
		}
		);
		textview_2_3.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_2_3.getText().toString();
		        	textview_2_3.setText(text);
		        } 
		    }
		}
		);
		textview_3_4.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_3_4.getText().toString();
		        	textview_3_4.setText(text);
		        } 
		    }
		}
		);
		textview_4_5.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_4_5.getText().toString();
		        	textview_4_5.setText(text);
		        } 
		    }
		}
		);
		textview_5_6.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_5_6.getText().toString();
		        	textview_5_6.setText(text);
		        } 
		    }
		}
		);
		textview_6_7.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_6_7.getText().toString();
		        	textview_6_7.setText(text);
		        } 
		    }
		}
		);
		textview_7_8.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_7_8.getText().toString();
		        	textview_7_8.setText(text);
		        } 
		    }
		}
		);
		textview_8_9.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_8_9.getText().toString();
		        	textview_8_9.setText(text);
		        } 
		    }
		}
		);
		textview_9_10.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_9_10.getText().toString();
		        	textview_9_10.setText(text);
		        } 
		    }
		}
		);
		textview_10_11.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_10_11.getText().toString();
		        	textview_10_11.setText(text);
		        } 
		    }
		}
		);
		textview_11_12.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_11_12.getText().toString();
		        	textview_11_12.setText(text);
		        } 
		    }
		}
		);
		textview_12_13.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_12_13.getText().toString();
		        	textview_12_13.setText(text);
		        } 
		    }
		}
		);
		textview_13_14.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_13_14.getText().toString();
		        	textview_13_14.setText(text);
		        } 
		    }
		}
		);
		textview_14_15.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_14_15.getText().toString();
		        	textview_14_15.setText(text);
		        } 
		    }
		}
		);
		textview_15_16.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_15_16.getText().toString();
		        	textview_15_16.setText(text);
		        } 
		    }
		}
		);
		textview_16_17.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_16_17.getText().toString();
		        	textview_16_17.setText(text);
		        } 
		    }
		}
		);
		textview_17_18.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_17_18.getText().toString();
		        	textview_17_18.setText(text);
		        } 
		    }
		}
		);
		textview_18_19.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_18_19.getText().toString();
		        	textview_18_19.setText(text);
		        } 
		    }
		}
		);
		textview_19_20.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_19_20.getText().toString();
		        	textview_19_20.setText(text);
		        } 
		    }
		}
		);
		textview_20_21.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_20_21.getText().toString();
		        	textview_20_21.setText(text);
		        } 
		    }
		}
		);
		textview_21_22.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_21_22.getText().toString();
		        	textview_21_22.setText(text);
		        } 
		    }
		}
		);
		textview_22_23.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_22_23.getText().toString();
		        	textview_22_23.setText(text);
		        } 
		    }
		}
		);
		textview_23_24.setOnFocusChangeListener(new View.OnFocusChangeListener()
		{
		    @Override
		    public void onFocusChange(View v, boolean hasFocus)
		    {
		        if (!hasFocus)
		        {
		        	String text = textview_23_24.getText().toString();
		        	textview_23_24.setText(text);
		        } 
		    }
		}
		);
	}
	
	
	public String XMLEtiketVerisiOku( String str_dosya_klasoru, 
	 		 String str_XML_dosyasi_ismi,
	 		 String str_ust_etiket,
	 	     String str_veri_okunacak_etiket
		   )
	{
		
		/**
		* Okunacak verinin tutulaca�� de�i�lken olu�turulmu�tur.
		* De�i�kene varsay�lan de�eri verilmi�tir.
		*/
		String str_okunan_veri="" ;
		
		try
		{
			/**
			* Dosyay� a�mak i�in ayar fonksiyonu �a�r�lmaktad�r. 
			*/
			Document doc_belge =DosyaAcmaAyari( str_dosya_klasoru, str_XML_dosyasi_ismi ); /*Dosya a�mak i�in ilgili fonksiyon �a�r�lmaktad�r.*/
			
			/**
			* ��erisinde de�i�iklik yap�lmak istenen etiketler, NodeList tipinde
			* etiketlere atand�. Okunmak istenen de�er str_okunan_veri de�i�kenine atand�.
			*/
			NodeList ust_etiketler = doc_belge.getElementsByTagName(str_ust_etiket);
			
			for ( int i = 0; i < ust_etiketler.getLength(); i++ )
			{
				NodeList etiketler = ust_etiketler.item(i).getChildNodes();
				
				for ( int j = 0; j < etiketler.getLength(); j++ )
				{
					Node eleman = etiketler.item(j);
					
					if( str_veri_okunacak_etiket.equals( eleman.getNodeName() ) )
					{   
						str_okunan_veri=eleman.getTextContent();
					}
				}
			}
		}
		catch ( Exception e ) 
		{	
			e.printStackTrace();
		}
		
		/**
		* Okunan de�er geri d�nd�r�lm��t�r.
		*/
		
		return str_okunan_veri;
	}
	
	public Document DosyaAcmaAyari( String str_dosya_klasoru,
			   String str_XML_dosyasi_ismi 
			 )
	{
		try
		{	
	
		DocumentBuilderFactory belge_uretici = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder belge_yapici = belge_uretici.newDocumentBuilder();
		
		Document doc_belge = null;

		try 
		{
			doc_belge = belge_yapici.parse( new File( "/sdcard/" + str_dosya_klasoru + "/" + str_XML_dosyasi_ismi) );
			
			doc_belge.normalizeDocument(); 
			
			return doc_belge;
			} 
			catch ( SAXException e ) 
			{
				e.printStackTrace();
				return doc_belge;
			} 
			catch ( IOException e ) 
			{
				e.printStackTrace();
				return doc_belge;
			}
		} 
		catch ( ParserConfigurationException e ) 
		{
			e.printStackTrace();
			return null;
		}		
	}
	
	
	
	   public void DosyaKaydet( String str_klasor_adi,
								   	String str_dosya_adi,
								   	String str_kaydedilecek_dosya
								  )
	   	{
		   
			try 
			{
				String str_dizin = "/mnt/sdcard/" + str_klasor_adi + "/" + str_dosya_adi;
				
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
	    
		
	   public String BelgedenStringYarat( Document doc_belge )
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
	   
	   
	   public void Iptal(View view)
	   {
		    Animation tiklama_animasyonu = AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
			view.startAnimation(tiklama_animasyonu);
			Intent ana_ekran = new Intent (this,MainActivity.class);
			ana_ekran.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			startActivity(ana_ekran);
	   }
	   
	   public void Kaydet(View view)
		{
		   
		    Animation tiklama_animasyonu = AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
			view.startAnimation(tiklama_animasyonu);
			
			Document doc_belge = YeniDosyaAcmaAyari(); 
			
	   		Element kok_eleman = doc_belge.createElement( "saatler" );	
	   		doc_belge.appendChild(kok_eleman );
	   		
	   		Element eleman_00_01 = doc_belge.createElement("saat_00_01");
	   		Element eleman_01_02 = doc_belge.createElement("saat_01_02");
	   		Element eleman_02_03 = doc_belge.createElement("saat_02_03");
	   		Element eleman_03_04 = doc_belge.createElement("saat_03_04");
	   		Element eleman_04_05 = doc_belge.createElement("saat_04_05");
	   		Element eleman_05_06 = doc_belge.createElement("saat_05_06");
	   		Element eleman_06_07 = doc_belge.createElement("saat_06_07");
	   		Element eleman_07_08 = doc_belge.createElement("saat_07_08");
	   		Element eleman_08_09 = doc_belge.createElement("saat_08_09");
	   		Element eleman_09_10 = doc_belge.createElement("saat_09_10");
	   		Element eleman_10_11 = doc_belge.createElement("saat_10_11");
	   		Element eleman_11_12 = doc_belge.createElement("saat_11_12");
	   		Element eleman_12_13 = doc_belge.createElement("saat_12_13");
	   		Element eleman_13_14 = doc_belge.createElement("saat_13_14");
	   		Element eleman_14_15 = doc_belge.createElement("saat_14_15");
	   		Element eleman_15_16 = doc_belge.createElement("saat_15_16");
	   		Element eleman_16_17 = doc_belge.createElement("saat_16_17");
	   		Element eleman_17_18 = doc_belge.createElement("saat_17_18");
	   		Element eleman_18_19 = doc_belge.createElement("saat_18_19");
	   		Element eleman_19_20 = doc_belge.createElement("saat_19_20");
	   		Element eleman_20_21 = doc_belge.createElement("saat_20_21");
	   		Element eleman_21_22 = doc_belge.createElement("saat_21_22");
	   		Element eleman_22_23 = doc_belge.createElement("saat_22_23");
	   		Element eleman_23_24 = doc_belge.createElement("saat_23_24");

	   		
	   		eleman_00_01.setTextContent(textview_0_1.getText().toString());
	   		eleman_01_02.setTextContent(textview_1_2.getText().toString());
	   		eleman_02_03.setTextContent(textview_2_3.getText().toString());
	   		eleman_03_04.setTextContent(textview_3_4.getText().toString());
	   		eleman_04_05.setTextContent(textview_4_5.getText().toString());
	   		eleman_05_06.setTextContent(textview_5_6.getText().toString());
	   		eleman_06_07.setTextContent(textview_6_7.getText().toString());
	   		eleman_07_08.setTextContent(textview_7_8.getText().toString());
	   		eleman_08_09.setTextContent(textview_8_9.getText().toString());
	   		eleman_09_10.setTextContent(textview_9_10.getText().toString());
	   		eleman_10_11.setTextContent(textview_10_11.getText().toString());
	   		eleman_11_12.setTextContent(textview_11_12.getText().toString());
	   		eleman_12_13.setTextContent(textview_12_13.getText().toString());
	   		eleman_13_14.setTextContent(textview_13_14.getText().toString());
	   		eleman_14_15.setTextContent(textview_14_15.getText().toString());
	   		eleman_15_16.setTextContent(textview_15_16.getText().toString());
	   		eleman_16_17.setTextContent(textview_16_17.getText().toString());
	   		eleman_17_18.setTextContent(textview_17_18.getText().toString());
	   		eleman_18_19.setTextContent(textview_18_19.getText().toString());
	   		eleman_19_20.setTextContent(textview_19_20.getText().toString());
	   		eleman_20_21.setTextContent(textview_20_21.getText().toString());
	   		eleman_21_22.setTextContent(textview_21_22.getText().toString());
	   		eleman_22_23.setTextContent(textview_22_23.getText().toString());
	   		eleman_23_24.setTextContent(textview_23_24.getText().toString());
	   		
	   		
	   		kok_eleman.appendChild(eleman_00_01);
	   		kok_eleman.appendChild(eleman_01_02);
	   		kok_eleman.appendChild(eleman_02_03);
	   		kok_eleman.appendChild(eleman_03_04);
	   		kok_eleman.appendChild(eleman_04_05);
	   		kok_eleman.appendChild(eleman_05_06);
	   		kok_eleman.appendChild(eleman_06_07);
	   		kok_eleman.appendChild(eleman_07_08);
	   		kok_eleman.appendChild(eleman_08_09);
	   		kok_eleman.appendChild(eleman_09_10);
	   		kok_eleman.appendChild(eleman_10_11);
	   		kok_eleman.appendChild(eleman_11_12);
	   		kok_eleman.appendChild(eleman_12_13);
	   		kok_eleman.appendChild(eleman_13_14);
	   		kok_eleman.appendChild(eleman_14_15);
	   		kok_eleman.appendChild(eleman_15_16);
	   		kok_eleman.appendChild(eleman_16_17);
	   		kok_eleman.appendChild(eleman_17_18);
	   		kok_eleman.appendChild(eleman_18_19);
	   		kok_eleman.appendChild(eleman_19_20);
	   		kok_eleman.appendChild(eleman_20_21);
	   		kok_eleman.appendChild(eleman_21_22);
	   		kok_eleman.appendChild(eleman_22_23);
			kok_eleman.appendChild(eleman_23_24);
	   		
	        String str_string_belgeden = BelgedenStringYarat( doc_belge );
	   		
	        String str_dosya_ismi = MainActivity.str_day + "_" + MainActivity.str_month + "_" + MainActivity.str_year + ".xml";
	        
	   		DosyaKaydet( "TODO", str_dosya_ismi, str_string_belgeden );

	}  
	   
	   public void EmailYolla(String subject, String body, String chooserTitle) 
	   {
		   Intent mailIntent = new Intent();
		   mailIntent.setAction(Intent.ACTION_SEND);
		   mailIntent.setType("message/rfc822");
		   mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {""});
		   mailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
		   mailIntent.putExtra(Intent.EXTRA_TEXT, body);
		   startActivity(Intent.createChooser(mailIntent, chooserTitle));
		 }	

}




