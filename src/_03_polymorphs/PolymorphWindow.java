package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph bluePoly;
    Polymorph redPoly;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 bluePoly = new BluePolymorph(30, 30);
   	 redPoly = new RedPolymorph(20, 20);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 bluePoly.draw(g);
   	 redPoly.draw(g);
   	 Polymorph b2 = new BluePolymorph(10,10);
   	 b2.draw(g);
   	Polymorph r2 = new RedPolymorph(0,0);
  	 r2.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 bluePoly.update();
   	 
    }
}
