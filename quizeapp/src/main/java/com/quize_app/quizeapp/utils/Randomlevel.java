package com.quize_app.quizeapp.utils;

import java.util.Random;

public class Randomlevel {
    public static int randomLevel(){
        Random random=new Random();
        int min=1,max=10;
        return min+random.nextInt(max-min);
    }
//  public static void main(String[] args) {
//       System.out.println(randomLevel());
//    }
}
