-keepparameternames
-renamesourcefileattribute MzSource
-keepattributes Exceptions,InnerClasses,Signature,Deprecated,
                SourceFile,LineNumberTable,EnclosingMethod

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
