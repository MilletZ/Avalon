import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeColorAndText {
    JFrame frame = new JFrame("ChangeColorAndText");
    JButton changeColorB = new JButton("Change color");
    JButton changeTextB = new JButton("Change Text");
    JLabel label = new JLabel("wait to be change");
    MyDrawer drawer = new MyDrawer();

    public void start() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, drawer);
        frame.getContentPane().add(BorderLayout.EAST, changeTextB);
        frame.getContentPane().add(BorderLayout.SOUTH, changeColorB);

        changeTextB.addActionListener(new TextListenner());
        changeColorB.addActionListener(new ColorListenner());

    }

    class MyDrawer extends JPanel {
        public void paintComponent(Graphics g) {
            int red = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillRect(100, 100,100, 100);
        }
    }

    class ColorListenner implements ActionListener {
        public void actionPerformed(ActionEvent e){
            frame.repaint();
        }
    }

    class TextListenner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("yo yo check out!");
        }
    }

    public static void main(String[] args) {
        ChangeColorAndText ccat = new ChangeColorAndText();
        ccat.start();
    }
}
