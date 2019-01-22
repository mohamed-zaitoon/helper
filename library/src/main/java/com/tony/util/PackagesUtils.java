  /* Orginal file: PackagesUtils.java
bgteam.assitant@outlook.com
\com.tony.util*/
package com.tony.util;
import java.util.List;
//import java.util.List;
  import java.util.List;
//import java.util.List;
  import java.util.List;

  //import java.util.List;
  import java.util.List;

  //import java.util.List;
  import java.util.List;
  
  //import android.app.*;
  import android.app.*;
 
  //import android.content.pm.PackageManager.*;
  import android.content.pm.PackageManager.*;
 
  //import android.content.*;
  import android.content.*;

  //import com.tony.app.*;
  import com.tony.app.*;

  //import android.content.pm.*;
  import android.content.pm.*;

  //import android.os.*;
  import android.os.*;

  //public final class PackagesUtils
  public final class PackagesUtils
  
  //{
  {


  	
  	//private static boolean b = false;
  	private static boolean b = false;


	
  	//private static Bundle bundle;
  	private static Bundle bundle;
	
  	//public static String getMetaData(Context mz, String pg, String meta){
  	public static String getMetaData(Context mz, String pg, String meta){

		
  		//try {
  		try {
				
  			//bundle =  mz.getPackageManager().getApplicationInfo(pg, 128).metaData;
  			bundle =  mz.getPackageManager().getApplicationInfo(pg, 128).metaData;
			
  			//}
  			}
			
  		//catch (PackageManager.NameNotFoundException e)
  		catch (PackageManager.NameNotFoundException e)
			
  		//{}
  		{}
        
 
  		//catch (NullPointerException e)
  		catch (NullPointerException e)
 
  		//{
  		{
         
			
		
  			//}
  			}
		
  		//return bundle.getString(meta, l000433(197));
  		return bundle.getString(meta, l000030(197));
	
  		//}
  		}
	
	
  	//public static String getVersionCode(Context mz, String pg){
  	public static String getVersionCode(Context mz, String pg){

		
  		//String str = l000433(228);
  		String str = l000030(228);
		
  		//try {
  		try {
			
  			//int i = mz.getPackageManager().getPackageInfo(pg, 0).versionCode;
  			int i = mz.getPackageManager().getPackageInfo(pg, 0).versionCode;
          
  			//str = String.valueOf(i).trim();
  			str = String.valueOf(i).trim();
			
			
  			//}
  			}
		
  		//catch (NameNotFoundException e)
  		catch (NameNotFoundException e)
		
  		//{
  		{
        
  			//}
  			}
		
  		//return str;
  		return str;
	
  		//}
  		}
	
	
	
  	//public static String getVersionName(Context mz, String pg){
  	public static String getVersionName(Context mz, String pg){

		
  		//String str = l000433(320);
  		String str = l000030(320);
		
  		//try {
  		try {
			
  			//str = mz.getPackageManager().getPackageInfo(pg, 0).versionName;
  			str = mz.getPackageManager().getPackageInfo(pg, 0).versionName;
        
  			//}
  			}
		
  		//catch (NameNotFoundException e)
  		catch (NameNotFoundException e)
		
  		//{
  		{
        
  			//}
  			}
		
  		//return str;
  		return str;
	
  		//}
  		}
	
  	//public static boolean isAppEnabled(Context activity, String str) {
  	public static boolean isAppEnabled(Context activity, String str) {
		
  		//try {
  		try {
			
			    	
			
  			//if (activity.getPackageManager().getApplicationInfo(str, 0).enabled) {
  			if (activity.getPackageManager().getApplicationInfo(str, 0).enabled) {
							
				
  				//b = true;
  				b = true;
				
  				//}
  				} 
			
  			//else {
  			else {
				    		
  				//b = false;
  				b = false;
				
  				//}
  				}
			
  			//} catch (NameNotFoundException e) {
  			} catch (NameNotFoundException e) {
			
  			//b = false;
  			b = false;
			
  			//}
  			}
		
  		//return b;
  		return b;
		
  		//}
  		}
			
		
	
  	

  	//private static String l000433(int l000434){
  	private static String l000030(int l000434){
	 
  		//byte[] l00044=null;
  		byte[] l00044=null;
	 
  		//try{
  		try{ 
	 
  			//if (l000434==-1)
  			if (l000434==-1) 
		 
  			//{ if (l000434==-2) {}
  			{ if (l000434==-2) {}  
		   
  				//else if (l000434==-3) {}
  				else if (l000434==-3) {}   
		   
  				//else if (l000434==-4) {}
  				else if (l000434==-4) {}  
	   
  				//}
  				}  
	  
  			//if (l000434==197){
  			if (l000434==197){ 
		
  				//l00044=new byte[] {};
  				l00044=new byte[] {};

		 
  				//for (int l000440=0; l000440<l00044.length; l000440++)
  				for (int l000440=0; l000440<l00044.length; l000440++) 
		 
  				//{l00044[l000440]=(byte)(l00044[l000440]^l000434);}
  				{l00044[l000440]=(byte)(l00044[l000440]^l000434);} 
		 
  				//{return new String(l00044,l001312(720));}
  				{return new String(l00044,l001312(720));}  
		 
  				//}
  				} 
	  
  			//if (l000434==228){
  			if (l000434==228){ 
		
  				//l00044=new byte[] {};
  				l00044=new byte[] {};

		 
  				//for (int l000440=0; l000440<l00044.length; l000440++)
  				for (int l000440=0; l000440<l00044.length; l000440++) 
		 
  				//{l00044[l000440]=(byte)(l00044[l000440]^l000434);}
  				{l00044[l000440]=(byte)(l00044[l000440]^l000434);} 
		 
  				//{return new String(l00044,l001312(806));}
  				{return new String(l00044,l001312(806));}  
		 
  				//}
  				} 
	  
  			//if (l000434==320){
  			if (l000434==320){ 
		
  				//l00044=new byte[] {};
  				l00044=new byte[] {};

		 
  				//for (int l000440=0; l000440<l00044.length; l000440++)
  				for (int l000440=0; l000440<l00044.length; l000440++) 
		 
  				//{l00044[l000440]=(byte)(l00044[l000440]^l000434);}
  				{l00044[l000440]=(byte)(l00044[l000440]^l000434);} 
		 
  				//{return new String(l00044,l001312(892));}
  				{return new String(l00044,l001312(892));}  
		 
  				//}
  				} 

  			//}catch(Exception e){ return null;	}	 return null;
  			}catch(Exception e){ return null;	}	 return null;

  		//}
  		}

  	
 //static String l001312(int l001311){
  	static String l001312(int l001311){
	 //byte[] l001310=null;
  		byte[] l001310=null;
	 //try{
  		try{ 
	 //if (l001311==-1)
  			if (l001311==-1) 
		 //{ if (l001311==-2) {}
  			{ if (l001311==-2) {}  
		   //else if (l001311==-3) {}
  				else if (l001311==-3) {}   
		   //else if (l001311==-4) {}
  				else if (l001311==-4) {}  
	   //}
  				}  
	  //if (l001311==720){
  			if (l001311==720){ 
		//l001310=new byte[] {-123,-124,-106,-3,-24};
  				l001310=new byte[] {-123,-124,-106,-3,-24};

		 //for (int l001313=0; l001313<l001310.length; l001313++)
  				for (int l001313=0; l001313<l001310.length; l001313++) 
		 //{l001310[l001313]=(byte)(l001310[l001313]^l001311);}
  				{l001310[l001313]=(byte)(l001310[l001313]^l001311);} 
		 //{return new String(l001310,"UTF-8");}
  				{return new String(l001310,l001220(1026));}  
		 //}
  				} 
	  //if (l001311==806){
  			if (l001311==806){ 
		//l001310=new byte[] {115,114,96,11,30};
  				l001310=new byte[] {115,114,96,11,30};

		 //for (int l001313=0; l001313<l001310.length; l001313++)
  				for (int l001313=0; l001313<l001310.length; l001313++) 
		 //{l001310[l001313]=(byte)(l001310[l001313]^l001311);}
  				{l001310[l001313]=(byte)(l001310[l001313]^l001311);} 
		 //{return new String(l001310,"UTF-8");}
  				{return new String(l001310,l001220(1115));}  
		 //}
  				} 
	  //if (l001311==892){
  			if (l001311==892){ 
		//l001310=new byte[] {41,40,58,81,68};
  				l001310=new byte[] {41,40,58,81,68};

		 //for (int l001313=0; l001313<l001310.length; l001313++)
  				for (int l001313=0; l001313<l001310.length; l001313++) 
		 //{l001310[l001313]=(byte)(l001310[l001313]^l001311);}
  				{l001310[l001313]=(byte)(l001310[l001313]^l001311);} 
		 //{return new String(l001310,"UTF-8");}
  				{return new String(l001310,l001220(1204));}  
		 //}
  				} 
//}catch(Exception e){ return null;	}	 return null;
  			}catch(Exception e){ return null;	}	 return null;
//}
  		}
//}
  	
 static String l001220(int l00122){
	 byte[] l001214=null;
	 try{ 
	 if (l00122==-1) 
		 { if (l00122==-2) {}  
		   else if (l00122==-3) {}   
		   else if (l00122==-4) {}  
	   }  
	  if (l00122==1026){ 
		l001214=new byte[] {87,86,68,47,58};

		 for (int l001221=0; l001221<l001214.length; l001221++) 
		 {l001214[l001221]=(byte)(l001214[l001221]^l00122);} 
		 {return new String(l001214,"UTF-8");}  
		 } 
	  if (l00122==1115){ 
		l001214=new byte[] {14,15,29,118,99};

		 for (int l001221=0; l001221<l001214.length; l001221++) 
		 {l001214[l001221]=(byte)(l001214[l001221]^l00122);} 
		 {return new String(l001214,"UTF-8");}  
		 } 
	  if (l00122==1204){ 
		l001214=new byte[] {-31,-32,-14,-103,-116};

		 for (int l001221=0; l001221<l001214.length; l001221++) 
		 {l001214[l001221]=(byte)(l001214[l001221]^l00122);} 
		 {return new String(l001214,"UTF-8");}  
		 } 
}catch(Exception e){ return null;	}	 return null;
}/**/
}//
  	


  //
  	