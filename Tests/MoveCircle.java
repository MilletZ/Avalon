import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle {
    int x = 0;
    int y = 0;
    JFrame frame = new JFrame("Move Circle");
    JButton b1 = new JButton("go!");
    Drawer drawer = new Drawer();

    public void start() {
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, drawer);
        // frame.getContentPane().add(BorderLayout.SOUTH, b1);

        // b1.addActionListener(new GoListener());
        while(x < 400) {
            x++;
            y++;
            drawer.repaint();
            try{
                Thread.sleep(5);
            } catch(Exception ex) {
                System.out.println("Thread warnning.");
            }
        }
    }

    class Drawer extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            
            g.setColor(Color.RED);
            g.fillOval(x, y, 50, 50);
        }
    }
    //用按钮激发圆圈移动只会显示最终目的地的效果，可能按钮执行时在单独的线程里？
    class GoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            while(x < 400) {
                x++;
                y++;
                drawer.repaint();
                // try{
                //     Thread.sleep(5);
                // } catch(Exception ex) {
                //     System.out.println("Thread warnning.");
                // }
            }
        }
    }



    public static void main(String[] args) {
        MoveCircle mc = new MoveCircle();
        mc.start();
    }
}
