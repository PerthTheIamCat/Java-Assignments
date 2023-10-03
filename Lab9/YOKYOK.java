import java.awt.*;
import javax.swing.*;
import java.util.*;

public class YOKYOK extends JPanel {
    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisble = true;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = true;
    
    /* Construct a default clock with the current time */
    public YOKYOK() {
        setCurrentTime();
    }
    /* Construct a clock with specified hour, minute, and second */
    public YOKYOK(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    /* Return hour */
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int clockRadius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        g.setColor(Color.BLACK);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
        for (int i = 0; i < 60; i++) {
            int size;
            if (i % 5 == 0) {
                size = 40;
            } else {
                size = 20;
            }
            int xOut = (int) (xCenter + clockRadius * Math.sin(i * (2 * Math.PI / 60)));
            int yOut = (int) (yCenter - clockRadius * Math.cos(i * (2 * Math.PI / 60)));
            int xIn = (int) (xCenter + (clockRadius - size)* Math.sin(i * (2 * Math.PI / 60)));
            int yIn = (int) (yCenter - (clockRadius - size)* Math.cos(i * (2 * Math.PI / 60)));

            g.drawLine(xIn, yIn, xOut, yOut);
        }
        for (int i = 1; i <= 12; i++) {
            int xIn = (int) (xCenter + (clockRadius - 60)* Math.sin(i * (Math.PI / 6)));
            int yIn = (int) (yCenter - (clockRadius - 60)* Math.cos(i * (Math.PI / 6)));
            g.drawString(Integer.toString(i), xIn,yIn);
        }
        
        if (secondHandVisible) {
            int sLength = (int) (clockRadius * 0.8);
            int xSecond = (int) (xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
            int ySecond = (int) (yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
            g.setColor(Color.red);
            g.drawLine(xCenter, yCenter, xSecond, ySecond);
        }

        if (minuteHandVisible) {
            int mLength = (int) (clockRadius * 0.65);
            int xMinute = (int) (xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
            int yMinute = (int) (yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
            g.setColor(Color.blue);
            g.drawLine(xCenter, yCenter, xMinute, yMinute);
        }
        if (hourHandVisble) {
            int hLength = (int) (clockRadius * 0.5);
            int xHour = (int) (xCenter + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
            int yHour = (int) (yCenter - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
            g.setColor(Color.green);
            g.drawLine(xCenter, yCenter, xHour, yHour);
        }
    }
    public void setCurrentTime() {
            Calendar calendar = new GregorianCalendar();

            this.hour = calendar.get(Calendar.HOUR_OF_DAY);
            this.minute = calendar.get(Calendar.MINUTE);
            this.second = calendar.get(Calendar.SECOND);
    }
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
    public boolean isHourHandVisible() {
        return hourHandVisble;
    }
    public boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }
    public boolean isSecondHandVisible() {
        return secondHandVisible;
    }
    public void setHourHandVisble(boolean hourHandVisble) {
        this.hourHandVisble = hourHandVisble;
        repaint();
    }
    public void setMinuteHandVisible(boolean minuteHandVisible) {
        this.minuteHandVisible = minuteHandVisible;
        repaint();
    }
    public void setSecondHandVisible(boolean secondHandVisible) {
        this.secondHandVisible = secondHandVisible;
        repaint();
    }
}
