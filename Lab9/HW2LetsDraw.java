/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class HW2LetsDraw extends JPanel{
    private final ArrayList<Point> points = new ArrayList<>();
    private Boolean line;
    private int count = 0;
    public HW2LetsDraw() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent event) {
                if (line == true) {
                    points.add(event.getPoint());
                    line = false;
                    System.out.println(count);
                    System.out.println(points.size());
                    repaint();
                }
                points.set(count ,event.getPoint());
                repaint();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                points.add(e.getPoint());
                line = true;
                count++;
                System.out.println("Pressed");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                count++;
                System.out.println("Released");
            }
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < points.size(); i+=2) {
            g.drawLine((int) points.get(i).getX(), (int) points.get(i).getY(), (int) points.get(i+1).getX(), (int) points.get(i+1).getY());
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lets Draw");
        frame.add(new HW2LetsDraw());

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
