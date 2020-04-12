package com.weborders.utilities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtilities {
    //This methos will return current date as a String
    //provide a format as a parameter
    //MM - to specify month like : 01,  02,  03
    //MMM - to specify month like: Jan, Feb, Mar
    //dd - to specify day like 01,02,03
    //yyy - to specify year like 2010,2020
    public static String getCurrentDate(String format){
        return LocalDate.now().format(DateTimeFormatter.ofPattern(format));
    }

    public static long getTimeDifference(String start, String end, String format){
        LocalTime startTime= LocalTime.parse(start, DateTimeFormatter.ofPattern(format));
        LocalTime endTime= LocalTime.parse(end, DateTimeFormatter.ofPattern(format));
        return ChronoUnit.HOURS.between(startTime,endTime);
    }
}
