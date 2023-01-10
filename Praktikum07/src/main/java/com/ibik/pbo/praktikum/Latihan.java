package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.util.Enumeration;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Latihan {
    public static void main(String[] args) {

        JRadioButton button1 = new JRadioButton("Red");
        JRadioButton button2 = new JRadioButton("Green");
        JRadioButton button3 = new JRadioButton("Blue");
        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(button1);
        colorButtonGroup.add(button2);
        colorButtonGroup.add(button3);
        button1.setSelected(true);

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("Color:"));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.pack();
        frame.setVisible(true);

        System.out.println(getSelection(colorButtonGroup));

    }

    public static JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration<?> e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }
}