package nanonino.timesfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import nanonino.mylibrary.UTC_Converter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss aa");
        String strDate = sdf.format(c.getTime());
        System.out.println("the current time 1 is " + strDate);
        UTC_Converter utc_converter = new UTC_Converter();
        int time = utc_converter.getdifferencewith_two_times(strDate, strDate);
        System.out.println("the time is  is " + time);


    }
}
