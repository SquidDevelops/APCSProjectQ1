package net.tesqgr.VotingFrakenstien.Bug_Test;

import javax.swing.JFrame;
//import java.awt.*;

public class BugViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two Bugs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Bug_Test component = new Bug_Test();
        frame.add(component);

        frame.setVisible(true);
    }
}