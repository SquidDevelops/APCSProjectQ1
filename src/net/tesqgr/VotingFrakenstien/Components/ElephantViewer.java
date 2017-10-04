/*Luke Judy
Period 5
9/28/17*/
package net.tesqgr.VotingFrakenstien.Components;

import javax.swing.JFrame;

// The program that allows the elephant drawing to be shown in a new window
public class ElephantViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(175,150);
      frame.setTitle("this a elephant");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ljElephant component = new ljElephant();
      frame.add(component);
      frame.setVisible(true);
   }
}