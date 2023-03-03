import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.ImageIcon;

public class Tryagain extends JFrame {

    Tryagain(){
        // JLabel imageLabel = new JLabel();
        // ImageIcon memeImage = new ImageIcon("14570.jpg");
        // imageLabel.setIcon(memeImage);
        // this.add(imageLabel);

        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setForeground(Color.RED);
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        tryAgainButton.setForeground(Color.GREEN);

        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);
        this.add(tryAgainButton);

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        EventHandler1 handler1 = new EventHandler1();
        exitButton.addActionListener(handler1);
        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.PINK);
        this.setResizable(true);
    }

    private class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent event) {

            new GameFrame();

            dispose();
        }
    }
    private class EventHandler1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}