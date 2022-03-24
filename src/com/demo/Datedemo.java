package com.demo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Datedemo {
    public static void main(String[] args){
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        LocalDateTime mydt = LocalDateTime.now();
        DateTimeFormatter myfor = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = mydate.format(myfor);
        System.out.println(mydate);
        System.out.println(mytime);
        System.out.println(mydt);
        System.out.println(formattedDate);

    }
}
