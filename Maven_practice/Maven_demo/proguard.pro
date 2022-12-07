#java -jar proguard\proguard-base-6.0.3.jar @L01.2.1.pro

-injars       target/Maven_demo.jar
-outjars      target/Maven_demo-out.jar

-printmapping pgmapout.map
-dontwarn

-keep public class com.tirsh.MainApp {public static void main(java.lang.String[]);}