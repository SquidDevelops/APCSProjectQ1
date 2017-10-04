package net.tesqgr.VotingFrakenstien;/*Luke Judy
Period 5
9/28/17*/


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JComponent;

// A component that draws a red elephant
public class ljElephant extends JComponent
{
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.RED);
      
      // Draw text
      g2.drawString("Republicans",35,50);
      
      // Draw legs
      Line2D.Double leg1 = new Line2D.Double(10,70,10,120);
      Line2D.Double leg2 = new Line2D.Double(10,120,40,120);
      Line2D.Double leg3 = new Line2D.Double(40,120,40,90);
      Line2D.Double leg4 = new Line2D.Double(90,90,90,120);
      Line2D.Double leg5 = new Line2D.Double(90,120,120,120);
      Line2D.Double leg6 = new Line2D.Double(120,120,120,80);
      g2.draw(leg1);
      g2.draw(leg2);
      g2.draw(leg3);
      g2.draw(leg4);
      g2.draw(leg5);
      g2.draw(leg6);
      
      // Draw tail
      Line2D.Double tail1 = new Line2D.Double(10,70,0,70);
      Line2D.Double tail2 = new Line2D.Double(0,70,10,60);
      g2.draw(tail1);
      g2.draw(tail2);
      
      // Draw body
      Line2D.Double body1 = new Line2D.Double(10,60,10,50);
      Line2D.Double body6 = new Line2D.Double(140,50,140,80);
      QuadCurve2D body2 = new QuadCurve2D.Double(10,50,15,30,20,30);
      QuadCurve2D body3 = new QuadCurve2D.Double(20,30,40,5,65,5);
      QuadCurve2D body4 = new QuadCurve2D.Double(65,5,120,5,130,30);
      QuadCurve2D body5 = new QuadCurve2D.Double(130,30,135,30,140,50);
      QuadCurve2D body7 = new QuadCurve2D.Double(40,90,65,100,90,90);
      g2.draw(body1);
      g2.draw(body2);
      g2.draw(body3);
      g2.draw(body4);
      g2.draw(body5);
      g2.draw(body6);
      g2.draw(body7);
      
      // Draw trunk
      Line2D.Double trunk1 = new Line2D.Double(120,80,130,100);
      Line2D.Double trunk4 = new Line2D.Double(170,80,160,80);
      QuadCurve2D trunk2 = new QuadCurve2D.Double(140,80,150,100,160,80);
      QuadCurve2D trunk3 = new QuadCurve2D.Double(130,100,150,120,170,80);
      g2.draw(trunk1);
      g2.draw(trunk2);
      g2.draw(trunk3);
      g2.draw(trunk4);
   }
}