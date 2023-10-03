import java.awt.*;
import javax.swing.*;

public class Lab85Layout extends JFrame{
    public Lab85Layout(){
        super("Application");

        Container c = getContentPane();

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JCheckBox check1 = new JCheckBox("Add Matrix");
        JCheckBox check2 = new JCheckBox("Upgrade Matrix");
        JCheckBox check3 = new JCheckBox("Cancle Matrix");

        p1.add(check1);
        p1.add(check2);
        p1.add(check3);

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        JButton btn1 = new JButton("OK");
        JButton btn2 = new JButton(" Cancel");

        p2.add(btn1);
        p2.add(btn2);

        JLabel label1 = new JLabel(new ImageIcon("02_Animation.gif"));

        c.add(p1, BorderLayout.WEST);
        c.add(label1, BorderLayout.CENTER);
        c.add(p2, BorderLayout.EAST);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab85Layout();
    }
    
}
