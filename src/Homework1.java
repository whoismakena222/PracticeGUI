import javax.swing.*;
import java.awt.*;

public class Homework1 {

    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label1, label2;
    private JButton button1, button2;

    public static void main(String[] args) {
        Homework1 ex = new Homework1();
    }

    public Homework1(){

        mainFrame = new JFrame("Example with grid layout");
        panel = new JPanel(new GridLayout(2,2));

        label1 = new JLabel("Label 1!");
        label2 = new JLabel("Label 2!");
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        panel.add(label1);
        panel.add(button1);
        panel.add(button2);
        panel.add(label2);

        mainFrame.add(panel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,400);
        mainFrame.setVisible(true);


    }

}
