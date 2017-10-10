package net.tesqgr.VotingFrakenstien;

import net.tesqgr.VotingFrakenstien.Components.DemocratButton;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReference;

public class VotingFrakenstien {


    public static void main(String[] args) {
        AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());
        VoteAPI voteapi = new VoteAPI(1, 1, "Jason Ramos", "Jason Unramos");
        frame.get().setSize(800, 500);
        frame.get().setTitle("your mom");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.get().getContentPane().add(new DemocratButton("vote",  voteapi), BorderLayout.WEST);
        frame.get().getContentPane().add(new DemocratButton("vote",  voteapi), BorderLayout.EAST);

        frame.get().setVisible(true);
    }
}
