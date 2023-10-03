import java.awt.*;
import javax.swing.*;

public class Lab83Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(858, 858);
        
        JPanel panel = new JPanel();

        panel.setBackground(Color.DARK_GRAY);

        Icon icon1 = new ImageIcon(new ImageIcon("button.png").getImage().getScaledInstance(100, 50, 0));

        Icon icon2 = new ImageIcon(new ImageIcon("01_Animation.gif").getImage().getScaledInstance(650, 650, 0));

        JButton btn1 = new JButton("Button", icon1);
        
        JLabel label1 = new JLabel("Click here", SwingConstants.RIGHT);

        JLabel label2 = new JLabel("Animation", icon2, SwingConstants.LEFT);

        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);

        panel.add(btn1);
        panel.add(label1);
        panel.add(label2);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
