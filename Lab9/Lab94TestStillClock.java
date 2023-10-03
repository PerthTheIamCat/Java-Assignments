import javax.swing.*;
import java.awt.*;

public class Lab94TestStillClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        Lab94StillClock clock = new Lab94StillClock();
        clock.setSecondHandVisible(true);
        clock.setCurrentTime();
        clock.setBackground(Color.BLACK);
        frame.add(clock);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
