package net.tesqgr.VotingFrakenstien;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReference;

public class VotingFrakenstien {


    public static void main(String[] args) {
        AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());
        JPanel jPanel = new JPanel();
        VoteAPI voteapi = new VoteAPI(1, 1, "Jason Ramos", "Jason Unramos");

        frame.get().setSize(800, 500);
        frame.get().setTitle("your mom");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbutton = new JButton("your mum");
        jbutton.setSize(40, 30);
        jPanel.add(jbutton);
        //jbutton.setLocation(100,100);
        jbutton.addActionListener(e -> System.out.println("isss"));
        frame.get().add(jPanel);
        frame.get().setVisible(true);
    }
}
