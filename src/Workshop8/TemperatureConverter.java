package Workshop8;

import javax.swing.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    JTextField celsius, fahrenheit;
    JButton convert;

    public TemperatureConverter() {
        setTitle("Celsius to Fahrenheit");
        setSize(300, 150);
        setLayout(null);

        JLabel l1 = new JLabel("Celsius:");
        l1.setBounds(20, 20, 80, 25);
        add(l1);

        celsius = new JTextField();
        celsius.setBounds(100, 20, 100, 25);
        add(celsius);

        convert = new JButton("Convert");
        convert.setBounds(20, 60, 100, 25);
        add(convert);

        fahrenheit = new JTextField();
        fahrenheit.setBounds(100, 60, 100, 25);
        add(fahrenheit);

        convert.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double c = Double.parseDouble(celsius.getText());
        double f = (c * 9 / 5) + 32;
        fahrenheit.setText(String.valueOf(f));
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
