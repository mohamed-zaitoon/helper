
# mzlibs


[![](https://jitpack.io/v/io.github.mohamed-zaitoon/mzlibs.svg)](https://jitpack.io/#io.github.mohamed-zaitoon/mzlibs)


An Android library that provides most of used in one Class.


## Download

```java
android {
    /* Android Gradle Plugin 3.0.0+ is required to support Java 8 desugaring */
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
 implementation 'com.android.support:appcompat-v7:27.0.2'
	
     implementation 'io.github.mohamed-zaitoon:mzlibs:3.0.4'
}
```

## Quick Tutorial

If you want to make timer or show toast you need to add most of code in your class.
or you can make `MainActivity` class, extends  `MzActivity` class:
```java
package com.example.app;
   
   import com.tony.app.MzActivity;
   
   
   import android.os.Bundle.
   
   import com.tony.util.*;
   
   import com.tony.interfaces.*;
   
   public class MainActivity extends MzActivity implements TimerInterface {
   
       @Override
       portected void onCreate(Bundle bundle){
          super.onCreate(bundle);
          MzUtils.setTimer(this,6000,this);
           
       }
       
   // you must add this
   @Override 
   public void startTimer {
      MzUtils.showMessage(this,"Hello Man"); // this Toast message will be show after minute 
   }
   }
 ``` 
 In this file res/values/styles.xml your theme best be this:
```xml
<resources>

	<!-- MzStyle is parent of theme AppCompat -->
    <!-- if you wont use this theme your app will be crash -->
    
   <style name= "AppTheme_Dark" parent= "@style/Theme.MzStyle">
   </style>
   
   <style name= "AppTheme_NoActionBar" parent= "@style/Theme.MzStyle.NoActionBar">
   </style>
   
   <style name= "AppTheme_NoActionBar_Fullscreen" parent= "@style/Theme.MzStyle.NoActionBar.Fullscreen">
   </style>
   
   <style name= "AppTheme_Light" parent= "@style/Theme.MzStyle.Light">
   </style>
   
   <style name= "AppTheme_Light_DarkActionBar" parent= "@style/Theme.MzStyle.Light.DarkActionBar">
   </style>
   
	<style name= "AppTheme_Light_NoActionBar" parent= "@style/Theme.MzStyle.Light.NoActionBar">
   </style>
   
	<style name= "AppTheme_Light_NoActionBar_Fullscreen" parent= "@style/Theme.MzStyle.Light.NoActionBar.Fullscreen">
   </style>
 </resources>
 ```
 In progaurd-rules.pro add this lines:
 ```txt
-keepclassmembers class com.tony.** {*; }
-keep public class com.tony.** { *;}
-keepclassmembers interface com.tony.** {*;}
-keep public interface com.tony.** {*;}
```

 
 
