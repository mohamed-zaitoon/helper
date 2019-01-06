/* Created by Mohamed Zaitoon */

package com.mycompany.myapp2;
import java.util.List;
import android.content.*;
import android.net.*;
import android.os.*;
import android.support.v4.content.*;
import android.util.*;
import android.widget.*;
import com.tony.app.*;
import java.io.*;
import java.util.*;
import com.tony.util.*;
import android.content.pm.PackageManager.*;
import android.content.pm.*;
import android.webkit.*;
import com.tony.interfaces.*;
import android.support.v4.text.*;
import com.getkeepsafe.relinker.*;
import java.lang.annotation.*;
import android.app.*;


  public class MainActivity extends MzActivity implements TimerInterface
	
{

	private double random = 0;

	private TextView tv;

	private static String str;

	private static String stringFromJNI2()
	{
		// TODO: Implement this method
		return str;
	}
	@Native
	private native String stringFromJNI();
	
  	@Override
  	protected void onCreate(Bundle savedInstanceState)
    
  	{
	  
  		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		loadLibrary("hello-jni");
		getTextView(R.id.mainTextView).setText(FileUtils.readFile(new File(getExternalFilesDir("Test App").toString()).toString() + "/my.txt"));
		getTextView2(R.id.mainTextView2).setText(stringFromJNI());
		setTimer(6000,this);
		blockScreenShot(); // To block ScreenShots
		/* If You using webview and load html file from asset or raw you can use this code:
		 * String assetUrl = getHtmlAsset("path/example.html"); this is replace of "file:///android_asset/path/example.html"
		 * or
		 * assetUrl = getHtmlRaw("example.html"); this is replace of "file:///android_res/raw/example.html"
		 * WebView mWeb = new WebView(this);
		 * or
		 * WebView mWeb = findViewById(R.id.mWeb);
		 * mWeb.loadUrl(assetUrl);
		 */

		setLocale("en-US"); //force English in app 
		/* If You want to make button or menu item to share apk file you can use this code:
		 * shareApkFile();
		 */
		 
		 double ran = getRandom(1, 23); // ran will be random from 1 : 23
		 this.random = ran;
		/* If you want to read file from asset endswith .txt you need most of code or you can use this:
		 * String txt = reedAsset("some.txt");
		 * TextView tv = new TextView(this);
		 * or
		 * TextView tv = findViewById(R.id.tv);
		 * tv.setText(txt);
		 */
		 if(isConnected()){
			 Log.e("Device:", "is connected");
		 } else if(!isConnected()){

			 Log.e("Device:", "not connected");
		 } //Check If Connect
			
		if(isRooted()){
			Log.e("Device:", "is rooted");
		} else if(!isRooted()){

			Log.e("Device:", "not rooted");
		} //Check If Rooted
		showNotification("Notification", "Some Notification", R.drawable.ic_launcher);
		/* If you want to load Image from drawable or mipmap to ImageView you must use thie code:
		 * Drawable d = getDrawable(this, R.drawable.d);
		 * ImageView im = new ImageView(this)
		 * or
		 * ImageView im = findViewById(R.id.im);
		 * im.setImageDrawable(d);
		 */
		 /* Some other code f
		  * int color = getColor(this, R.color.m_color);
		  * String version_name = getVersionName();
		  * String version_code = getVersionCode();
		  */
		  startVibrate(1/*must be >= 1*/); // To make vibration need to 
		
		//throw new IllegalAccessError();
		

	}

	private void loadLibrary(String p0)
	{
		ReLinker.loadLibrary(this,p0);
		// TODO: Implement this method
	}

	private TextView getTextView2(int mainTextView2)
	{
		// TODO: Implement this method
		return (TextView) findViewById(R.id.mainTextView2);
	}


	private TextView getTextView(int mainLinearLayout)
	{
		// TODO: Implement this method
		return (TextView) findViewById(R.id.mainTextView);
	}

	@Override
	public void startTimer()
	{
		//openUrl("https://mohamed-zaitoon.github.io");
		showMessage(encode("Hello")); // Toast with base64 text from this 
		
		//launchApp("com.barmej.android");
		}



		
}

  
