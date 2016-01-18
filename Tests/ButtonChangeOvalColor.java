import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonChangeOvalColor {
    Painter p = new Painter();
    JFrame frame = new JFrame("Button Change Oval Color");
    Button button = new Button("changeColor");
    ButtonListener bl = new ButtonListener(frame);

    public static void main(String[] args) {
        ButtonChangeOvalColor bcoc = new ButtonChangeOvalColor();
        bcoc.start();
    }

    public void start() {

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.getContentPane().add(BorderLayout.CENTER, p);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        button.addActionListener(bl);
    }
}

class ButtonListener implements ActionListener {

    JFrame frame;
    public ButtonListener(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e){
        frame.repaint();
    }
}

class Painter extends JPanel {
    public void paintComponent(Graphics g) {

        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);

        Color randomColor = new Color(red, green, blue);

        g.setColor(randomColor);
        g.fillOval(100, 100, 100, 100);

    }
}
