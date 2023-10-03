import javax.swing.*;
import java.awt.*;

public class Lab93TestBarChart extends JFrame{
    public Lab93TestBarChart() {
        Container container = getContentPane();
        container.setLayout(new GridLayout(1, 3, 20, 5));
        Lab93BarChart chart1 = new Lab93BarChart();
        double[] data1 = {10, 10, 30, 35, 15};
        String[] dataName1 = {"Sheet/HW -- 10%", "Lab Exam -- 10%", "Midterms -- 30%", "Final -- 35%", "Project -- 15%"};
        chart1.setData(dataName1, data1);
        container.add(chart1);
    }
    public static void main(String[] args) {
        Lab93TestBarChart frame = new Lab93TestBarChart();
        frame.setTitle("Fund2 BarChart");
        frame.setSize(858,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
