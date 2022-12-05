package Test;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static jdk.internal.org.jline.utils.Colors.J;


public class varyeun extends JFrame {
    JLabel la[] = new JLabel[4];
    JTextField tf[] = new JTextField[4];
    String[] fruits = {"apple ", "cherry ", "strawberry ", "prume"};
    //모양새를 위해 안에서 미리 한 칸씩 띄워줌
    Color[] colors = {Color.RED, Color.BLUE, Color.MAGENTA, Color.YELLOW};
    lowerPanel low = new lowerPanel();
    int[] angle = new int[4];
    int[] n = new int[4];

    public varyeun() {
        setTitle("파이 차트 그리기");
        setDefaultClose0peration(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.add(new upperPanel(), BorderLayout.NORTH);
        c.add(low, BorderLayout.CENTER);
        setSize(600, 400);
        setVisible(true);
    }

    class upperPanel extends Janel {
        public upperPanel() {
            setBackground(Color.LIGHT_GRAY);
            for (int i = 0; i < fruits.length; i++) {
                tf[i] = new JTextField(7);
                tf[i].addActionListener(new MyActionListener());
                add(new JLabel(fruits[i]));
                add(tf[i]);
            }
        }
    }

    class lowerPanel extends Janel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int startAngle = 0;
            for (int i = 0; i < fruits.length; i++) {
                g.setColor(colors[i]);
                g.drawString(fruits[i] + " " + Math.round(angle[i] * 100 / 360) + "%", 100 + i * 100);
            }
            for (int i = 0; i < fruits.length; i++) {
                g.setColor(colors[i]);
                g.fillArc(150, 50, 200, 200, startAngle, angle[i]);
                startAngle += angle[i];
            }
        }
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (int i = 0; i < fruits.length; i++) {
                n[i] = Integer.parseInt(tf[i].getText());
                sum += n[i];
            }

            for (int i = 0; i < fruits.length; i++)
                angle[i] = (int) Math.round((double) n[i] / (double) sum * 360);
            repaint();
        }
    }

    public static void main(String[] args) {
        new varyeun();
    }
}