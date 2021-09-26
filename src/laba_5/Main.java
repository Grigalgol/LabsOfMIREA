package laba_5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends JFrame {
    public Main(String path){
        File file = new File(path);
        int width;
        int height;
        /*BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        width = bufferedImage.getWidth();
        height = bufferedImage.getHeight(); */
        setSize(1000, 1000);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        Graphics g = getGraphics();
        Image image = null;
        try {
            image = ImageIO.read(new File(path));
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{
        String path = args[0].toString();
        var frame = new Main(path);
    }
}
