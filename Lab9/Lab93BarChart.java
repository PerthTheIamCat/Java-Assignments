import java.awt.*;
import javax.swing.*;

public class Lab93BarChart extends JPanel{
    private double[] dataValue = {200, 140, 100, 60, 40};
    private String[] dataName = {"Fund1", "Fund2", "Data", "Skill", "Project"};
    private Color[] Colors = {Color.green, Color.blue, Color.yellow, Color.red, Color.orange, Color.cyan, Color.magenta, Color.yellow, Color.pink, Color.darkGray};

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (dataValue == null) {
            return;
        }
        // Find the maximum value in the data
        double max = dataValue[0];
        for (int i = 1; i < dataValue.length; i++) {
            max = Math.max(max, dataValue[i]);
        }
        int barWidth = (int) ((getWidth() - 20.0) / dataValue.length - 10);
        int maxBarHeight = getHeight() -30;
        
        g.drawLine(5, getHeight() - 10, getWidth() - 5, getHeight() - 10);

        int x = 15;
        for (int i = 0; i < dataValue.length; i++) {
            g.setColor(Colors[i % Colors.length]);
            int newHeight = (int) (maxBarHeight * dataValue[i] / max);
            int y = getHeight() - 10 - newHeight;
            g.fillRect(x, y, barWidth, newHeight);
            g.setColor(Color.black);
            // Display name if exist
            if ((dataName != null) && (i < dataName.length)) {
                g.drawString(dataName[i], x, y - 7);
            }
            x += barWidth + 10;
        }
    }
    /* Setdata */
    public void setData(String[] dataName, double[] dataValue) {
        this.dataName = dataName;
        this.dataValue = dataValue;
        repaint();
    }
    
}
