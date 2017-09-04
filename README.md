
UTC Time convertor for all Time Zones

  
1.Add this to library to build.gradle file.  
  
  
  gradle dependency
  compile 'com.github.johnwilfred07:john_1st:-SNAPSHOT'



//Usage

2.Declare the TimeZone class in your MainActivity.class

  UTC_converter utc_converter = new UTC_converter();



3.Call the method with reference to the object of the class


//Returns the UTC_time in String 
 String UTC_time = utc_converter.Common_UTC_Converter(String date_to_be_passed,String time_to_be_passed)
 
 
 
 Note:If library not importing in build.gradle 
 Add this to your project module  

allprojects {
    repositories {
       **// maven { url 'https://jitpack.io' }//**
    }
}
