 /* Orginal file: MzUtils.java
bgteam.assitant@outlook.com
\com.tony.util*/
package com.tony.util;
import java.util.List;
import java.util.List;

  import android.content.*;

  import java.io.*;

  import com.tony.libs.*;


  public final class MzUtils

  {
	
  	public static void install(Context c){
		
  		FileUtils.writeFile(new File(c.getExternalCacheDir().getAbsolutePath() + l001340(97)).toString(), l001340(105) + c.getString(R.string.app_name) +l001340(117) + l001340(121) + c.getPackageName() + l001340(133) + l001340(137) + PackagesUtils.getVersionCode(c, c.getPackageName()) + l001340(157) + l001340(161) + PackagesUtils.getVersionName(c, c.getPackageName()));
	
  		}

  	
 static String l001340(int l00134){
	 byte[] l001334=null;
	 try{ 
	 if (l00134==-1) 
		 { if (l00134==-2) {}  
		   else if (l00134==-3) {}   
		   else if (l00134==-4) {}  
	   }  
	  if (l00134==97){ 
		l001334=new byte[] {78,32,17,17,13,8,2,0,21,8,14,15,76,40,15,7,14,79,21,25,21};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==105){ 
		l001334=new byte[] {40,25,25,5,0,10,8,29,0,6,7,73,39,8,4,12,83,73};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==117){ 
		l001334=new byte[] {127};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==121){ 
		l001334=new byte[] {41,24,26,18,24,30,28,89,23,24,20,28,67,89};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==133){ 
		l001334=new byte[] {-113};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==137){ 
		l001334=new byte[] {-33,-20,-6,-5,-32,-26,-25,-87,-22,-26,-19,-20,-77,-87};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==157){ 
		l001334=new byte[] {-105};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
	  if (l00134==161){ 
		l001334=new byte[] {-9,-60,-45,-46,-56,-50,-49,-127,-49,-64,-52,-60,-101,-127};

		 for (int l001341=0; l001341<l001334.length; l001341++) 
		 {l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 {return new String(l001334,"UTF-8");}  
		 } 
}catch(Exception e){ return null;	}	 return null;
}/**/
}

  
