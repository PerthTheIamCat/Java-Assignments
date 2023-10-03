import java.awt.*;
import javax.swing.*;

public class Lab92PaintPanelTest {
    public static void main(String[] args) {
        JFrame drawFrame = new JFrame("Paint Application");
        drawFrame.setLayout(new BorderLayout());
        drawFrame.add(new Lab92PaintPanel());

        JLabel label = new JLabel("Drag the mouse to draw");
        label.setFont(new Font("Kanit", Font.BOLD + Font.ITALIC, 32));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        drawFrame.add(label, BorderLayout.SOUTH);

        drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawFrame.setSize(500, 300);
        drawFrame.setVisible(true);
    }
}
