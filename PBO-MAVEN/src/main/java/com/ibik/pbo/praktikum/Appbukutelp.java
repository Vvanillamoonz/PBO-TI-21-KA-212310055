package com.ibik.pbo.praktikum;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Appbukutelp {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("Nama Lengkap");
        data.add("Alamat");
        data.add("No. Telp");

        ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < data.size(); i++) {
            contact.add(new ArrayList<String>());
            for (int j = 0; j < data.size(); j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan " + data.get(j) + ":",
                        "Data ke - " + (i + 1), JOptionPane.QUESTION_MESSAGE);
                contact.get(i).add(j, value);
            }
        }

        String output = "";

        for (int i = 0; i < data.size(); i++) {
            output += "Data ke - " + (i + 1) + "\n";
            for (int j = 0; j < data.size(); j++) {
                output += data.get(j) + ": " + contact.get(i).get(j) + "\n";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(contact);
    }
}