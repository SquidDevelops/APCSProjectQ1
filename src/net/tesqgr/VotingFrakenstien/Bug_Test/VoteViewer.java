package net.tesqgr.VotingFrakenstien.Bug_Test;

import javax.swing.JFrame;
import java.util.concurrent.atomic.AtomicReference;
//import java.awt.*;

public class VoteViewer
{
    public static void main(String[] args)
    {
        AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());

        frame.get().setSize(1200,1200);
        frame.get().setTitle("Two Bugs");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        VoteTest component = new VoteTest();
        frame.get().add(component);

        frame.get().setVisible(true);
    }
}