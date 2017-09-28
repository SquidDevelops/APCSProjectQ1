package net.tesqgr.VotingFrakenstien.Bug_Test;

import javax.swing.JFrame;
import java.util.concurrent.atomic.AtomicReference;
//import java.awt.*;

public class BugViewer {
    public static void main(String[] args) {
        AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());

        frame.get().setSize(300, 400);
        frame.get().setTitle("Two Bugs");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BugTest component = new BugTest();
        frame.get().add(component);

        frame.get().setVisible(true);
    }
}