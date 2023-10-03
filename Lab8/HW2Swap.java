/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW2Swap extends JFrame{
    /* Attribute : Globle variable for Event_Handler */
    private JTextField textField1, textField2;
    private JCheckBox checkBox1, checkBox2;
    private JButton button1, button2;
    private JLabel label;
    private int checkSwap = 1;
    private int checkModify = 0;

    /* Constructor : For Creating window for work */
    public HW2Swap(){
        super("Swap");
        /* Create Container for adding many panel */
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.DARK_GRAY.darker());

        /* Create Font to be use */
        Font mono = new Font("Roboto Mono", Font.PLAIN, 20);

        /* Create Title from JLable */
        JLabel title = new JLabel("SWAPER App");
        title.setFont(new Font("Roboto Mono", Font.BOLD + Font.ITALIC, 30));
        title.setForeground(Color.WHITE.brighter());
        // Add title to panel
        JPanel titlePanel = new JPanel();
        titlePanel.add(title);
        titlePanel.setBackground(Color.DARK_GRAY.darker());
        titlePanel.setPreferredSize(new Dimension(400, 50));
        c.add(titlePanel);

        /* Create TextField */
        textField1 = new JTextField(10);
        textField1.setFont(mono);
        textField2 = new JTextField(10);
        textField2.setFont(mono);
        // Add TextField to panel
        JPanel textfieldpPanel = new JPanel();
        textfieldpPanel.add(textField1);
        textfieldpPanel.add(textField2);
        textfieldpPanel.setBackground(Color.DARK_GRAY.darker());
        c.add(textfieldpPanel);

        /* Create CheckBox */
        // "Swap" checkbox
        checkBox1 = new JCheckBox("Swap", true);
        checkBox1.setFont(mono);
        checkBox1.setBackground(Color.DARK_GRAY.darker());
        checkBox1.setForeground(Color.WHITE);
        // "Modify on Swap" checkbox
        checkBox2 = new JCheckBox("Modify on Swap");
        checkBox2.setBackground(Color.DARK_GRAY.darker());
        checkBox2.setForeground(Color.WHITE);
        checkBox2.setFont(mono);
        // Add Checbox to Panel
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.add(checkBox1);
        checkboxPanel.add(checkBox2);
        checkboxPanel.setBackground(Color.DARK_GRAY.darker());
        c.add(checkboxPanel);

        /* Create Button */
        // "Submit" Button
        button1 = new JButton("Submit");
        button1.setFont(mono);
        button1.setBackground(Color.WHITE);
        // "Clear" Button
        button2 = new JButton("Clear");
        button2.setBackground(Color.WHITE);
        button2.setFont(mono);
        // Add Button to panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(Color.DARK_GRAY.darker());
        buttonPanel.setPreferredSize(new Dimension(400, 50));
        c.add(buttonPanel);

        // Grouping buttons together
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);

        /* Creat Blank Label that wait for result */
        label = new JLabel();
        label.setFont(mono);
        label.setForeground(Color.WHITE);
        // Add label to panel
        JPanel labelPanel = new JPanel();
        labelPanel.add(label);
        labelPanel.setBackground(Color.DARK_GRAY.darker());
        c.add(labelPanel);

        /* Assign Event_Handler for each buttons */
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Swap ");
                    checkSwap = 1;
                } else {
                    System.out.println("De-swap");
                    checkSwap = 0;
                }
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("ModifyOnSwap");
                    checkModify = 1;
                } else {
                    System.out.println("De-ModifyOnSwap");
                    checkModify = 0;
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkSwap == 1 && checkModify == 1) {
                    label.setText(textField2.getText() + textField1.getText());
                    String temp = textField1.getText();
                    textField1.setText(textField2.getText());
                    textField2.setText(temp);
                } else if (checkSwap == 1 && checkModify == 0) {
                    label.setText(textField2.getText() + textField1.getText());
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                label.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 320);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new HW2Swap();
    }
}
