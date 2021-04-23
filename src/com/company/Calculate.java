package com.company;

import java.time.Duration;
import java.time.LocalDate;

import java.util.Date;


public class Calculate {

    public static void main(String[] args) {

        // Or where ever you get it from
        Date date = new Date();
        System.out.println(date);

        LocalDate date1 = LocalDate.now().minusDays(1);
        System.out.println(date1);

        Date currentDate = new Date();
        Date oneDayFromCurrentDate = new Date(currentDate.getTime() - Duration.ofDays(1).toMillis());
        System.out.println(oneDayFromCurrentDate);

   /*     Date dateBefore5Days = DateUtils.addDays(new Date(),-5);
        System.out.println(dateBefore5Days);*/
    }
}
