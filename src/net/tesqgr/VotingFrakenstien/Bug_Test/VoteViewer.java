package net.tesqgr.VotingFrakenstien.Bug_Test;

import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicReference;
//import java.awt.*;

public class VoteViewer
{
    public static void main(String[] args)
    {
        AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());
        JPanel jPanel = new JPanel();
        frame.get().setSize(600,600);
        frame.get().setTitle("Two Bugs");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton = new JButton();
        jButton.add(jButton);
        jButton.setLocation(500,500);
        jButton.addActionListener(e -> VoteFactory.createVotes(6,0, VoteAPI));
        VoteTest component = new VoteTest();
        frame.get().add(component);
        frame.get().add(jPanel);
        frame.get().setVisible(true);
    }
}