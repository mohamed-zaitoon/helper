  /* Orginal file: PackagesUtils.java
bgteam.assitant@outlook.com
\com.tony.util*/
package com.tony.util;
import java.util.List;
import java.util.List;

  import java.util.List;

  import java.util.List;
  
  import android.app.*;
 
  import android.content.pm.PackageManager.*;
 
  import android.content.*;

  import com.tony.app.*;

  import android.content.pm.*;

  import android.os.*;

  public final class PackagesUtils
  
  {


  	
  	private static boolean b = false;


	
  	private static Bundle bundle;
	
  	public static String getMetaData(Context mz, String pg, String meta){

		
  		try {
				
  			bundle =  mz.getPackageManager().getApplicationInfo(pg, 128).metaData;
			
  			}
			
  		catch (PackageManager.NameNotFoundException e)
			
  		{}
        
 
  		catch (NullPointerException e)
 
  		{
         
			
		
  			}
		
  		return bundle.getString(meta, l000433(197));
	
  		}
	
	
  	public static String getVersionCode(Context mz, String pg){

		
  		String str = l000433(228);
		
  		try {
			
  			int i = mz.getPackageManager().getPackageInfo(pg, 0).versionCode;
          
  			str = String.valueOf(i).trim();
			
			
  			}
		
  		catch (NameNotFoundException e)
		
  		{
        
  			}
		
  		return str;
	
  		}
	
	
	
  	public static String getVersionName(Context mz, String pg){

		
  		String str = l000433(320);
		
  		try {
			
  			str = mz.getPackageManager().getPackageInfo(pg, 0).versionName;
        
  			}
		
  		catch (NameNotFoundException e)
		
  		{
        
  			}
		
  		return str;
	
  		}
	
  	public static boolean isAppEnabled(Context activity, String str) {
		
  		try {
			
			    	
			
  			if (activity.getPackageManager().getApplicationInfo(str, 0).enabled) {
							
				
  				b = true;
				
  				} 
			
  			else {
				    		
  				b = false;
				
  				}
			
  			} catch (NameNotFoundException e) {
			
  			b = false;
			
  			}
		
  		return b;
		
  		}
			
		
	
  	

  	private static String l000433(int l000434){
	 
  		byte[] l00044=null;
	 
  		try{ 
	 
  			if (l000434==-1) 
		 
  			{ if (l000434==-2) {}  
		   
  				else if (l000434==-3) {}   
		   
  				else if (l000434==-4) {}  
	   
  				}  
	  
  			if (l000434==197){ 
		
  				l00044=new byte[] {};

		 
  				for (int l000440=0; l000440<l00044.length; l000440++) 
		 
  				{l00044[l000440]=(byte)(l00044[l000440]^l000434);} 
		 
  				{return new String(l00044,l001312(720));}  
		 
  				} 
	  
  			if (l000434==228){ 
		
  				l00044=new byte[] {};

		 
  				for (int l000440=0; l000440<l00044.length; l000440++) 
		 
  				{l00044[l000440]=(byte)(l00044[l000440]^l000434);} 
		 
  				{return new String(l00044,l001312(806));}  
		 
  				} 
	  
  			if (l000434==320){ 
		
  				l00044=new byte[] {};

		 
  				for (int l000440=0; l000440<l00044.length; l000440++) 
		 
  				{l00044[l000440]=(byte)(l00044[l000440]^l000434);} 
		 
  				{return new String(l00044,l001312(892));}  
		 
  				} 

  			}catch(Exception e){ return null;	}	 return null;

  		}

  	
 static String l001312(int l001311){
	 byte[] l001310=null;
	 try{ 
	 if (l001311==-1) 
		 { if (l001311==-2) {}  
		   else if (l001311==-3) {}   
		   else if (l001311==-4) {}  
	   }  
	  if (l001311==720){ 
		l001310=new byte[] {-123,-124,-106,-3,-24};

		 for (int l001313=0; l001313<l001310.length; l001313++) 
		 {l001310[l001313]=(byte)(l001310[l001313]^l001311);} 
		 {return new String(l001310,"UTF-8");}  
		 } 
	  if (l001311==806){ 
		l001310=new byte[] {115,114,96,11,30};

		 for (int l001313=0; l001313<l001310.length; l001313++) 
		 {l001310[l001313]=(byte)(l001310[l001313]^l001311);} 
		 {return new String(l001310,"UTF-8");}  
		 } 
	  if (l001311==892){ 
		l001310=new byte[] {41,40,58,81,68};

		 for (int l001313=0; l001313<l001310.length; l001313++) 
		 {l001310[l001313]=(byte)(l001310[l001313]^l001311);} 
		 {return new String(l001310,"UTF-8");}  
		 } 
}catch(Exception e){ return null;	}	 return null;
}/**/
}


  