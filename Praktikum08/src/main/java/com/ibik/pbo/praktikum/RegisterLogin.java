package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterLogin extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	RegisterLogin() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(400, 400);
        setTitle("Contoh Window Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new RegisterLogin();
    }

    private void GenerateUI(RegisterLogin frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        mainPanel.add(panel1, BorderLayout.NORTH);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(22, 23, 80, 16);
        panel1.add((lblEmail));

        final JTextField textEmail = new JTextField();
        textEmail.setBounds(105, 18, 169, 30);
        panel1.add(textEmail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(22, 69, 61, 16);
        panel1.add(lblPassword);

        final JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(105, 64, 169, 30);
        panel1.add(textPassword);

        JCheckBox chkRemember = new JCheckBox("Remember Account ?");
        chkRemember.setBounds(105, 100, 169, 40);
        panel1.add(chkRemember);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(105, 150, 83, 40);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterPage regPage = new RegisterPage();
                regPage.setVisible(true);
                dispose();
            }
        });
        panel1.add(btnRegister);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(205, 150, 83, 40);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data[] = {
                        "212310055@student.ibik.ac.id",
                        "212310055",
                        "Septiawan Pratama"
                };

                String inputedPass = new String(textPassword.getPassword());

                if (textEmail.getText().isEmpty() || inputedPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Silakan mengisi data dengan benar", "Alert!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!textEmail.getText().equals(data[0]) && !inputedPass.equals(data[1])) {
                        JOptionPane.showMessageDialog(null, "Data yang anda masukan salah!", "Alert!",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Selamat datang " + data[2], "Success!",
                                JOptionPane.INFORMATION_MESSAGE);

                        // Redirect to Form
                        FormPage formPage = new FormPage();
                        formPage.setVisible(true);
                        dispose();
                    }
                }
            }
        });
        panel1.add(btnLogin);

        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setBackground(Color.BLUE);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}