/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */

import java.awt.*;
import javax.swing.*;

public class HW1MrHat extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // draw face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // draw eye
        g.setColor(Color.BLACK);
        g.fillOval(95, 105, 30, 30);
        g.fillOval(175, 105, 30, 30);

        // draw mouth
        g.setColor(Color.PINK.darker());
        g.fillOval(90, 150, 120, 60);

        // draw smile
        g.setColor(Color.YELLOW);
        g.fillRect(90, 150, 120, 30);
        // g.fillOval(90, 160, 120, 40);

        // draw Hat
        g.setColor(Color.BLACK);
        g.fillOval(50, 50, 210, 30);
        g.fillRect(90, 0, 130, 60);

        // draw mustache
        g.fillOval(80, 150, 140, 30);
        g.setColor(Color.YELLOW);
        g.fillRect(80, 170, 140, 10);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mr.Hat");
        frame.add(new HW1MrHat());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
