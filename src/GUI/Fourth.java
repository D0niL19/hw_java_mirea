package GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fourth {
    static int cnt = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(322,480);

        ArrayList<String> frames = new ArrayList<String>();
        for(int i = 1; i <= 60; i++){
            frames.add("C:\\Users\\D0niL\\IdeaProjects\\untitled\\src\\data\\frames\\frame (" + i + ").jpg");
        }
        JLabel label = new JLabel();
        frame.add(label);


        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ImageIcon image = new ImageIcon(frames.get(cnt));
                label.setIcon(image);
                cnt = (cnt + 1) % 60;
            }
        });

        timer.start();
        frame.setVisible(true);
    }

}
