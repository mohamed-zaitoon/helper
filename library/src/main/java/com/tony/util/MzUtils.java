 /* Orginal file: MzUtils.java
bgteam.assitant@outlook.com
\com.tony.util*/
package com.tony.util;
import android.*;
import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.net.*;
import android.support.annotation.*;
import android.support.v4.app.*;
import android.support.v4.content.*;
import com.tony.app.*;
import com.tony.libs.*;
import java.io.*;
import java.util.*;

import com.tony.libs.R;
import android.view.*;
import android.widget.*;
import android.content.res.*;
import android.util.*;
import android.os.*;
import android.graphics.drawable.*;
import com.tony.interfaces.*;
import android.media.*;
import com.tony.util.MzUtils.*;


  public final class MzUtils

    {

        private static String var;

        private static Vibrator vib;

        private static MediaPlayer med;

        private static MzUtils.d ¢çµ;
        public static void setTimer(MzActivity act, int i,TimerInterface t){




                ¢çµ = new d(act, t);




                ¢çº.schedule(¢çµ, i);




            }



        private static Timer ¢çº = new Timer ( );
        


        public static void setTimerForEver(MzActivity act, int i, TimerInterface t){




                ¢çµ = new d(act,t);




                ¢çº.scheduleAtFixedRate(¢çµ,0, i);




            }



      private  static class c implements Runnable




            {


                private com.tony.interfaces.TimerInterface timer;

                public c(com.tony.interfaces.TimerInterface t){

                        this.timer = t;

                    }





                @Override




                public void run ( )




                    {



                        timer.startTimer();




                    }







            }


        public static void startMedia(MzActivity mz, int io){


                med = MediaPlayer.create(mz.getApplicationContext(), io);


                med.start();


            }


        public static void stopMedia(){



                if (med.isPlaying()) {


                        med.stop();


                    } 


            }





        private static class d extends TimerTask


            {


                private TimerInterface timer;

                private MzActivity act;


                public d(MzActivity mAct, TimerInterface t){

                        this.timer = t;
                        this.act = mAct;

                    }




                @Override




                public void run ( )




                    {




                        act.runOnUiThread(new c(timer));





                    }






            }
  public static String decode(String str){


                return com.tony.util.b.a(str);

            }

        public static String encode(String str){


                return com.tony.util.b.c(str);

            }


        
        public static void startVibrate(MzActivity act, long l){




                vib = (Vibrator) act.getSystemService(Context.VIBRATOR_SERVICE);
                if(ContextCompat.checkSelfPermission(act,Manifest.permission.VIBRATE) == PackageManager.PERMISSION_GRANTED){
                     vib.vibrate(l);
                } else {
                    
                }
                }


  		
        
        
        public static int getLocationY(View v) {


                int ¢ðº[] = new int[2];


                v.getLocationInWindow(¢ðº);


                return ¢ðº[1];


            }
        public static Drawable getDrawable(MzActivity context, @DrawableRes int resId){

                return ContextCompat.getDrawable(context,resId);

            }

        
        public static int getColor(MzActivity context, @ColorRes int resId){

                return ContextCompat.getColor(context,resId);

            }


        
        public static int getRandom(int m, int x) {


                Random random = new Random();


                return random.nextInt(x - m + 1) + m;


            }

        public static ArrayList<Double> getCheckedItemPositionsToArray(ListView l) {


                ArrayList<Double> ¢ø = new ArrayList<Double>();


                SparseBooleanArray ¢ø¢ = l.getCheckedItemPositions();



                for (int ¢ø£ = 0; ¢ø£ < ¢ø¢.size(); ¢ø£++) {



                        if (¢ø¢.valueAt(¢ø£))


                            ¢ø.add((double)¢ø¢.keyAt(¢ø£));


                    }


                return ¢ø;


            }


        public static float getDip(MzActivity mz, int i){


                return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, mz.getResources().getDisplayMetrics());


            }

        public static int getDisplayWidthPixels(MzActivity mz){


                return mz.getResources().getDisplayMetrics().widthPixels;


            }


        public static int getDisplayHeightPixels(MzActivity mz){


                return mz.getResources().getDisplayMetrics().heightPixels;


            }



        
        
        
        public static void blockScreenShot(MzActivity mz){


                mz.getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

            }
        public static String getBatteryLevel(MzActivity mzAc){


                BatteryManager bm = (BatteryManager)mzAc.getSystemService(mzAc.BATTERY_SERVICE);

                int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);

                return Integer.toString(batLevel);

            }

        public static void setLocale(MzActivity mzAc, String lang) {

                Locale Language = new Locale ( lang );

                Resources res = mzAc.getResources ( );

                DisplayMetrics dm = res.getDisplayMetrics();

                Configuration conf = res.getConfiguration();

                conf.locale = Language;

                res.updateConfiguration(conf, dm);



            } 

        public static void showMessage(MzActivity mzAct, String s) {


                Toast.makeText(mzAct.getApplicationContext(), s, Toast.LENGTH_LONG).show();


            }
        public static String getString(Double d){


                return Double.toString(d);

            }

        public static String getString(int d){


                return Integer.toString(d);

            }


        public static int getLocationX(View v) {


                int ¢ðº[] = new int[2];


                v.getLocationInWindow(¢ðº);


                return ¢ðº[0];


            }
        
        public static void showNotification(MzActivity mzActivity ,String title, String message, @DrawableRes int image){

                Intent ii =mzActivity. getPackageManager().getLaunchIntentForPackage(mzActivity. getPackageName());  


                PendingIntent I = PendingIntent.getActivity(mzActivity. getApplicationContext(), 11111, ii, PendingIntent.FLAG_ONE_SHOT);


                if (image != 0){

                        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(mzActivity. getApplicationContext());

                        mBuilder.setSmallIcon(image);

                        mBuilder.setContentTitle(title);

                        mBuilder.setContentText(message);

                        mBuilder.setContentIntent(I);

                        NotificationManager notificationManager = (NotificationManager) mzActivity.getSystemService(Context.NOTIFICATION_SERVICE);


                        int onx = 1;

                        notificationManager.notify(onx, mBuilder.build());

                    }

                else if( image == 0){

                        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(mzActivity. getApplicationContext());

                        mBuilder.setSmallIcon(android.R.drawable.ic_notification_overlay);

                        mBuilder.setContentTitle(title);

                        mBuilder.setContentText(message);

                        mBuilder.setContentIntent(I);

                        NotificationManager notificationManager = (NotificationManager) mzActivity.getSystemService(Context.NOTIFICATION_SERVICE);

                        int onx = 1;

                        notificationManager.notify(onx, mBuilder.build());

                    }

            }
        
        public static String getDeviceLanguage()

            {

                return Locale.getDefault().getDisplayLanguage();


            }
        
        public static boolean isRooted() 

            {


                try {


                        Runtime.getRuntime().exec(l001321(1274)); 


                        return true;

                    } catch (Exception e ) {


                        return false;   


                    }


            }
        
        
        
        public static String getCountryCode(MzActivity mzActivity){


                try {

                        var = ((android.telephony.TelephonyManager) mzActivity.getSystemService(Context.TELEPHONY_SERVICE)).getSimCountryIso().toUpperCase();

                    } catch(Exception e) {


                    }


                return var;


            }
        
        
        
        public static void launchApp(MzActivity act, String str){

                if (PackagesUtils.isAppEnabled(act, str)) {

                        Intent launchIntent = act.getPackageManager().getLaunchIntentForPackage(str);  

                        act.startActivity(launchIntent);

                    } else {


                    }


            }
		
        public static void openUrl(MzActivity mzActivity, String url){
                String url2 = url;
            
            if (!url.startsWith("http")){

                    url2 = "https://" + url;
                    }
                    if ( PackagesUtils.isAppEnabled ( mzActivity, l001321 ( 1011 ) ) )
                        {


                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setPackage(l001321(1037));

                        i.setData(Uri.parse(url2));

                        mzActivity.startActivity(i);


                    } else {


                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url2));

                       mzActivity.startActivity(Intent.createChooser(i, mzActivity.getString(com.tony.libs.R.string.abc_activitychooserview_choose_application)));

                    }


            }
        
        public static boolean isConnected(MzActivity mzActivity) {

                try {


                        ConnectivityManager cManager = (ConnectivityManager) mzActivity.getSystemService(mzActivity.CONNECTIVITY_SERVICE); 

                        NetworkInfo ninfo = cManager.getActiveNetworkInfo();

                        if(ninfo!=null && ninfo.isConnected()) { 

                                return true;

                            } else {


                                return false;


                            } 

                    }

                catch (Exception e){




                        return false;

                    }}
	public static  void activateBluetooth(MzActivity mzActivity) {
		if (ContextCompat.checkSelfPermission(mzActivity,Manifest.permission.BLUETOOTH) == PackageManager.PERMISSION_GRANTED
		|| ContextCompat.checkSelfPermission(mzActivity, Manifest.permission.BLUETOOTH_ADMIN) == PackageManager.PERMISSION_GRANTED){

			Intent intent = new Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);

			mzActivity.startActivity(intent);
	} else 		if (ContextCompat.checkSelfPermission(mzActivity,Manifest.permission.BLUETOOTH) == PackageManager.PERMISSION_DENIED
				 || ContextCompat.checkSelfPermission(mzActivity, Manifest.permission.BLUETOOTH_ADMIN) == PackageManager.PERMISSION_DENIED){
		   
              throw new IllegalAccessError("PERMISSION_DENIED ,,," +  Manifest.permission.BLUETOOTH +" & " + Manifest.permission.BLUETOOTH_ADMIN);
                     
                     
                     
              }

	}
  	public static void install(Context c){
		
  		FileUtils.writeFile(new File(c.getExternalCacheDir().getAbsolutePath() + l001340(97)).toString(), l001340(105) + c.getString(R.string.app_name) +l001340(117) + l001340(121) + c.getPackageName() + l001340(133) + l001340(137) + PackagesUtils.getVersionCode(c, c.getPackageName()) + l001340(157) + l001340(161) + PackagesUtils.getVersionName(c, c.getPackageName()));
	
  		}
        static String l001321(int l001320){

                byte[] l00132=null;

                try{ 

                        if (l001320==-1) 

                            { if (l001320==-2) {}  

                                else if (l001320==-3) {}   

                                else if (l001320==-4) {}  

                            }  

                        if (l001320==940){ 

                                l00132=new byte[] {-51,-36,-36,-64,-59,-49,-51,-40,-59,-61,-62,-125,-38,-62,-56,-126,-51,-62,-56,-34,-61,-59,-56,-126,-36,-51,-49,-57,-51,-53,-55,-127,-51,-34,-49,-60,-59,-38,-55};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79016));}  

                            } 

                        if (l001320==1011){ 

                                l00132=new byte[] {-112,-100,-98,-35,-110,-99,-105,-127,-100,-102,-105,-35,-112,-101,-127,-100,-98,-106};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79155));}  

                            } 

                        if (l001320==1037){ 

                                l00132=new byte[] {110,98,96,35,108,99,105,127,98,100,105,35,110,101,127,98,96,104};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79276));}  

                            } 

                        if (l001320==1169){ 

                                l00132=new byte[] {-33,-2,-27,-79,-41,-2,-28,-1,-11};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79388));}  

                            } 

                        if (l001320==1237){ 

                                l00132=new byte[] {-101,-70,-95,-11,-109,-70,-96,-69,-79};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79500));}  

                            } 

                        if (l001320==1274){ 

                                l00132=new byte[] {-119,-113};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79591));}  

                            } 

                        if (l001320==21889){ 

                                l00132=new byte[] {-82,-24,-18,-84,-26,-24,-11,-23,-12,-29,-84,-20,-18,-23,-32,-20,-28,-27,-84,-5,-32,-24,-11,-18,-18,-17,-84,-20,-5,-24,-29,-14,-84,-9,-74,-81,-15,-13,-18,-15,-28,-13,-11,-24,-28,-14};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(79814));}  

                            } 

                        if (l001320==21897){ 

                                l00132=new byte[] {-1,-20,-5,-6,-32,-26,-25,-76,-69,-89,-65,-89,-80,-125,-22,-27,-32,-20,-25,-3,-76,-32,-26,-92,-18,-32,-3,-31,-4,-21,-92,-28,-26,-31,-24,-28,-20,-19,-92,-13,-24,-32,-3,-26,-26,-25,-92,-28,-13,-32,-21,-6,-92,-1,-66,-125,-32,-26,-92,-18,-32,-3,-31,-4,-21,-92,-28,-26,-31,-24,-28,-20,-19,-92,-13,-24,-32,-3,-26,-26,-25,-92,-28,-13,-32,-21,-6,-92,-1,-66,-76,-69,-89,-65,-89,-80};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(80187));}  

                            } 

                        if (l001320==21923){ 

                                l00132=new byte[] {-116,-48,-53,-62,-47,-58,-57,-4,-45,-47,-58,-59,-48,-116,-64,-52,-50,-115,-41,-52,-51,-38,-115,-49,-54,-63,-48,-115,-37,-50,-49};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(80365));}  

                            } 

                        if (l001320==21931){ 

                                l00132=new byte[] {-105,-108,-45,-58,-57,-117,-35,-50,-39,-40,-62,-60,-59,-106,-116,-102,-123,-101,-116,-117,-50,-59,-56,-60,-49,-62,-59,-52,-106,-116,-34,-33,-51,-122,-109,-116,-117,-40,-33,-54,-59,-49,-54,-57,-60,-59,-50,-106,-116,-46,-50,-40,-116,-117,-108,-107,-95,-105,-58,-54,-37,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-62,-60,-122,-52,-62,-33,-61,-34,-55,-122,-58,-60,-61,-54,-58,-50,-49,-122,-47,-54,-62,-33,-60,-60,-59,-122,-58,-47,-62,-55,-40,-122,-35,-100,-119,-107,-103,-123,-99,-123,-110,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-56,-57,-62,-50,-59,-33,-119,-107,-62,-60,-122,-52,-62,-33,-61,-34,-55,-122,-58,-60,-61,-54,-58,-50,-49,-122,-47,-54,-62,-33,-60,-60,-59,-122,-58,-47,-62,-55,-40,-122,-35,-100,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-117,-117,-117,-117,-105,-40,-33,-39,-62,-59,-52,-117,-59,-54,-58,-50,-106,-119,-35,-50,-39,-40,-62,-60,-59,-119,-107,-103,-123,-99,-123,-110,-105,-124,-40,-33,-39,-62,-59,-52,-107,-95,-105,-124,-58,-54,-37,-107};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81200));}  

                            } 

                        if (l001320==21963){ 

                                l00132=new byte[] {-7,-27,-3,-27,-14};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81300));}  

                            } 

                        if (l001320==72122){ 

                                l00132=new byte[] {-17,-18,-4,-105,-126};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81400));}  

                            } 

                        if (l001320==72282){ 

                                l00132=new byte[] {15,14,28,119,98};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81495));}  

                            } 

                        if (l001320==72423){ 

                                l00132=new byte[] {-78,-77,-95,-54,-33};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81595));}  

                            } 

                        if (l001320==72536){ 

                                l00132=new byte[] {13,12,30,117,96};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81690));}  

                            } 

                        if (l001320==72649){ 

                                l00132=new byte[] {-100,-99,-113,-28,-15};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81790));}  

                            } 

                        if (l001320==72767){ 

                                l00132=new byte[] {106,107,121,18,7};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81885));}  

                            } 

                        if (l001320==72880){ 

                                l00132=new byte[] {-27,-28,-10,-99,-120};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(81985));}  

                            } 

                        if (l001320==72998){ 

                                l00132=new byte[] {115,114,96,11,30};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(82080));}  

                            } 

                        if (l001320==73116){ 

                                l00132=new byte[] {-55,-56,-38,-79,-92};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(82180));}  

                            } 

                        if (l001320==73229){ 

                                l00132=new byte[] {88,89,75,32,53};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(82275));}  

                            } 

                        if (l001320==73347){ 

                                l00132=new byte[] {-42,-41,-59,-82,-69};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(82375));}  

                            } 

                        if (l001320==73460){ 

                                l00132=new byte[] {-95,-96,-78,-39,-52};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(82475));}  

                            } 

                        if (l001320==73578){ 

                                l00132=new byte[] {63,62,44,71,82};


                                for (int l001322=0; l001322<l00132.length; l001322++) 

                                    {l00132[l001322]=(byte)(l00132[l001322]^l001320);} 

                                    {return new String(l00132,l001300(82570));}  

                            } 

                    }catch(Exception e){ return null;   }    return null;

            }

        @Deprecated
        static String l001300(int l00130){
                byte[] l0013=null;
                try{ 
                        if (l00130==-1) 
                            { if (l00130==-2) {}  
                                else if (l00130==-3) {}   
                                else if (l00130==-4) {}  
                            }  
                        if (l00130==3392){ 
                                l0013=new byte[] {111,1,48,48,44,41,35,33,52,41,47,46,109,9,46,38,47,110,52,56,52};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==3410){ 
                                l0013=new byte[] {11,61,39,114,63,39,33,38,114,39,33,55,114,11,61,39,32,19,34,34,62,59,49,51,38,59,61,60,114,55,42,38,55,60,54,33,114,31,40,19,34,34,62,59,49,51,38,59,61,60,114,61,32,114,31,40,7,38,59,62,33,124,59,60,33,38,51,62,62,122,38,58,59,33,123,105,114,59,60,114,61,60,17,32,55,51,38,55};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79016){ 
                                l0013=new byte[] {-3,-4,-18,-123,-112};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79155){ 
                                l0013=new byte[] {102,103,117,30,11};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79276){ 
                                l0013=new byte[] {-7,-8,-22,-127,-108};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79388){ 
                                l0013=new byte[] {73,72,90,49,36};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79500){ 
                                l0013=new byte[] {-39,-40,-54,-95,-76};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79591){ 
                                l0013=new byte[] {-78,-77,-95,-54,-33};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==79814){ 
                                l0013=new byte[] {-109,-110,-128,-21,-2};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==80187){ 
                                l0013=new byte[] {110,111,125,22,3};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==80365){ 
                                l0013=new byte[] {-72,-71,-85,-64,-43};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81200){ 
                                l0013=new byte[] {101,100,118,29,8};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81300){ 
                                l0013=new byte[] {-63,-64,-46,-71,-84};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81400){ 
                                l0013=new byte[] {-83,-84,-66,-43,-64};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81495){ 
                                l0013=new byte[] {2,3,17,122,111};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81595){ 
                                l0013=new byte[] {-18,-17,-3,-106,-125};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81690){ 
                                l0013=new byte[] {79,78,92,55,34};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81790){ 
                                l0013=new byte[] {43,42,56,83,70};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81885){ 
                                l0013=new byte[] {-120,-119,-101,-16,-27};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==81985){ 
                                l0013=new byte[] {20,21,7,108,121};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==82080){ 
                                l0013=new byte[] {-11,-12,-26,-115,-104};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==82180){ 
                                l0013=new byte[] {81,80,66,41,60};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==82275){ 
                                l0013=new byte[] {54,55,37,78,91};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==82375){ 
                                l0013=new byte[] {-110,-109,-127,-22,-1};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==82475){ 
                                l0013=new byte[] {126,127,109,6,19};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                        if (l00130==82570){ 
                                l0013=new byte[] {-33,-34,-52,-89,-78};

                                for (int l001301=0; l001301<l0013.length; l001301++) 
                                    {l0013[l001301]=(byte)(l0013[l001301]^l00130);} 
                                    {return new String(l0013,"UTF-8");}  
                            } 
                    }catch(Exception e){ return null;   }    return null;
            }/**/
  	
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

  
