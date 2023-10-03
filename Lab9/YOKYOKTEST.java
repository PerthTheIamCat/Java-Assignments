import javax.swing.*;
import java.awt.*;

public class YOKYOKTEST {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        YOKYOK clock = new YOKYOK();
        clock.setSecondHandVisible(true);
        clock.setCurrentTime();
        clock.setBackground(Color.WHITE);
        frame.add(clock);
        
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
