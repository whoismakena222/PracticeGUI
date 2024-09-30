import javax.swing.*;
import java.awt.*;

public class Homework2 {

    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label1, label2;
    private JButton button1, button2;

    public static void main(String[] args) {
        Homework2 ex = new Homework2();
    }

    public Homework2(){

        mainFrame = new JFrame("Example with border layout");
        panel = new JPanel(new BorderLayout());


        label1 = new JLabel("Label 1!");
        label2 = new JLabel("Label 2!");
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.CENTER);
        panel.add(label1, BorderLayout.WEST);
        panel.add(label2, BorderLayout.SOUTH);

        mainFrame.add(panel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,400);
        mainFrame.setVisible(true);

    }
}
