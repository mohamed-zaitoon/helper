  /* Orginal file: MzUtils.java
bgteam.assitant@outlook.com
 \com.tony.util*/
 package mz.libs.helper;

import android.Manifest;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.DrawableRes;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import androidx.annotation.Keep;
import android.os.VibrationEffect;

@Keep
@SuppressWarnings("deprecation")
public final class Helper

    //{
  {


	private static boolean b = false;


  	
        //public static File getApkFile(Context Context) throws PackageManager.NameNotFoundException{
  	public static File getApkFile(Context Context, String str) throws PackageManager.NameNotFoundException{
                //PackageManager pm = Context.getPackageManager();
  		PackageManager pm = Context.getPackageManager();

                //ApplicationInfo ai = pm.getApplicationInfo(Context.getPackageName(), 0);
  		ApplicationInfo ai = pm.getApplicationInfo(str, 0);

                //File srcFile = new File(ai.publicSourceDir);
  		File srcFile = new File(ai.publicSourceDir);


                //return srcFile;
  		return srcFile;
            //}
  		}
	public static String getLongVersionCode(Context mz, String pg){
        String str = l000030(228);

        //try {
        try {

            //int i = mz.getPackageManager().getPackageInfo(pg, 0).versionCode;
            long i =  mz.getPackageManager().getPackageInfo(pg, 0).getLongVersionCode();

            //str = String.valueOf(i).trim();
            str = String.valueOf(i).trim();


            //}
        }

        //catch (NameNotFoundException e)
        catch (PackageManager.NameNotFoundException e)

        //{
        {

            //}
        }
        
        return str;
    }
  	
      //public static String getVersionCode(Context mz, String pg){
          @Deprecated
  	public static String getVersionCode(Context mz, String pg){

		/*
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
  		catch (PackageManager.NameNotFoundException e)
		
  		//{
  		{
        
  			//}
  			}
		
  		//return str;*/
  		return "";
	
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
  		catch (PackageManager.NameNotFoundException e)
		
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
  			} catch (PackageManager.NameNotFoundException e) {
			
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


   //private static String var;
  	private static String var;

        //private static Vibrator vib;
  	private static Vibrator vib;

        //private static MediaPlayer med;
  	private static MediaPlayer med;

        //private static MzUtils.d ¢çµ;
        private static c ¢çµ;
	    //public static void setTimer(Context act, int i,TimerInterface t){
  	public static void setTimer(Activity act, int i,TimerInterface t){




                //¢çµ = new d(act, t);
  		¢çµ = new c(act, t);




                //¢çº.schedule(¢çµ, i);
  		¢çº.schedule(¢çµ, i);




            //}
  		}



        //private static Timer ¢çº = new Timer ( );
  	private static Timer ¢çº = new Timer ( );
        


        //public static void setTimerForEver(Context act, int i, TimerInterface t){
  	public static void setTimerForEver(Activity act, int i, TimerInterface t){




                //¢çµ = new d(act,t);
  		¢çµ = new c(act,t);




                //¢çº.scheduleAtFixedRate(¢çµ,0, i);
  		¢çº.scheduleAtFixedRate(¢çµ,0, i);




            //}
  		}





        //public static void startMedia(Context mz, int io){
  	public static void startMedia(Context mz, int io){


                //med = MediaPlayer.create(mz.getApplicationContext(), io);
  		med = MediaPlayer.create(mz.getApplicationContext(), io);


                //med.start();
  		med.start();


            //}
  		}


        //public static void stopMedia(){
  	public static void stopMedia(){



                //if (med.isPlaying()) {
  		if (med.isPlaying()) {


                        //med.stop();
  			med.stop();


                    //}
  			} 


            //}
  		}





        //private s  //public static String decode(String str){
  	public static String decode(String str){


                //return com.tony.util.b.a(str);
  		return mz.libs.helper.a.a(str);

            //}
  		}

        //public static String encode(String str){
  	public static String encode(String str){


    	return mz.libs.helper.a.c(str);

            //}
  		}


        
        //public static void startVibrate(Context act, long l){
  	@Deprecated
            public static void startVibrate(Context act, long l){


/*

                //vib = (Vibrator) act.getSystemService(Context.VIBRATOR_SERVICE);
  		vib = (Vibrator) act.getSystemService(Context.VIBRATOR_SERVICE);
                //if(ContextCompat.checkSelfPermission(act,Manifest.permission.VIBRATE) == PackageManager.PERMISSION_GRANTED){
  		if(ContextCompat.checkSelfPermission(act,Manifest.permission.VIBRATE) == PackageManager.PERMISSION_GRANTED){
                     //vib.vibrate(l);
  			vib.vibrate(l);
                //} else {
  			} else {
                     
                //}
				throw new IllegalAccessError(l001224(2596) +  Manifest.permission.VIBRATE);

				
				
  			}
                //}
                */
  		}


  		
        
        
        //public static int getLocationY(View v) {
  	public static int getLocationY(View v) {


                //int ¢ðº[] = new int[2];
  		int ¢ðº[] = new int[2];


                //v.getLocationInWindow(¢ðº);
  		v.getLocationInWindow(¢ðº);


                //return ¢ðº[1];
  		return ¢ðº[1];


            //}
  		}

        
        //public static int getRandom(int m, int x) {
  	public static int getRandom(int m, int x) {


                //Random random = new Random();
  		Random random = new Random();


                //return random.nextInt(x - m + 1) + m;
  		return random.nextInt(x - m + 1) + m;


            //}
  		}


        //public static float getDip(Context mz, int i){
  	public static float getDip(Context mz, int i){


                //return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, mz.getResources().getDisplayMetrics());
  		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, mz.getResources().getDisplayMetrics());


            //}
  		}

        //public static int getDisplayWidthPixels(Context mz){
  	public static int getDisplayWidthPixels(Context mz){


                //return mz.getResources().getDisplayMetrics().widthPixels;
  		return mz.getResources().getDisplayMetrics().widthPixels;


            //}
  		}


        //public static int getDisplayHeightPixels(Context mz){
  	public static int getDisplayHeightPixels(Context mz){


                //return mz.getResources().getDisplayMetrics().heightPixels;
  		return mz.getResources().getDisplayMetrics().heightPixels;


            //}
  		}



        
        
        
        //public static void blockScreenShot(Context mz){
  	public static void blockScreenShot(Context mz){


                //mz.getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
  		((Activity) mz).getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

            //}
  		}
        //public static String getBatteryLevel(Context mzAc){
  	public static int getBatteryLevel(Context mzAc){


                //BatteryManager bm = (BatteryManager)mzAc.getSystemService(mzAc.BATTERY_SERVICE);
  		BatteryManager bm = (BatteryManager)mzAc.getSystemService(mzAc.BATTERY_SERVICE);

                //int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
  		int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);

                //return Integer.toString(batLevel);
  		return batLevel;

            //}
  		}

        //public static void setLocale(Context mzAc, String lang) {
    @Deprecated
       public static void setLocale(Context mzAc, String lang) {
/*
                //Locale Language = new Locale ( lang );
  		Locale Language = new Locale ( lang );

                //Resources res = mzAc.getResources ( );
  		Resources res = mzAc.getResources ( );

                //DisplayMetrics dm = res.getDisplayMetrics();
  		DisplayMetrics dm = res.getDisplayMetrics();

                //Configuration conf = res.getConfiguration();
  		Configuration conf = res.getConfiguration();

                //conf.locale = Language;
  		conf.locale = Language;

                //res.updateConfiguration(conf, dm);
  		res.updateConfiguration(conf, dm);

*/

           
            //}
  		} 


        //public static int getLocationX(View v) {
  	public static int getLocationX(View v) {


                //int ¢ðº[] = new int[2];
  		int ¢ðº[] = new int[2];


                //v.getLocationInWindow(¢ðº);
  		v.getLocationInWindow(¢ðº);


                //return ¢ðº[0];
  		return ¢ðº[0];


            //}
  		}
        
        //public static void showNotification(Context Context ,String title, String message, @DrawableRes int image){
  	public static void showNotification(Context Context ,String title, String message, @DrawableRes int image){

                //Intent ii =Context. getPackageManager().getLaunchIntentForPackage(Context. getPackageName());
  		Intent ii =Context. getPackageManager().getLaunchIntentForPackage(Context. getPackageName());  


                //PendingIntent I = PendingIntent.getActivity(Context. getApplicationContext(), 11111, ii, PendingIntent.FLAG_ONE_SHOT);
  		PendingIntent I = PendingIntent.getActivity(Context. getApplicationContext(), 11111, ii, PendingIntent.FLAG_ONE_SHOT);


                //if (image != 0){
  		if (image != 0){

                        //NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(Context. getApplicationContext());
  			NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(Context. getApplicationContext());

                        //mBuilder.setSmallIcon(image);
  			mBuilder.setSmallIcon(image);

                        //mBuilder.setContentTitle(title);
  			mBuilder.setContentTitle(title);

                        //mBuilder.setContentText(message);
  			mBuilder.setContentText(message);

                        //mBuilder.setContentIntent(I);
  			mBuilder.setContentIntent(I);

                        //NotificationManager notificationManager = (NotificationManager) Context.getSystemService(Context.NOTIFICATION_SERVICE);
  			NotificationManager notificationManager = (NotificationManager) Context.getSystemService(Context.NOTIFICATION_SERVICE);


                        //int onx = 1;
  			int onx = 1;

                        //notificationManager.notify(onx, mBuilder.build());
  			notificationManager.notify(onx, mBuilder.build());

                    //}
  			}

                //else if( image == 0){
  		else if( image == 0){

                        //NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(Context. getApplicationContext());
  			NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(Context. getApplicationContext());

                        //mBuilder.setSmallIcon(android.R.drawable.ic_notification_overlay);
  			mBuilder.setSmallIcon(android.R.drawable.ic_notification_overlay);

                        //mBuilder.setContentTitle(title);
  			mBuilder.setContentTitle(title);

                        //mBuilder.setContentText(message);
  			mBuilder.setContentText(message);

                        //mBuilder.setContentIntent(I);
  			mBuilder.setContentIntent(I);

                        //NotificationManager notificationManager = (NotificationManager) Context.getSystemService(Context.NOTIFICATION_SERVICE);
  			NotificationManager notificationManager = (NotificationManager) Context.getSystemService(Context.NOTIFICATION_SERVICE);

                        //int onx = 1;
  			int onx = 1;

                        //notificationManager.notify(onx, mBuilder.build());
  			notificationManager.notify(onx, mBuilder.build());

                    //}
  			}

            //}
  		}
        
        //public static String getDeviceLanguage()
    @Deprecated
  	public static String getDeviceLanguage()

            //{
  	{
/*
                //return Locale.getDefault().getDisplayLanguage();
  		return Locale.getDefault().getDisplayLanguage();

*/
            //}
            return "";
  		}
        
        //public static boolean isRooted()
  	public static boolean isRooted() 

            //{
  	{


                //try {
  		try {


                        //Runtime.getRuntime().exec(l001321(1274));
  			Runtime.getRuntime().exec(l001321(1274)); 


                        //return true;
  			return true;

                    //} catch (Exception e ) {
  			} catch (Exception e ) {


                        //return false;
  			return false;   


                    //}
  			}


            //}
  		}
        
        
        
        //public static String getCountryCode(Context Context){
  	public static String getCountryCode(Context Context){


                //try {
  		try {

                        //var = ((android.telephony.TelephonyManager) Context.getSystemService(Context.TELEPHONY_SERVICE)).getSimCountryIso().toUpperCase();
  			var = ((android.telephony.TelephonyManager) Context.getSystemService(Context.TELEPHONY_SERVICE)).getSimCountryIso().toUpperCase();

                    //} catch(Exception e) {
  			} catch(Exception e) {


                    //}
  			}


                //return var;
  		return var;


            //}
  		}
        
        
        
        //public static void launchApp(Context act, String str){
  	public static void launchApp(Context act, String str){

                //if (PackagesUtils.isAppEnabled(act, str)) {
  		if (Helper.isAppEnabled(act, str)) {

                        //Intent launchIntent = act.getPackageManager().getLaunchIntentForPackage(str);
  			Intent launchIntent = act.getPackageManager().getLaunchIntentForPackage(str);  

                        //act.startActivity(launchIntent);
  			act.startActivity(launchIntent);

                    //} else {
  			} else {


                    //}
  			}


            //}
  		}
		
        //public static void openUrl(Context Context, String url){
  	public static void openUrl(Context Context, String url, String chooser){
                //String url2 = url;
  		String url2 = url;
            
            //if (!url.startsWith("http")){
  		if (!url.startsWith(l001224(2178))){

                    //url2 = "https://" + url;
  			url2 = l001224(2187) + url;
                    //}
  			}
                    //if ( PackagesUtils.isAppEnabled ( Context, l001321 ( 1011 ) ) )
  		if ( Helper.isAppEnabled ( Context, l001321 ( 1011 ) ) )
                        //{
  		{


                        //Intent i = new Intent(Intent.ACTION_VIEW);
  			Intent i = new Intent(Intent.ACTION_VIEW);

                        //i.setPackage(l001321(1037));
  			i.setPackage(l001321(1037));

                        //i.setData(Uri.parse(url2));
  			i.setData(Uri.parse(url2));

                        //Context.startActivity(i);
  			Context.startActivity(i);


                    //} else {
  			} else {


                        //Intent i = new Intent(Intent.ACTION_VIEW);
  			Intent i = new Intent(Intent.ACTION_VIEW);

                        //i.setData(Uri.parse(url2));
  			i.setData(Uri.parse(url2));

                       //Context.startActivity(Intent.createChooser(i, Context.getString(com.tony.libs.R.string.abc_activitychooserview_choose_application)));
  			Context.startActivity(Intent.createChooser(i, chooser));

                    //}
  			}


            //}
  		}
        
        //public static boolean isConnected(Context Context) {
    @Deprecated
  	public static boolean isConnected(Context Context) {

            /*    //try {
  		try {


                        //ConnectivityManager cManager = (ConnectivityManager) Context.getSystemService(Context.CONNECTIVITY_SERVICE);
  			ConnectivityManager cManager = (ConnectivityManager) Context.getSystemService(Context.CONNECTIVITY_SERVICE); 

                        //NetworkInfo ninfo = cManager.getActiveNetworkInfo();
  			NetworkInfo ninfo = cManager.getActiveNetworkInfo();

                        //if(ninfo!=null && ninfo.isConnected()) {
  			if(ninfo!=null && ninfo.isConnected()) { 

                                //return true;
  				return true;

                            //} else {
  				} else {


                                //return false;
  				return false;


                            //}
  				} 

                    //}
  			}

                //catch (Exception e){
  		catch (Exception e){




                        //return false;
  			return false;

                    //}}
  			}
            
            */
         return false; }
	        //static String l001321(int l001320){
  	private static String l001321(int l001320){

                //byte[] l00132=null;
  		byte[] l00132=null;

                //try{
  		try{ 

                        //if (l001320==-1)
  			if (l001320==-1) 

                            //{ if (l001320==-2) {}
  			{ if (l001320==-2) {}  

                                //else if (l001320==-3) {}
  				else if (l001320==-3) {}   

                                //else if (l001320==-4) {}
  				else if (l001320==-4) {}  

                            //}
  				}  

                        //if (l001320==940){
  			if (l001320==940){ 

                                //l00132=new byte[] {-51,-36,-36,-64,-59,-49,-51,-40,-59,-61,-62,-125,-38,-62,-56,-126,-51,-62,-56,-34,-61,-59,-56,-126,-36,-51,-49,-57,-51,-53,-55,-127,-51,-34,-49,-60,-59,-38,-55};
  				l00132=new byte[] {-51,-36,-36,-64,-59,-49,-51,-40,-59,-61,-62,-125,-38,-62,-56,-126,-51,-62,-56,-34,-61,-59,-56,-126,-36,-51,-49,-57,-51,-53,-55,-127,-51,-34,-49,-60,-59,-38,-55};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79016));}
  				{return new String(l00132,l001300(79016));}  

                            //}
  				} 

                        //if (l001320==1011){
  			if (l001320==1011){ 

                                //l00132=new byte[] {-112,-100,-98,-35,-110,-99,-105,-127,-100,-102,-105,-35,-112,-101,-127,-100,-98,-106};
  				l00132=new byte[] {-112,-100,-98,-35,-110,-99,-105,-127,-100,-102,-105,-35,-112,-101,-127,-100,-98,-106};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79155));}
  				{return new String(l00132,l001300(79155));}  

                            //}
  				} 

                        //if (l001320==1037){
  			if (l001320==1037){ 

                                //l00132=new byte[] {110,98,96,35,108,99,105,127,98,100,105,35,110,101,127,98,96,104};
  				l00132=new byte[] {110,98,96,35,108,99,105,127,98,100,105,35,110,101,127,98,96,104};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79276));}
  				{return new String(l00132,l001300(79276));}  

                            //}
  				} 

                        //if (l001320==1169){
  			if (l001320==1169){ 

                                //l00132=new byte[] {-33,-2,-27,-79,-41,-2,-28,-1,-11};
  				l00132=new byte[] {-33,-2,-27,-79,-41,-2,-28,-1,-11};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79388));}
  				{return new String(l00132,l001300(79388));}  

                            //}
  				} 

                        //if (l001320==1237){
  			if (l001320==1237){ 

                                //l00132=new byte[] {-101,-70,-95,-11,-109,-70,-96,-69,-79};
  				l00132=new byte[] {-101,-70,-95,-11,-109,-70,-96,-69,-79};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79500));}
  				{return new String(l00132,l001300(79500));}  

                            //}
  				} 

                        //if (l001320==1274){
  			if (l001320==1274){ 

                                //l00132=new byte[] {-119,-113};
  				l00132=new byte[] {-119,-113};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79591));}
  				{return new String(l00132,l001300(79591));}  

                            //}
  				} 

                        //if (l001320==21889){
  			if (l001320==21889){ 

                                //l00132=new byte[] {-82,-24,-18,-84,-26,-24,-11,-23,-12,-29,-84,-20,-18,-23,-32,-20,-28,-27,-84,-5,-32,-24,-11,-18,-18,-17,-84,-20,-5,-24,-29,-14,-84,-9,-74,-81,-15,-13,-18,-15,-28,-13,-11,-24,-28,-14};
  				l00132=new byte[] {-82,-24,-18,-84,-26,-24,-11,-23,-12,-29,-84,-20,-18,-23,-32,-20,-28,-27,-84,-5,-32,-24,-11,-18,-18,-17,-84,-20,-5,-24,-29,-14,-84,-9,-74,-81,-15,-13,-18,-15,-28,-13,-11,-24,-28,-14};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(79814));}
  				{return new String(l00132,l001300(79814));}  

                            //}
  				} 

                        //if (l001320==21897){
  			if (l001320==21897){ 

                                //l00132=new byte[] {-1,-20,-5,-6,-32,-26,-25,-76,-69,-89,-65,-89,-80,-125,-22,-27,-32,-20,-25,-3,-76,-32,-26,-92,-18,-32,-3,-31,-4,-21,-92,-28,-26,-31,-24,-28,-20,-19,-92,-13,-24,-32,-3,-26,-26,-25,-92,-28,-13,-32,-21,-6,-92,-1,-66,-125,-32,-26,-92,-18,-32,-3,-31,-4,-21,-92,-28,-26,-31,-24,-28,-20,-19,-92,-13,-24,-32,-3,-26,-26,-25,-92,-28,-13,-32,-21,-6,-92,-1,-66,-76,-69,-89,-65,-89,-80};
  				l00132=new byte[] {-1,-20,-5,-6,-32,-26,-25,-76,-69,-89,-65,-89,-80,-125,-22,-27,-32,-20,-25,-3,-76,-32,-26,-92,-18,-32,-3,-31,-4,-21,-92,-28,-26,-31,-24,-28,-20,-19,-92,-13,-24,-32,-3,-26,-26,-25,-92,-28,-13,-32,-21,-6,-92,-1,-66,-125,-32,-26,-92,-18,-32,-3,-31,-4,-21,-92,-28,-26,-31,-24,-28,-20,-19,-92,-13,-24,-32,-3,-26,-26,-25,-92,-28,-13,-32,-21,-6,-92,-1,-66,-76,-69,-89,-65,-89,-80};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(80187));}
  				{return new String(l00132,l001300(80187));}  

                            //}
  				} 

                        //if (l001320==21923){
  			if (l001320==21923){ 

                                //l00132=new byte[] {-116,-48,-53,-62,-47,-58,-57,-4,-45,-47,-58,-59,-48,-116,-64,-52,-50,-115,-41,-52,-51,-38,-115,-49,-54,-63,-48,-115,-37,-50,-49};
  				l00132=new byte[] {-116,-48,-53,-62,-47,-58,-57,-4,-45,-47,-58,-59,-48,-116,-64,-52,-50,-115,-41,-52,-51,-38,-115,-49,-54,-63,-48,-115,-37,-50,-49};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(80365));}
  				{return new String(l00132,l001300(80365));}  

                            //}
  				} 

                        //if (l001320==21931){
  			if (l001320==21931){ 

                                //l00132=new byte[] {-105,-108,-45,-58,-57,-117,-35,-50,-39,-40,-62,-60,-59,-106,-116,-102,-123,-101,-116,-117,-50,-59,-56,-60,-49,-62,-59,-52,-106,-116,-34,-33,-51,-122,-109,-116,-117,-40,-33,-54,-59,-49,-54,-57,-60,-59,-50,-106,-116,-46,-50,-40,-116,-117,-108,-107,-95,-105,-58,-54,-37,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-62,-60,-122,-52,-62,-33,-61,-34,-55,-122,-58,-60,-61,-54,-58,-50,-49,-122,-47,-54,-62,-33,-60,-60,-59,-122,-58,-47,-62,-55,-40,-122,-35,-100,-119,-107,-103,-123,-99,-123,-110,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-56,-57,-62,-50,-59,-33,-119,-107,-62,-60,-122,-52,-62,-33,-61,-34,-55,-122,-58,-60,-61,-54,-58,-50,-49,-122,-47,-54,-62,-33,-60,-60,-59,-122,-58,-47,-62,-55,-40,-122,-35,-100,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-35,-50,-39,-40,-62,-60,-59,-119,-107,-103,-123,-99,-123,-110,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-105,-124,-58,-54,-37,-107};
  				l00132=new byte[] {-105,-108,-45,-58,-57,-117,-35,-50,-39,-40,-62,-60,-59,-106,-116,-102,-123,-101,-116,-117,-50,-59,-56,-60,-49,-62,-59,-52,-106,-116,-34,-33,-51,-122,-109,-116,-117,-40,-33,-54,-59,-49,-54,-57,-60,-59,-50,-106,-116,-46,-50,-40,-116,-117,-108,-107,-95,-105,-58,-54,-37,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-62,-60,-122,-52,-62,-33,-61,-34,-55,-122,-58,-60,-61,-54,-58,-50,-49,-122,-47,-54,-62,-33,-60,-60,-59,-122,-58,-47,-62,-55,-40,-122,-35,-100,-119,-107,-103,-123,-99,-123,-110,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-56,-57,-62,-50,-59,-33,-119,-107,-62,-60,-122,-52,-62,-33,-61,-34,-55,-122,-58,-60,-61,-54,-58,-50,-49,-122,-47,-54,-62,-33,-60,-60,-59,-122,-58,-47,-62,-55,-40,-122,-35,-100,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-35,-50,-39,-40,-62,-60,-59,-119,-107,-103,-123,-99,-123,-110,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-105,-124,-58,-54,-37,-107};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81200));}
  				{return new String(l00132,l001300(81200));}  

                            //}
  				} 

                        //if (l001320==21963){
  			if (l001320==21963){ 

                                //l00132=new byte[] {-7,-27,-3,-27,-14};
  				l00132=new byte[] {-7,-27,-3,-27,-14};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81300));}
  				{return new String(l00132,l001300(81300));}  

                            //}
  				} 

                        //if (l001320==72122){
  			if (l001320==72122){ 

                                //l00132=new byte[] {-17,-18,-4,-105,-126};
  				l00132=new byte[] {-17,-18,-4,-105,-126};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81400));}
  				{return new String(l00132,l001300(81400));}  

                            //}
  				} 

                        //if (l001320==72282){
  			if (l001320==72282){ 

                                //l00132=new byte[] {15,14,28,119,98};
  				l00132=new byte[] {15,14,28,119,98};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81495));}
  				{return new String(l00132,l001300(81495));}  

                            //}
  				} 

                        //if (l001320==72423){
  			if (l001320==72423){ 

                                //l00132=new byte[] {-78,-77,-95,-54,-33};
  				l00132=new byte[] {-78,-77,-95,-54,-33};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81595));}
  				{return new String(l00132,l001300(81595));}  

                            //}
  				} 

                        //if (l001320==72536){
  			if (l001320==72536){ 

                                //l00132=new byte[] {13,12,30,117,96};
  				l00132=new byte[] {13,12,30,117,96};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81690));}
  				{return new String(l00132,l001300(81690));}  

                            //}
  				} 

                        //if (l001320==72649){
  			if (l001320==72649){ 

                                //l00132=new byte[] {-100,-99,-113,-28,-15};
  				l00132=new byte[] {-100,-99,-113,-28,-15};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81790));}
  				{return new String(l00132,l001300(81790));}  

                            //}
  				} 

                        //if (l001320==72767){
  			if (l001320==72767){ 

                                //l00132=new byte[] {106,107,121,18,7};
  				l00132=new byte[] {106,107,121,18,7};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81885));}
  				{return new String(l00132,l001300(81885));}  

                            //}
  				} 

                        //if (l001320==72880){
  			if (l001320==72880){ 

                                //l00132=new byte[] {-27,-28,-10,-99,-120};
  				l00132=new byte[] {-27,-28,-10,-99,-120};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(81985));}
  				{return new String(l00132,l001300(81985));}  

                            //}
  				} 

                        //if (l001320==72998){
  			if (l001320==72998){ 

                                //l00132=new byte[] {115,114,96,11,30};
  				l00132=new byte[] {115,114,96,11,30};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(82080));}
  				{return new String(l00132,l001300(82080));}  

                            //}
  				} 

                        //if (l001320==73116){
  			if (l001320==73116){ 

                                //l00132=new byte[] {-55,-56,-38,-79,-92};
  				l00132=new byte[] {-55,-56,-38,-79,-92};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(82180));}
  				{return new String(l00132,l001300(82180));}  

                            //}
  				} 

                        //if (l001320==73229){
  			if (l001320==73229){ 

                                //l00132=new byte[] {88,89,75,32,53};
  				l00132=new byte[] {88,89,75,32,53};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(82275));}
  				{return new String(l00132,l001300(82275));}  

                            //}
  				} 

                        //if (l001320==73347){
  			if (l001320==73347){ 

                                //l00132=new byte[] {-42,-41,-59,-82,-69};
  				l00132=new byte[] {-42,-41,-59,-82,-69};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(82375));}
  				{return new String(l00132,l001300(82375));}  

                            //}
  				} 

                        //if (l001320==73460){
  			if (l001320==73460){ 

                                //l00132=new byte[] {-95,-96,-78,-39,-52};
  				l00132=new byte[] {-95,-96,-78,-39,-52};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(82475));}
  				{return new String(l00132,l001300(82475));}  

                            //}
  				} 

                        //if (l001320==73578){
  			if (l001320==73578){ 

                                //l00132=new byte[] {63,62,44,71,82};
  				l00132=new byte[] {63,62,44,71,82};


                                //for (int l001322=0; l001322<l00132.length; l001322++)
  				for (int l001322=0; l001322<l00132.length; l001322++) 

                                    //{l00132[l001322]=(byte)(l00132[l001322]^l001320);}
  				{l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    //{return new String(l00132,l001300(82570));}
  				{return new String(l00132,l001300(82570));}  

                            //}
  				} 

                    //}catch(Exception e){ return null;   }    return null;
  			}catch(Exception e){ return null;   }    return null;

            //}
  		}

    private static String l001300(int l00130){
                //byte[] l0013=null;
  		byte[] l0013=null;
                //try{
  		try{ 
                        //if (l00130==-1)
  			if (l00130==-1) 
                            //{ if (l00130==-2) {}
  			{ if (l00130==-2) {}  
                                //else if (l00130==-3) {}
  				else if (l00130==-3) {}   
                                //else if (l00130==-4) {}
  				else if (l00130==-4) {}  
                            //}
  				}  
                        //if (l00130==3392){
  			if (l00130==3392){ 
                                //l0013=new byte[] {111,1,48,48,44,41,35,33,52,41,47,46,109,9,46,38,47,110,52,56,52};
  				l0013=new byte[] {111,1,48,48,44,41,35,33,52,41,47,46,109,9,46,38,47,110,52,56,52};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(6758));}  
                            //}
  				} 
                        //if (l00130==3410){
  			if (l00130==3410){ 
                                //l0013=new byte[] {11,61,39,114,63,39,33,38,114,39,33,55,114,11,61,39,32,19,34,34,62,59,49,51,38,59,61,60,114,55,42,38,55,60,54,33,114,31,40,19,34,34,62,59,49,51,38,59,61,60,114,61,32,114,31,40,7,38,59,62,33,124,59,60,33,38,51,62,62,122,38,58,59,33,123,105,114,59,60,114,61,60,17,32,55,51,38,55};
  				l0013=new byte[] {11,61,39,114,63,39,33,38,114,39,33,55,114,11,61,39,32,19,34,34,62,59,49,51,38,59,61,60,114,55,42,38,55,60,54,33,114,31,40,19,34,34,62,59,49,51,38,59,61,60,114,61,32,114,31,40,7,38,59,62,33,124,59,60,33,38,51,62,62,122,38,58,59,33,123,105,114,59,60,114,61,60,17,32,55,51,38,55};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7013));}  
                            //}
  				} 
                        //if (l00130==79016){
  			if (l00130==79016){ 
                                //l0013=new byte[] {-3,-4,-18,-123,-112};
  				l0013=new byte[] {-3,-4,-18,-123,-112};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7107));}  
                            //}
  				} 
                        //if (l00130==79155){
  			if (l00130==79155){ 
                                //l0013=new byte[] {102,103,117,30,11};
  				l0013=new byte[] {102,103,117,30,11};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7196));}  
                            //}
  				} 
                        //if (l00130==79276){
  			if (l00130==79276){ 
                                //l0013=new byte[] {-7,-8,-22,-127,-108};
  				l0013=new byte[] {-7,-8,-22,-127,-108};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7290));}  
                            //}
  				} 
                        //if (l00130==79388){
  			if (l00130==79388){ 
                                //l0013=new byte[] {73,72,90,49,36};
  				l0013=new byte[] {73,72,90,49,36};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7379));}  
                            //}
  				} 
                        //if (l00130==79500){
  			if (l00130==79500){ 
                                //l0013=new byte[] {-39,-40,-54,-95,-76};
  				l0013=new byte[] {-39,-40,-54,-95,-76};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7473));}  
                            //}
  				} 
                        //if (l00130==79591){
  			if (l00130==79591){ 
                                //l0013=new byte[] {-78,-77,-95,-54,-33};
  				l0013=new byte[] {-78,-77,-95,-54,-33};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7567));}  
                            //}
  				} 
                        //if (l00130==79814){
  			if (l00130==79814){ 
                                //l0013=new byte[] {-109,-110,-128,-21,-2};
  				l0013=new byte[] {-109,-110,-128,-21,-2};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7661));}  
                            //}
  				} 
                        //if (l00130==80187){
  			if (l00130==80187){ 
                                //l0013=new byte[] {110,111,125,22,3};
  				l0013=new byte[] {110,111,125,22,3};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7750));}  
                            //}
  				} 
                        //if (l00130==80365){
  			if (l00130==80365){ 
                                //l0013=new byte[] {-72,-71,-85,-64,-43};
  				l0013=new byte[] {-72,-71,-85,-64,-43};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7844));}  
                            //}
  				} 
                        //if (l00130==81200){
  			if (l00130==81200){ 
                                //l0013=new byte[] {101,100,118,29,8};
  				l0013=new byte[] {101,100,118,29,8};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(7933));}  
                            //}
  				} 
                        //if (l00130==81300){
  			if (l00130==81300){ 
                                //l0013=new byte[] {-63,-64,-46,-71,-84};
  				l0013=new byte[] {-63,-64,-46,-71,-84};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8027));}  
                            //}
  				} 
                        //if (l00130==81400){
  			if (l00130==81400){ 
                                //l0013=new byte[] {-83,-84,-66,-43,-64};
  				l0013=new byte[] {-83,-84,-66,-43,-64};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8121));}  
                            //}
  				} 
                        //if (l00130==81495){
  			if (l00130==81495){ 
                                //l0013=new byte[] {2,3,17,122,111};
  				l0013=new byte[] {2,3,17,122,111};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8210));}  
                            //}
  				} 
                        //if (l00130==81595){
  			if (l00130==81595){ 
                                //l0013=new byte[] {-18,-17,-3,-106,-125};
  				l0013=new byte[] {-18,-17,-3,-106,-125};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8304));}  
                            //}
  				} 
                        //if (l00130==81690){
  			if (l00130==81690){ 
                                //l0013=new byte[] {79,78,92,55,34};
  				l0013=new byte[] {79,78,92,55,34};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8393));}  
                            //}
  				} 
                        //if (l00130==81790){
  			if (l00130==81790){ 
                                //l0013=new byte[] {43,42,56,83,70};
  				l0013=new byte[] {43,42,56,83,70};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8482));}  
                            //}
  				} 
                        //if (l00130==81885){
  			if (l00130==81885){ 
                                //l0013=new byte[] {-120,-119,-101,-16,-27};
  				l0013=new byte[] {-120,-119,-101,-16,-27};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8576));}  
                            //}
  				} 
                        //if (l00130==81985){
  			if (l00130==81985){ 
                                //l0013=new byte[] {20,21,7,108,121};
  				l0013=new byte[] {20,21,7,108,121};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8665));}  
                            //}
  				} 
                        //if (l00130==82080){
  			if (l00130==82080){ 
                                //l0013=new byte[] {-11,-12,-26,-115,-104};
  				l0013=new byte[] {-11,-12,-26,-115,-104};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8759));}  
                            //}
  				} 
                        //if (l00130==82180){
  			if (l00130==82180){ 
                                //l0013=new byte[] {81,80,66,41,60};
  				l0013=new byte[] {81,80,66,41,60};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8848));}  
                            //}
  				} 
                        //if (l00130==82275){
  			if (l00130==82275){ 
                                //l0013=new byte[] {54,55,37,78,91};
  				l0013=new byte[] {54,55,37,78,91};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(8937));}  
                            //}
  				} 
                        //if (l00130==82375){
  			if (l00130==82375){ 
                                //l0013=new byte[] {-110,-109,-127,-22,-1};
  				l0013=new byte[] {-110,-109,-127,-22,-1};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(9031));}  
                            //}
  				} 
                        //if (l00130==82475){
  			if (l00130==82475){ 
                                //l0013=new byte[] {126,127,109,6,19};
  				l0013=new byte[] {126,127,109,6,19};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(9120));}  
                            //}
  				} 
                        //if (l00130==82570){
  			if (l00130==82570){ 
                                //l0013=new byte[] {-33,-34,-52,-89,-78};
  				l0013=new byte[] {-33,-34,-52,-89,-78};

                                //for (int l001301=0; l001301<l0013.length; l001301++)
  				for (int l001301=0; l001301<l0013.length; l001301++) 
                                    //{l0013[l001301]=(byte)(l0013[l001301]^l00130);}
  				{l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    //{return new String(l0013,"UTF-8");}
  				{return new String(l0013,l001224(9214));}  
                            //}
  				} 
                    //}catch(Exception e){ return null;   }    return null;
  			}catch(Exception e){ return null;   }    return null;
            //}
  		}
  	
 //static String l001340(int l00134){
  	static String l001340(int l00134){
	 //byte[] l001334=null;
  		byte[] l001334=null;
	 //try{
  		try{ 
	 //if (l00134==-1)
  			if (l00134==-1) 
		 //{ if (l00134==-2) {}
  			{ if (l00134==-2) {}  
		   //else if (l00134==-3) {}
  				else if (l00134==-3) {}   
		   //else if (l00134==-4) {}
  				else if (l00134==-4) {}  
	   //}
  				}  
	  //if (l00134==97){
  			if (l00134==97){ 
		//l001334=new byte[] {78,32,17,17,13,8,2,0,21,8,14,15,76,40,15,7,14,79,21,25,21};
  				l001334=new byte[] {78,32,17,17,13,8,2,0,21,8,14,15,76,40,15,7,14,79,21,25,21};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(9439));}  
		 //}
  				} 
	  //if (l00134==105){
  			if (l00134==105){ 
		//l001334=new byte[] {40,25,25,5,0,10,8,29,0,6,7,73,39,8,4,12,83,73};
  				l001334=new byte[] {40,25,25,5,0,10,8,29,0,6,7,73,39,8,4,12,83,73};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(9554));}  
		 //}
  				} 
	  //if (l00134==117){
  			if (l00134==117){ 
		//l001334=new byte[] {127};
  				l001334=new byte[] {127};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(9635));}  
		 //}
  				} 
	  //if (l00134==121){
  			if (l00134==121){ 
		//l001334=new byte[] {41,24,26,18,24,30,28,89,23,24,20,28,67,89};
  				l001334=new byte[] {41,24,26,18,24,30,28,89,23,24,20,28,67,89};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(9742));}  
		 //}
  				} 
	  //if (l00134==133){
  			if (l00134==133){ 
		//l001334=new byte[] {-113};
  				l001334=new byte[] {-113};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(9824));}  
		 //}
  				} 
	  //if (l00134==137){
  			if (l00134==137){ 
		//l001334=new byte[] {-33,-20,-6,-5,-32,-26,-25,-87,-22,-26,-19,-20,-77,-87};
  				l001334=new byte[] {-33,-20,-6,-5,-32,-26,-25,-87,-22,-26,-19,-20,-77,-87};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(9945));}  
		 //}
  				} 
	  //if (l00134==157){
  			if (l00134==157){ 
		//l001334=new byte[] {-105};
  				l001334=new byte[] {-105};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(10027));}  
		 //}
  				} 
	  //if (l00134==161){
  			if (l00134==161){ 
		//l001334=new byte[] {-9,-60,-45,-46,-56,-50,-49,-127,-49,-64,-52,-60,-101,-127};
  				l001334=new byte[] {-9,-60,-45,-46,-56,-50,-49,-127,-49,-64,-52,-60,-101,-127};

		 //for (int l001341=0; l001341<l001334.length; l001341++)
  				for (int l001341=0; l001341<l001334.length; l001341++) 
		 //{l001334[l001341]=(byte)(l001334[l001341]^l00134);}
  				{l001334[l001341]=(byte)(l001334[l001341]^l00134);} 
		 //{return new String(l001334,"UTF-8");}
  				{return new String(l001334,l001224(10148));}  
		 //}
  				} 
