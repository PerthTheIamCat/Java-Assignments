import javax.swing.JFrame;

public class Lab91DrawSmileyTest {
    public static void main(String[] args) {
        JFrame smileyFace = new JFrame();
        smileyFace.add(new Lab91DrawSmiley());
        smileyFace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smileyFace.setSize(250,250);
        smileyFace.setVisible(true);
    }
}
