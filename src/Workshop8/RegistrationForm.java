package Workshop8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

    JTextField txtName, txtEmail, txtUsername;
    JPasswordField txtPassword;
    JButton btnRegister;

    public RegistrationForm() {
        setTitle("User Registration");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel("Username:"));
        txtUsername = new JTextField();
        add(txtUsername);

        add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnRegister = new JButton("Register");
        add(btnRegister);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
