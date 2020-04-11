-keepparameternames
-renamesourcefileattribute MzSource
-keepattributes SourceFile,LineNumberTable



-keepattributes *Annotation*

-ignorewarnings
-dontwarn
-dontnote

-keepclasseswithmembernames class * {
    native <methods>;
    public *;
}
-keepclasseswithmembernames interface * {
    *;
}

-keep public class * {
    public *;
}
-keep public interface * {
*;
}
