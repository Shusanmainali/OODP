package Workshop8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, result;
    JButton add, sub, mul, div;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 250);
        setLayout(new GridLayout(5, 2));

        t1 = new JTextField();
        t2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add(new JLabel("Number 1:"));
        add(t1);
        add(new JLabel("Number 2:"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new JLabel("Result:"));
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double res = 0;

        if (e.getSource() == add) res = a + b;
        if (e.getSource() == sub) res = a - b;
        if (e.getSource() == mul) res = a * b;
        if (e.getSource() == div) res = a / b;

        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
