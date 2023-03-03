import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;


public class Colormenu extends JFrame{
    
    JList colorList;

    private String [] colorname={"Gray", "Black", "Yellow"}; 
    private Color [] colorArray = {Color.GRAY, Color.BLACK, Color.YELLOW};


    Colormenu(){

        JLabel label = new JLabel();
        label.setText("Choose Background Color");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setForeground(Color.RED);
        this.add(label);


        colorList = new JList(colorname);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        colorList.setForeground(Color.BLUE);

        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);
        this.add(colorList);


        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setVisible(true);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.PINK);
        this.setResizable(false);
    }

    private class BGColorEventHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorArray[colorList.getSelectedIndex()];

            new GameFrame();

            dispose();


        }
    }
}
