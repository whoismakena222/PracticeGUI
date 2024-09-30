import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 implements ActionListener {

    private JFrame mainFrame;
    private JPanel borderPanel;
    private JPanel gridPanel;
    private JButton button1, button2, button3, button4, button5;
    private JLabel label1, label2;

    public static void main(String[] args) {
        Example2 ex = new Example2();

    }

    public Example2(){

        mainFrame = new JFrame("Example with grid inside border layout");
        borderPanel = new JPanel(new BorderLayout());
        gridPanel = new JPanel(new GridLayout(2,3));
        //construct buttons and labels
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        label1 = new JLabel("label 1");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2 = new JLabel("label 2");
        label2.setHorizontalAlignment(JLabel.CENTER);
        //add stuff to border panel
        borderPanel.add(button1, BorderLayout.NORTH);
        borderPanel.add(button2, BorderLayout.SOUTH);
        //add stuff to gridPanel
        gridPanel.add(button3);
        gridPanel.add(label1);
        gridPanel.add(button4);
        gridPanel.add(label2);
        gridPanel.add(button5);

        borderPanel.add(gridPanel, BorderLayout.CENTER);
        mainFrame.add(borderPanel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,400);
        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
