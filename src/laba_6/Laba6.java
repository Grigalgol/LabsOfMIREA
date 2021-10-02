package laba_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laba6 extends JFrame {
    JButton but1 = new JButton("Ответить");
    JLabel lbl = new JLabel("***");
    JTextField textField = new JTextField(2);
    int x;
    int countTry;

    public Laba6() {
        setLayout(null);
        setSize(400, 200);
        this.setDefaultCloseOperation(Laba6.EXIT_ON_CLOSE);
        but1.setBounds(100, 120, 200, 40);
        add(but1);
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setBounds(100, 10, 200, 40);

        add(lbl);
        textField.setBounds(100, 60, 200, 30);
        add(textField);
        x = (int)(Math.random()*20);
        countTry = 0;


        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int y = Integer.parseInt(textField.getText().trim());
                if (countTry < 3) {
                    if (x > y) {
                        lbl.setText("Загаданное число больше " + y);
                        countTry++;
                    } else if (x < y) {
                        lbl.setText("Загаданное число меньше " + y);
                        countTry++;
                    }
                    else if (x==y) {
                        JDialog dialog = createDialog("Удача", false, "Поздравляю, вы угадали загаданное число: "+x);
                        dialog.setVisible(true);
                    }
                }
                else {
                    JDialog dialog = createDialog("Неудача", false, "Вы не угадали, загаданное число: "+x);
                    dialog.setVisible(true);
                }
            }
        });
    }

    private JDialog createDialog(String title, boolean modal, String message)
    {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(350, 100);
        JLabel msg = new JLabel(message);
        msg.setHorizontalAlignment(JLabel.CENTER);
        msg.setBounds(50, 30, 250, 30);
        dialog.add(msg);
        return dialog;
    }

    public static void main(String[] args) {
        new Laba6().setVisible(true);
    }
}
