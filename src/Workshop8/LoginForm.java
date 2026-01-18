package Workshop8;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener {

    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    public LoginForm() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 25);
        add(l1);

        txtUser = new JTextField();
        txtUser.setBounds(100, 20, 150, 25);
        add(txtUser);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 60, 80, 25);
        add(l2);

        txtPass = new JPasswordField();
        txtPass.setBounds(100, 60, 150, 25);
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 100, 80, 25);
        add(btnLogin);

        btnLogin.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?"
            );
            ps.setString(1, txtUser.getText());
            ps.setString(2, new String(txtPass.getPassword()));

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
