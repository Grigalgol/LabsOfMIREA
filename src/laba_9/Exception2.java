package laba_9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }
        catch(Exception e) {
            System.out.println("general exception");
        }
        finally {
            System.out.println("Finally block is executed");
        }
    }
}

