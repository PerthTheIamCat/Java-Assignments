import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Lab92PaintPanel extends JPanel{
    private final ArrayList<Point> points = new ArrayList<>();

    public Lab92PaintPanel() {
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent event) {
                points.add(event.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Point point : points) {
            g.fillOval(point.x, point.y, 4, 4);
        }
    }
}
