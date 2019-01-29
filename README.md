
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


 implementation 'io.github.mohamed-zaitoon:mzlibs:3.1.1'
 
}
```

## Quick Tutorial

If you want to make timer or show toast you need to add most of code in your class.
or you can make `MainActivity` class, extends  `Activity` class:
```java
package com.example.app;
   
   
   import android.os.Bundle.
   
   import com.tony.util.*;
   
   import com.tony.interfaces.*;
   
   public class MainActivity extends Activity implements TimerInterface {
   
       @Override
       portected void onCreate(Bundle bundle){
          super.onCreate(bundle);
          MzUtils.setTimer(this,6000,this);
           
       }
       
   // you must add this
   @Override 
   public void startTimer {
      MzUtils.showMessage(getApplicationContext(),"Hello Man"); // this Toast message will be show after minute 
   }
   }
 ```
 In progaurd-rules.pro add this lines:
 ```txt
-keepclassmembers class com.tony.util.** {*; }
-keep public class com.tony.util.** { *;}
-keepclassmembers interface com.tony.interfaces.** {*;}
-keep public interface com.tony.interfaces.** {*;}
```

 
 
