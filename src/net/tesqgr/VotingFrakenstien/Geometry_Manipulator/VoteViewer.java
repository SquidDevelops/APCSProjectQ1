package net.tesqgr.VotingFrakenstien.Geometry_Manipulator;

import net.tesqgr.VotingFrakenstien.Components.ljDonkey;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicReference;
//import java.awt.*;

public class VoteViewer {
    public static VoteAPI voteAPI = new VoteAPI(1, 1, "George", "Ryan");

    public static void main(String[] args) throws InterruptedException {
        AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());

        VoteTest component = new VoteTest();
        frame.get().setSize(800, 800);
        frame.get().setTitle("Two Parties");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton = new JButton();
        jButton.setLocation(400, 400);
        jButton.setSize(30, 30);
        jButton.addActionListener(e -> VoteFactory.createVotes(6, 2, voteAPI));
        frame.get().getContentPane().add(jButton);
        frame.get().add(component);
        frame.get().setVisible(true);

    }

}