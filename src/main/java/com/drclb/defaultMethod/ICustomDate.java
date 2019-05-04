package com.drclb.defaultMethod;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public interface ICustomDate {
    String printDate();

    default LocalDateTime getTodayDate(){
        return LocalDateTime.now();
    }

    default Month getCurrentMonth(){
        return getTodayDate().getMonth();
    }
}
