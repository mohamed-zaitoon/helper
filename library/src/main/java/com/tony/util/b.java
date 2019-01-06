  /* Orginal file: b.java
bgteam.assitant@outlook.com
\com.tony.util*/
package com.tony.util;
import java.util.List;
import java.util.List;

  import java.util.List;


  public final class b

  {

	
  	private static String st;

	
  	private static String ste;
	
  	public static String a(String str){
		
		
  		return b(str);
	
  		}

	
  	private static String b(String str)
	
  	{
		
  		ste = l001422(80);
		
  		try {
            
  			ste = new String(android.util.Base64.decode(str, 0));
        
  			} catch (Exception e) {
            
  			e.printStackTrace();
            
  			ste = l001422(134) + e.getMessage();
        
  			}
		
		
  		return ste;
	
  		}
	
	
  	public static String c(String str){
		
  		return d(str);
	
  		}

	
  	private static String d(String str)
	
  	{
		
  		st = l001422(197);
		
  		try {
            
  			st =  android.util.Base64.encodeToString(str.getBytes(), 0);
        
  			} catch (Exception e) {
            
  			e.printStackTrace();
            
  			st =  l001422(250) + e.getMessage();
        
  			}
		
		
		
  		return st;
	
  		}

 
  	static String l001422(int l001421){
	 
  		byte[] l001=null;
	 
  		try{ 
	 
  			if (l001421==-1) 
		 
  			{ if (l001421==-2) {}  
		   
  				else if (l001421==-3) {}   
		   
  				else if (l001421==-4) {}  
	   
  				}  
	  
  			if (l001421==80){ 
		
  				l001=new byte[] {};

		 
  				for (int l001423=0; l001423<l001.length; l001423++) 
		 
  				{l001[l001423]=(byte)(l001[l001423]^l001421);} 
		 
  				{return new String(l001,l001320(502));}  
		 
  				} 
	  
  			if (l001421==134){ 
		
  				l001=new byte[] {-61,-2,-27,-29,-10,-14,-17,-23,-24,-68,-90};

		 
  				for (int l001423=0; l001423<l001.length; l001423++) 
		 
  				{l001[l001423]=(byte)(l001[l001423]^l001421);} 
		 
  				{return new String(l001,l001320(620));}  
		 
  				} 
	  
  			if (l001421==197){ 
		
  				l001=new byte[] {};

		 
  				for (int l001423=0; l001423<l001.length; l001423++) 
		 
  				{l001[l001423]=(byte)(l001[l001423]^l001421);} 
		 
  				{return new String(l001,l001320(706));}  
		 
  				} 
	  
  			if (l001421==250){ 
		
  				l001=new byte[] {-65,-126,-103,-97,-118,-114,-109,-107,-108,-64,-38};

		 
  				for (int l001423=0; l001423<l001.length; l001423++) 
		 
  				{l001[l001423]=(byte)(l001[l001423]^l001421);} 
		 
  				{return new String(l001,l001320(824));}  
		 
  				} 

  			}catch(Exception e){ return null;	}	 return null;

  		}

  	
 static String l001320(int l00132){
	 byte[] l001314=null;
	 try{ 
	 if (l00132==-1) 
		 { if (l00132==-2) {}  
		   else if (l00132==-3) {}   
		   else if (l00132==-4) {}  
	   }  
	  if (l00132==502){ 
		l001314=new byte[] {-93,-94,-80,-37,-50};

		 for (int l001321=0; l001321<l001314.length; l001321++) 
		 {l001314[l001321]=(byte)(l001314[l001321]^l00132);} 
		 {return new String(l001314,"UTF-8");}  
		 } 
	  if (l00132==620){ 
		l001314=new byte[] {57,56,42,65,84};

		 for (int l001321=0; l001321<l001314.length; l001321++) 
		 {l001314[l001321]=(byte)(l001314[l001321]^l00132);} 
		 {return new String(l001314,"UTF-8");}  
		 } 
	  if (l00132==706){ 
		l001314=new byte[] {-105,-106,-124,-17,-6};

		 for (int l001321=0; l001321<l001314.length; l001321++) 
		 {l001314[l001321]=(byte)(l001314[l001321]^l00132);} 
		 {return new String(l001314,"UTF-8");}  
		 } 
	  if (l00132==824){ 
		l001314=new byte[] {109,108,126,21,0};

		 for (int l001321=0; l001321<l001314.length; l001321++) 
		 {l001314[l001321]=(byte)(l001314[l001321]^l00132);} 
		 {return new String(l001314,"UTF-8");}  
		 } 
}catch(Exception e){ return null;	}	 return null;
}/**/
}

  