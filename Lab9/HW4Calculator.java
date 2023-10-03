/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HW4Calculator extends JFrame{
    JTextField textField = new JTextField(25);
    Font font = new Font("Courier Prime", Font.PLAIN, 20);

    public HW4Calculator() {
        Container c = getContentPane();
        setTitle("Calculator");
        setLayout(new BorderLayout());
        JPanel textPanel = new JPanel();
        textField.setFont(font);
        textPanel.add(textField);
        

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        buttonPanel.setPreferredSize(new Dimension(400, 400));

        JButton clsButton = new JButton("Cls");
        clsButton.setFont(font);
        JButton bckButton = new JButton("Bck");
        bckButton.setFont(font);
        JButton closeButton = new JButton("Close");
        closeButton.setFont(font);
        JButton button7 = new JButton("7");
        button7.setFont(font);
        JButton button8 = new JButton("8");
        button8.setFont(font);
        JButton button9 = new JButton("9");
        button9.setFont(font);
        JButton buttonDivier = new JButton("/");
        buttonDivier.setFont(font);
        JButton button4 = new JButton("4");
        button4.setFont(font);
        JButton button5 = new JButton("5");
        button5.setFont(font);
        JButton button6 = new JButton("6");
        button6.setFont(font);
        JButton buttonMutiple = new JButton("*");
        buttonMutiple.setFont(font);
        JButton button1 = new JButton("1");
        button1.setFont(font);
        JButton button2 = new JButton("2");
        button2.setFont(font);
        JButton button3 = new JButton("3");
        button3.setFont(font);
        JButton buttonMinus = new JButton("-");
        buttonMinus.setFont(font);
        JButton button0 = new JButton("0");
        button0.setFont(font);
        JButton buttonPoint = new JButton(".");
        buttonPoint.setFont(font);
        JButton buttonEqual = new JButton("=");
        buttonEqual.setFont(font);
        JButton buttonPlus = new JButton("+");
        buttonPlus.setFont(font);

        ButtonHandler handler = new ButtonHandler();

        clsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        bckButton.addActionListener(handler);
        closeButton.addActionListener(handler);
        button7.addActionListener(handler);
        button8.addActionListener(handler);
        button9.addActionListener(handler);
        buttonDivier.addActionListener(handler);
        button4.addActionListener(handler);
        button5.addActionListener(handler);
        button6.addActionListener(handler);
        buttonMutiple.addActionListener(handler);
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button3.addActionListener(handler);
        buttonMinus.addActionListener(handler);
        button0.addActionListener(handler);
        buttonPoint.addActionListener(handler);
        buttonEqual.addActionListener(handler);
        buttonPlus.addActionListener(handler);

        buttonPanel.add(clsButton);
        buttonPanel.add(bckButton);
        buttonPanel.add(new JPanel());
        buttonPanel.add(closeButton);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDivier);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMutiple);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(button0);
        buttonPanel.add(buttonPoint);
        buttonPanel.add(buttonEqual);
        buttonPanel.add(buttonPlus);

        c.add(textPanel, BorderLayout.NORTH);
        c.add(buttonPanel, BorderLayout.CENTER);
        c.add(new JPanel(), BorderLayout.EAST);
        c.add(new JPanel(), BorderLayout.SOUTH);
        c.add(new JPanel(), BorderLayout.WEST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 500);        
    }
    public static void main(String[] args) {
        new HW4Calculator();

    }
    class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText() + e.getActionCommand());
        }
    }
}
