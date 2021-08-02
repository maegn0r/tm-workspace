package Client;

import javax.swing.*;
import java.awt.*;

public class ChatFrame {
    private final JFrame mainFrame;

    public ChatFrame() {
        mainFrame = new JFrame();
        mainFrame.setBounds(new Rectangle(400, 700));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(createTop(), BorderLayout.CENTER);
        mainFrame.add(createBottom(), BorderLayout.SOUTH);
        mainFrame.setVisible(true);
    }

    private JPanel createTop(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        JTextArea chatiingArea = new JTextArea();
        jPanel.add(chatiingArea, BorderLayout.CENTER);
        return jPanel;
    }

    private JPanel createBottom(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        JTextField inputArea = new JTextField();
        JButton submitButton = new JButton();
        jPanel.add(inputArea, BorderLayout.CENTER);
        jPanel.add(submitButton, BorderLayout.EAST);
    }
}
