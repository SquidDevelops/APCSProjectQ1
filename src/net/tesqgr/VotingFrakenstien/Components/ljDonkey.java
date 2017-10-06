package net.tesqgr.VotingFrakenstien.Components;/*Luke Judy
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

// A component that draws a blue donkey

public class ljDonkey extends JComponent
{
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.BLUE);
      
      // Draw text
      g2.drawString("Democrats",20,60);
      
      // Draw legs
      Line2D.Double leg1 = new Line2D.Double(10,70,10,120);
      Line2D.Double leg2 = new Line2D.Double(10,120,40,120);
      Line2D.Double leg3 = new Line2D.Double(40,120,30,110);
      Line2D.Double leg4 = new Line2D.Double(30,110,30,80);
      Line2D.Double leg5 = new Line2D.Double(30,80,60,80);
      Line2D.Double leg6 = new Line2D.Double(60,80,60,120);
      Line2D.Double leg7 = new Line2D.Double(60,120,90,120);
      Line2D.Double leg8 = new Line2D.Double(90,120,80,110);
      Line2D.Double leg9 = new Line2D.Double(80,110,80,80);
      g2.draw(leg1);
      g2.draw(leg2);
      g2.draw(leg3);
      g2.draw(leg4);
      g2.draw(leg5);
      g2.draw(leg6);
      g2.draw(leg7);
      g2.draw(leg8);
      g2.draw(leg9);
      
      // Draw tail
      Line2D.Double tail1 = new Line2D.Double(10,70,0,75);
      Line2D.Double tail2 = new Line2D.Double(0,75,10,60);
      g2.draw(tail1);
      g2.draw(tail2);
      
      // Draw body
      Line2D.Double body1 = new Line2D.Double(30,40,80,40);
      QuadCurve2D body2 = new QuadCurve2D.Double(10,60,15,40,30,40);
      QuadCurve2D body3 = new QuadCurve2D.Double(80,80,90,78.75,90,60);
      g2.draw(body1);
      g2.draw(body2);
      g2.draw(body3);
      
      // Draw head
      Line2D.Double head3 = new Line2D.Double(95,8,95,20);
      Line2D.Double head4 = new Line2D.Double(95,20,110,10);
      Line2D.Double head6 = new Line2D.Double(105,25,115,30);
      QuadCurve2D head1 = new QuadCurve2D.Double(80,40,87.5,37.5,90,30);
      QuadCurve2D head2 = new QuadCurve2D.Double(90,30,85,20,95,8);
      QuadCurve2D head5 = new QuadCurve2D.Double(110,10,112.5,17.5,105,25);
      QuadCurve2D head7 = new QuadCurve2D.Double(115,30,150,60,110,60);
      QuadCurve2D head8 = new QuadCurve2D.Double(110,60,100,50,90,60);
      g2.draw(head1);
      g2.draw(head2);
      g2.draw(head3);
      g2.draw(head4);
      g2.draw(head5);
      g2.draw(head6);
      g2.draw(head7);
      g2.draw(head8);
      
   }
}