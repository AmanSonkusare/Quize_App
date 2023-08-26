package com.quize_app.quizeapp.utils;

import java.util.Random;

public class RandomWeekNumber {


    public static int week()
    {
        Random random= new Random();
        int max=10;
        int min=1;
        int randomweek = random.nextInt(max-min+1)+min;
        System.out.println(randomweek);
        return randomweek;
    }

//    public static void main(String[] args) {
//        System.out.println(RandomWeekNumber.week());
//    }
}
