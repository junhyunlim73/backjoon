package backjoon.bin.programers;

import java.util.Calendar;
import java.util.Date;

public class DayCalendar {
    public static void main(String[] args){
        int a = 5;
        int b = 24;
        String answer = "";
        Date date = new Date(2016, a-1, b);
        switch (date.getDay()){
            case 0:
                answer = "SAT";
                break;
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
        }

        System.out.println(answer);
    }
}
