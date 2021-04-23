package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws ParseException {

        int noOfDaysRemove=5;

        final Calendar cal=Calendar.getInstance();
       // System.out.println(cal);
       // System.out.println(cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH,-noOfDaysRemove);
       // System.out.println(cal);

        final Date oldDate = cal.getTime();
       // System.out.println(oldDate);

        LocalDate date1 = LocalDate.now().minusDays(5);
        System.out.println(date1);

   /*     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format("Mon Mar 15 17:01:20 IST 2021");
        System.out.println("today"+date);*/

        LocalDate localDateTime=LocalDate.now().minusDays(5);
        String date2=localDateTime.toString();
        System.out.println(date2);

      /*  List<Integer> arrayList= Arrays.asList(10,20,30,50,40,60,80);
        arrayList.stream().forEach(System.out::println);*/

     /*   String date3="Mon Mar 15 17:01:20 IST 2021";
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date3.format(String.valueOf(myFormatObj));
        System.out.println(formattedDate);*/

        Date date3=new Date();
        System.out.println(date3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format("Mon Mar 15 17:01:20 IST 2021"));


    }
    }

