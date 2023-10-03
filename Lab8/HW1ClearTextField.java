/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW1ClearTextField extends JFrame{
    /* Attribute : Global in actionPerformed */
    private JTextField textField;
    private JButton buttonClear;
    
    /* Contructor : Create Container that want to show */
    public HW1ClearTextField(){
        super("TextField and Button");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.DARK_GRAY.darker());

        // Create Font
        Font mono = new Font("Roboto Mono", Font.BOLD, 32);

        // Create Label to show text
        JLabel label = new JLabel("Enter text here");
        label.setForeground(Color.WHITE);
        label.setFont(mono);
        c.add(label);

        // Create TextField
        textField = new JTextField(10);
        textField.setFont(mono);
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(c, textField.getText());
            }
        });
        c.add(textField);

        // Create "Clear" Button
        buttonClear = new JButton("Clear");
        buttonClear.setFont(mono);
        buttonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        c.add(buttonClear);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 360);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new HW1ClearTextField();
    }
}
