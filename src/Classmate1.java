import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Classmate1 {

    private JFrame mainFrame;
    private JPanel panel;
    private JPanel panelTwo;
    private JPanel panelThree;
    private JLabel label1, label2, label3, label4, label5;
    private JButton button1, button2, button3, button4, button10;


    public static void main(String[] args){
        Classmate1 ex = new Classmate1();
    }

    public Classmate1(){
        //phillip's drawing

        mainFrame = new JFrame("Classmate's layout challenge");
        panel = new JPanel(new GridLayout(3,2));
        panelTwo = new JPanel(new GridLayout(2,1));
        panelThree = new JPanel(new GridLayout(2,1));

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button10 = new JButton("Button 10");
        label1 = new JLabel("Label 1");
        label2 = new JLabel("Label 2");
        label3 = new JLabel("Label 3");
        label4 = new JLabel();
        label5 = new JLabel();

        panel.add(label4);
        panel.add(button3);
        panel.add(button1);
        panel.add(button4);
        panel.add(label5);
        panel.add(button2);

        panelTwo.add(button10, BorderLayout.NORTH);

        panelThree.add(label3);
        panelThree.add(label2);

        panelTwo.add(label1, BorderLayout.SOUTH);

        panelTwo.add(panelThree, BorderLayout.CENTER);
        panelTwo.add(panel, BorderLayout.EAST);

        mainFrame.add(panelTwo);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,400);
        mainFrame.setVisible(true);


    }
}
