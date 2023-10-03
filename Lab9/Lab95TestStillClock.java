import java.awt.BorderLayout;
import javax.swing.*;

public class Lab95TestStillClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        Lab95StillClock clock = new Lab95StillClock();
        clock.setSecondHandVisible(true);
        clock.setCurrentTime();
        frame.add(clock);
        frame.add(new JLabel("time: "+ clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond() + " GMT",SwingConstants.CENTER), BorderLayout.SOUTH);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}