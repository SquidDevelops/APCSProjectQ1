/*Luke Judy
Period 5
9/28/17*/
package net.tesqgr.VotingFrakenstien.Components;

import javax.swing.JFrame;

// The program that allows the donkey drawing to be shown in a new window
public class DonkeyViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(140,150);
      frame.setTitle("this a donkey");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ljDonkey component = new ljDonkey();
      frame.add(component);
      frame.setVisible(true);
   }
}