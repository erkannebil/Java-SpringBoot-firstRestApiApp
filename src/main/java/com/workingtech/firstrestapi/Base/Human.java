package com.workingtech.firstrestapi.Base;

import org.springframework.scheduling.support.SimpleTriggerContext;

public class Human {

    public Human(Integer id, String name, String surname) {
        this.id = id;
        Name = name;
        Surname = surname;
    }

    public Integer id;
    public String Name;
    public String Surname;

}
