package com.quize_app.quizeapp.utils;

import java.util.Random;

public class RandomTitle {

    static String courseTitle[] ={"Introduction and Basics","Control Flow and Functions"," Data Structures and Collections","Object-Oriented Programming (OOP)",
            "Exception Handling and File I/O","Advanced Concepts and Patterns","Algorithms and Problem Solving","Concurrency and Multithreading","Web Development and APIs","Database Integration and Final Projects"};
    public static String courseTitle()
    {
        Random random= new Random();
        int index=random.nextInt(courseTitle.length);
        return courseTitle[index];
    }

//    public static void main(String[] args) {
//        System.out.println(courseTitle());
//    }

}
