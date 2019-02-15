
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


 implementation 'io.github.mohamed-zaitoon:mzlibs:4.1.3'
 
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
-keepclassmembers class com.tony.** {*; }
-keep public class com.tony.** { *;}
-keepclassmembers interface com.tony.** {*;}
-keep public interface com.tony.** {*;}
 
```

 ## License 
```txt
   Copyright 2019 Tony, Inc. 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

 
 

