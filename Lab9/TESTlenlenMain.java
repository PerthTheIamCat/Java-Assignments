import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class TESTlenlenMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        TESTlenlenClock clock = new TESTlenlenClock();
        clock.setSecondHandVisible(true);
        clock.setCurrentTime();
        clock.setBackground(Color.BLACK);
        frame.add(clock);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        JLabel label = new JLabel("time: "+ clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond() + " GMT",SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        panel.add(label);
        frame.add(panel, BorderLayout.SOUTH);
        Timer timer = new Timer(1000, e -> {
            label.setText("time: "+ clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond() + " GMT");
        });
        timer.start();

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
