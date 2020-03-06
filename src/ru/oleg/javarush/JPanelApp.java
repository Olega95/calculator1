package ru.oleg.javarush;

import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class JPanelApp extends JPanel {
    JTextField txt1 = null;
    int res = 0;
    int res1 = 0;
    String op = "";
    final Font font = new Font("serif", Font.BOLD, 25);

    public void setRes() {

    }

    public JPanelApp() {
        try {
            setLayout(null);

            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 235, 25);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 220, 150, 50);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 160, 50,50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 160, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 160, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10,100,50,50);

            JButton b5 = new JButton("5");
            b5.setBounds(60,100,50,50);

            JButton b6 = new JButton("6");
            b6.setBounds(110,100,50,50);

            JButton b7 = new JButton("7");
            b7.setBounds(10,40,50,50);

            JButton b8 = new JButton("8");
            b8.setBounds(60,40,50,50);

            JButton b9 = new JButton("9");
            b9.setBounds(110,40,50,50);

            JButton bRes = new JButton("=");
            bRes.setBounds(10,280,115,50);
            bRes.setFont(font);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(170, 40, 75, 50);
            bPlus.setFont(font);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(170,100,75,50);
            bMinus.setFont(font);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(170,160,75,50);
            bMulti.setFont(font);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(170,220,75,50);
            bDivision.setFont(font);

            JButton bClear = new JButton("Clear");
            bClear.setBounds(130, 280, 115, 50);
            bClear.setFont(font);

            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(bClear);


            b1.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 1);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b2.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 2);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b3.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 3);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b4.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 4);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b5.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 5);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b6.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 6);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b7.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 7);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b8.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 8);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b9.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 9);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            b0.addActionListener((ActionEvent actionEvent) -> {
                txt1.setText(txt1.getText() + 0);
                if (res == 0) {
                    res = Integer.parseInt(txt1.getText());
                } else {
                    res1 = Integer.parseInt(txt1.getText());
                }
            });

            bPlus.addActionListener((ActionEvent actionEvent) -> {
                res = Integer.parseInt(txt1.getText());
                txt1.setText("");
                op = "+";
            });

            bMinus.addActionListener((ActionEvent actionEvent) -> {
                res = Integer.parseInt(txt1.getText());
                txt1.setText("");
                op = "-";
            });

            bMulti.addActionListener((ActionEvent actionEvent) -> {
                res = Integer.parseInt(txt1.getText());
                txt1.setText("");
                op = "*";
            });

            bDivision.addActionListener((ActionEvent actionEvent) -> {
                res = Integer.parseInt(txt1.getText());
                txt1.setText("");
                op = "/";

            });

            bRes.addActionListener((ActionEvent actionEvent) -> {
                MetodCalc mc = new MetodCalc();
                String strRes = String.valueOf(mc.calc(res, op, res1));
                txt1.setText(strRes);
            });

            bClear.addActionListener((ActionEvent actionEvent) -> txt1.setText(null));


        } catch (ArithmeticException e) {
        }
    }
}
