package practic2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
public class practic7 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(new Color(42, 54, 0));

        JFrame frame = new JFrame("Test Color");
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}



