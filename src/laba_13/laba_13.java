package laba_13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class laba_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        Calendar todayDate = new GregorianCalendar();
        System.out.println("Введите дату (день месяц год часы минуты секунды)");
        Calendar userDate = new GregorianCalendar();
        userDate.set(Calendar.DAY_OF_MONTH, scanner.nextInt()-1);
        userDate.set(Calendar.MONTH, scanner.nextInt()-1);
        userDate.set(Calendar.YEAR, scanner.nextInt());
        userDate.set(Calendar.HOUR, scanner.nextInt());
        userDate.set(Calendar.MINUTE, scanner.nextInt());
        userDate.set(Calendar.SECOND, scanner.nextInt());

        if (todayDate.before(userDate)) {
            System.out.println(simpleDateFormat.format(todayDate.getTime()) + " > " + simpleDateFormat.format(userDate.getTime()));
        }
        else {
            System.out.println(simpleDateFormat.format(todayDate.getTime()) + " < " + simpleDateFormat.format(userDate.getTime()));
        }
    }
}
