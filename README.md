
UTC Time convertor for all Time Zones

  
1.Add this to library to build.gradle file.  
  
  
  gradle dependency
  compile 'com.github.johnwilfred07:john_1st:-SNAPSHOT'



//Usage

2.Declare the TimeZone class in your MainActivity.class

  TimeZone timezone=new TimeZone();



3.Call the method with reference to the object of the class


//returns the UTC_time in String 
 String UTC_time = timezone.Common_UTC_Converter(String date_to_be_passed,String time_to_be_passed)
