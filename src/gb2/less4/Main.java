package gb2.less4;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        JFrame tmp =  new JFrame();
        ImageIcon icon = new ImageIcon("images/chatBody.png");
        tmp.setIconImage(icon.getImage());
        tmp.setLocation(600, 200);
        //SwingUtilities.invokeLater(new Runnable() {
        //    @Override
        //    public void run() {
        //        try {
        //            //new Chat();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //    }
        //});

    }
}
