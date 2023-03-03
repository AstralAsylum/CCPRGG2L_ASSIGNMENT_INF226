import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Mainmenu extends JFrame{

    Mainmenu(){

        // //JLabel
        // JLabel imageLabel = new JLabel();
        // ImageIcon bg = new ImageIcon("wp2589573");
        // imageLabel.setIcon(bg);
        // //image to frame
        // this.add(imageLabel);


        //JButton
        JButton button = new JButton();
        button.setText("Start Game");
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setForeground(Color.YELLOW);
        button.setBackground(Color.RED);
        
  

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        this.add(button);

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

        public void actionPerformed(ActionEvent event){

            new Colormenu();

            dispose();
        }

    }
    
}