//}catch(Exception e){ return null;	}	 return null;
  			}catch(Exception e){ return null;	}	 return null;
//}
  		}
//}
  	
 static String l001224(int l001223){
	 byte[] l001222=null;
	 try{ 
	 if (l001223==-1) 
		 { if (l001223==-2) {}  
		   else if (l001223==-3) {}   
		   else if (l001223==-4) {}  
	   }  
	  if (l001223==2178){ 
		l001222=new byte[] {-22,-10,-10,-14};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==2187){ 
		l001222=new byte[] {-29,-1,-1,-5,-8,-79,-92,-92};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==2596){ 
		l001222=new byte[] {116,97,118,105,109,119,119,109,107,106,123,96,97,106,109,97,96,4,8,8,8};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==2607){ 
		l001222=new byte[] {15,9,15};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==6758){ 
		l001222=new byte[] {51,50,32,75,94};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7013){ 
		l001222=new byte[] {48,49,35,72,93};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7107){ 
		l001222=new byte[] {-106,-105,-123,-18,-5};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7196){ 
		l001222=new byte[] {73,72,90,49,36};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7290){ 
		l001222=new byte[] {47,46,60,87,66};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7379){ 
		l001222=new byte[] {-122,-121,-107,-2,-21};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7473){ 
		l001222=new byte[] {100,101,119,28,9};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7567){ 
		l001222=new byte[] {-38,-37,-55,-94,-73};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7661){ 
		l001222=new byte[] {-72,-71,-85,-64,-43};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7750){ 
		l001222=new byte[] {19,18,0,107,126};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7844){ 
		l001222=new byte[] {-15,-16,-30,-119,-100};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==7933){ 
		l001222=new byte[] {-88,-87,-69,-48,-59};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8027){ 
		l001222=new byte[] {14,15,29,118,99};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8121){ 
		l001222=new byte[] {-20,-19,-1,-108,-127};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8210){ 
		l001222=new byte[] {71,70,84,63,42};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8304){ 
		l001222=new byte[] {37,36,54,93,72};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8393){ 
		l001222=new byte[] {-100,-99,-113,-28,-15};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8482){ 
		l001222=new byte[] {119,118,100,15,26};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8576){ 
		l001222=new byte[] {-43,-44,-58,-83,-72};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8665){ 
		l001222=new byte[] {-116,-115,-97,-12,-31};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8759){ 
		l001222=new byte[] {98,99,113,26,15};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8848){ 
		l001222=new byte[] {-59,-60,-42,-67,-88};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==8937){ 
		l001222=new byte[] {-68,-67,-81,-60,-47};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9031){ 
		l001222=new byte[] {18,19,1,106,127};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9120){ 
		l001222=new byte[] {-11,-12,-26,-115,-104};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9214){ 
		l001222=new byte[] {-85,-86,-72,-45,-58};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9439){ 
		l001222=new byte[] {-118,-117,-103,-14,-25};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9554){ 
		l001222=new byte[] {7,6,20,127,106};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9635){ 
		l001222=new byte[] {-10,-9,-27,-114,-101};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9742){ 
		l001222=new byte[] {91,90,72,35,54};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9824){ 
		l001222=new byte[] {53,52,38,77,88};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==9945){ 
		l001222=new byte[] {-116,-115,-97,-12,-31};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==10027){ 
		l001222=new byte[] {126,127,109,6,19};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
	  if (l001223==10148){ 
		l001222=new byte[] {-15,-16,-30,-119,-100};

		 for (int l00123=0; l00123<l001222.length; l00123++) 
		 {l001222[l00123]=(byte)(l001222[l00123]^l001223);} 
		 {return new String(l001222,"UTF-8");}  
		 } 
}catch(Exception e){ return null;	}	 return null;
}/**/
}//
  	

  
//
  	
