package gb2.less4;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Chat {


    private final int height = 667;
    private final int width = 375;

    private final int spaceBtwnElmnts = 10;
    private final URL backgroundImgURL = getClass().getResource("images/chatBody.png");

    private final ImageIcon backgroundImg = new ImageIcon(backgroundImgURL);


    private final Image backgroungJFrameImg = backgroundImg.getImage();


    public Chat() throws IOException {




        JFrame mainContainer = new JFrame("IT-Chat v1.0");
        URL iconURL = getClass().getResource("images/ico.png");
        ImageIcon icoImg = new ImageIcon(iconURL);
        mainContainer.setIconImage(icoImg.getImage());
        mainContainer.setLocation(600, 200);
        mainContainer.setResizable(false);
        mainContainer.setUndecorated(false);
        mainContainer.setFocusable(true);
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setIcon(new ImageIcon("images/closeButton.png"));
        mainContainer.add(backgroundLabel);
        backgroundLabel.setBounds(20, 40, 120, 32);
        //mainContainer.pack();

        mainContainer.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                graphics.drawImage(backgroungJFrameImg, 0, 0, new ImageObserver() {
                    @Override
                    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                        return false;
                    }
                });
                mainContainer.repaint();
            }
        });
        mainContainer.setSize(this.width+14, this.height+38);
        mainContainer.setBackground(Color.BLUE);
        mainContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainContainer.setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 32);
        mainContainer.add(field);




        mainContainer.add(button);
        //mainContainer.pack();
        mainContainer.repaint();

        mainContainer.setVisible(true);

    }
}
