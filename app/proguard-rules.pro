-renamesourcefileattribute MzSource
-keepattributes SourceFile,LineNumberTable

-keepattributes *Annotation*

-ignorewarnings
-dontwarn
-dontnote
-repackageclasses


-dontwarn androidx.arch.**
-dontwarn androidx.lifecycle.**
-keep class androidx.arch.** { *; }
-keep class androidx.lifecycle.** { *; }
-keep public class com.mycompany.myapp2.** {*; }

