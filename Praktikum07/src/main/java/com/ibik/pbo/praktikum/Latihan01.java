package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan01 {
    public static void main(String[] args) {

        // String title[] = { "Hello", "Everyone", "IBIK" };

        JButton button1 = new JButton("Hello");
        ActionListener actionButton1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello Everyone !!",
                        "You was clicked the Hello Button.", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        JButton button2 = new JButton("Everyone");
        ActionListener actionButton2 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This Everyone Button, Thanks", "You was clicked the Everyone Button",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };

        JButton button3 = new JButton("IBIK");
        ActionListener actionButton3 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "IBIK is an abbreviaton for 'Institut Bisnis dan Informatika Kesatuan'",
                        "You was clicked IBIK button",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setTitle("Latihan 01");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        button1.addActionListener(actionButton1);
        northPanel.add(button1);

        button2.addActionListener(actionButton2);
        northPanel.add(button2);

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        button3.addActionListener(actionButton3);
        southPanel.add(button3);

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300, 300);
    }
}