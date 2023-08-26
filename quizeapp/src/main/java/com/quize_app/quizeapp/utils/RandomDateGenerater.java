package com.quize_app.quizeapp.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomDateGenerater {
    public static Date createDate()
    {
        Random random= new Random();
        Calendar calender = Calendar.getInstance();
        Date now = new Date();
        int daysToSubstract = -1 * random.nextInt(25);
        calender.setTime(now);
        calender.add(Calendar.DAY_OF_YEAR, daysToSubstract);
        Date yesterday = calender.getTime();
        return yesterday;
    }
    public static Date modifiedDate()
    {
        Random random= new Random();
        Calendar calender = Calendar.getInstance();
        Date now = new Date();
        int daysToAdd = 1 * random.nextInt(25);
        calender.setTime(now);
        calender.add(Calendar.DAY_OF_YEAR, daysToAdd);
        Date yesterday = calender.getTime();
        return yesterday;
    }

//    public static void main(String[] args) {
//        System.out.println("create date="+RandomDateGenerater.createDate());
//        System.out.println("modified date="+RandomDateGenerater.modifiedDate());
//    }
}
