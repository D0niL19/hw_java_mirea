package GUI;

import javax.swing.*;
import java.awt.*;

public class Third{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon(args[0]);
        System.out.println(args[0]);
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(imageIcon));
        frame.add(jPanel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
