import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 implements ActionListener {

    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label;
    private JButton button;


    public static void main(String[] args) {
        Example1 ex = new Example1();
    }

    public Example1() {
        // constructor stuff
        mainFrame = new JFrame();
        panel = new JPanel(new GridLayout(2,1));
        label = new JLabel("This is the label!");
        button = new JButton("Click here");
        button.addActionListener(this);

        panel.add(button);
        panel.add(label);

        mainFrame.add(panel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,400);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("button clicked!");
    }
}
