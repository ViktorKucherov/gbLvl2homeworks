package gb2.less4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SendButton extends JButton {

    private final int sizeOfButton = 60;
    private final URL pushedButtonURL = getClass().getResource("images/pushedSendButton.png");
    private final URL buttonURL = getClass().getResource("images/sendButton.png");
    private final ImageIcon defaultButton = new ImageIcon(buttonURL);
    private final ImageIcon pushedButton = new ImageIcon(pushedButtonURL);

    public
    JButton button = new JButton();
        button.setIcon(defaultButton);

        button.setBounds(
    width-sizeOfButton-spaceBtwnElmnts,
    height-sizeOfButton-spaceBtwnElmnts,
    sizeOfButton,
    sizeOfButton
        );


    Image buttonPressedIMG = pushedButton.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT);
    Icon pbIMG = new ImageIcon(buttonPressedIMG);

        button.setPressedIcon(pbIMG);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.addActionListener(e -> {

    });
}
