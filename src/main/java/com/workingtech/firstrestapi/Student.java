package com.workingtech.firstrestapi;

import com.workingtech.firstrestapi.Base.Human;

public class Student extends Human {

    private static Integer studentCounter = 0;
    public Student(){
        super(1,"Ali", "Veli");
    }

    public static void incrementCounter(){
        studentCounter++;
    }

}
