package utils;

import javax.swing.*;
import java.awt.*;

public class UIUtils {
    public static void makeFrameToCenter(JFrame frame) {
        // 居中
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension thissize = frame.getSize();

        if (thissize.width > screensize.width) {
            thissize.width = screensize.width;
        }
        if (thissize.height > screensize.height) {
            thissize.height = screensize.height;
        }
        frame.setSize(1000, 700);
        frame.setLocation((screensize.width - thissize.width) / 2, (screensize.height - thissize.height) / 2);
        //frame.setLocationRelativeTo(null);
    }




    public static void UITools(JFrame frame, JPanel panel1, int frameWidth, int frameHeight) {
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
