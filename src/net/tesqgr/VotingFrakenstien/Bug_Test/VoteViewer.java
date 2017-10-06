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
        VoteAPI voteAPI = new VoteAPI(1, 1, "Memes", "Memer");
        JPanel jPanel = new JPanel();
        frame.get().setSize(600,600);
        jPanel.setBounds(frame.get().getBounds());
        frame.get().setTitle("Two Bugs");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.setLayout(null);
        JButton jButton = new JButton();
        jButton.setLocation(500,500);
        jButton.setSize(30, 30);
        jButton.addActionListener(e -> VoteFactory.createVotes(6,0, voteAPI));
        jPanel.add(jButton);
        VoteTest component = new VoteTest();
        jPanel.add(component);
        //frame.get().add(component);
        frame.get().add(jPanel);
        frame.get().setVisible(true);
    }
}