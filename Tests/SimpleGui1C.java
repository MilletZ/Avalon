import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1C implements ActionListener {
    JButton button;
    JMenu menu;

    public static void main(String[] args) {
        SimpleGui1C sg = new SimpleGui1C();
        sg.go();
    }

    public void go() {
        JFrame frame = new JFrame("SimpleGui1C");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        button = new JButton("click me");
        menu = new JMenu("MM");
        frame.getContentPane().add(button);
        // frame.getContentPane().add(menu);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        button.setText("look MM!");
    }
}
