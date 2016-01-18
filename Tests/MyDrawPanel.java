import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);

        Image image = new ImageIcon("/home/zhangzhe/图片/fate.jpg").getImage();
        g.drawImage(image, 10 ,10 ,this);

        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }

    public void go(MyDrawPanel myPanel){
        JFrame frame = new JFrame("JPanel Test");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.getContentPane().add(myPanel);
    }

    public static void main(String[] args) {
        MyDrawPanel mdp = new MyDrawPanel();
        mdp.go(mdp);
    }
}
