package nanonino.mylibrary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by nnandroid03user on 4/9/17.
 */

public class Timesss {
    public int getdifferencewith_two_times(String strDate1, String strDate2) {
        int totalmin = 0;
        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss aa");
        // String strDate = sdf.format(c.getTime());
        //  System.out.println("the current time 1 is "+strDate);

        Date date1 = null;
        Date date2 = null;

        try {
            date1 = sdf.parse(strDate1);
            date2 = sdf.parse(strDate2);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        long difference = date2.getTime() - date1.getTime();
        int days = (int) (difference / (1000 * 60 * 60 * 24));
        int hours = (int) ((difference - (1000 * 60 * 60 * 24 * days)) / (1000 * 60 * 60));
        int min = (int) (difference - (1000 * 60 * 60 * 24 * days) - (1000 * 60 * 60 * hours)) / (1000 * 60);
        hours = (hours < 0 ? -hours : hours);
        System.out.println("the total minutes is 1" + date1 + "  " + date2);
        totalmin = min;
        System.out.println("the total minutes is 2" + min);
        return totalmin;
    }

    public String Common_UTC_Converter(String date_passes, String time) {
        String final_UTC_time = null;
        Date date = null;
        SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //  sdfInput.setTimeZone(TimeZone.getTimeZone("UTC"));

        try {
            try {
                date = sdfInput.parse(date_passes + " " + time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("Date:" + date); //Fri Jun 12 04:28:57 IST 2015\
            SimpleDateFormat sdfOutput = new SimpleDateFormat("hh:mm a");
            Date converted_date = getDateInTimeZone(date, TimeZone.getDefault().getID());

            final_UTC_time = sdfOutput.format(converted_date);
            System.out.println("dateStr2_home:" + final_UTC_time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return final_UTC_time;

    }


    public Date getDateInTimeZone(Date currentDate, String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        simpleDateFormat.setTimeZone(timeZone);
        Date localDateTime = new Date(currentDate.getTime() + timeZone.getOffset(currentDate.getTime()));
        return localDateTime;
    }
}
