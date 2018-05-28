/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateprogram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bhanupro
 */
public class DateProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter from date (format:01 12 2018)");
        Scanner in = new Scanner(System.in);
        
        int d = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        
        LocalDate ld = LocalDate.of(y,m,d);
        System.out.println("Enter To's date(format:28 05 2018)");
        
        int dd = in.nextInt();
        int mm = in.nextInt();
        int yy = in.nextInt();
        
        LocalDate ld2 = LocalDate.of(yy, mm, dd);
        System.out.println("From date: " + ld);
        System.out.println("To's date: "+ ld2);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println("Today's date : " + dtf.format(now));
        String[] ymd = dtf.format(now).split("-");
        int currentYear = Integer.parseInt(ymd[0]);
        int currentMonth = Integer.parseInt(ymd[1]);
        int currentDay = Integer.parseInt(ymd[2]);
        System.out.println("Output");
        System.out.println("fromdatereturn :"+localDate(y,m,1));
            
       if(yy == currentYear && mm == currentMonth){
           System.out.println("todatereturn :"+localDate(yy,mm,currentDay));
       }else{
           System.out.println("todatereturn :"+localDate(yy,mm,noOfDaysInMonth(yy,mm)));
       }
            
    }
    private static LocalDate localDate(int year,int month, int day){
        return LocalDate.of(year, month,day);
    }
    private static int noOfDaysInMonth(int year, int month){
        YearMonth yearMonthObj = YearMonth.of(year, month);
            int lengthOfMonth = yearMonthObj.lengthOfMonth();
            System.out.println(lengthOfMonth);
            return lengthOfMonth;
    }
    
}
