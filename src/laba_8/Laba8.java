package laba_8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Laba8 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\laba8.txt");
            int c;
            while ((c=reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
