package laba_9;

import java.util.Scanner;

public class ThrowsDemo {
   /* public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        // do something with the key
    } */
    /*
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for" + key;
    }*/

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("Key set to empty string");
            }
        } catch (NullPointerException e) {
            return "null";
        }
        return "data for " + key;
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

}

