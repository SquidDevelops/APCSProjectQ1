package net.tesqgr.VotingFrakenstien;

import net.tesqgr.VotingFrakenstien.Components.DemocratButton;
import net.tesqgr.VotingFrakenstien.Components.RepublicanButton;
import net.tesqgr.VotingFrakenstien.Components.VoteAnimals;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;
//import java.awt.*;

public class VotingFrankenstien implements Runnable
{
    public static VoteAPI voteAPI = new VoteAPI(1, 1, "George", "Ryan");
    private static AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());

    public static void main(String[] args) throws InterruptedException {


        VoteAnimals component = new VoteAnimals();
        frame.get().setSize(800, 800);
        frame.get().setTitle("Two Parties");
        frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.get().getContentPane().add(new DemocratButton(voteAPI), BorderLayout.WEST);
        frame.get().getContentPane().add(new RepublicanButton(voteAPI), BorderLayout.EAST);
        frame.get().getContentPane().setBackground(Color.BLACK);
        frame.get().add(component);
        frame.get().setVisible(true);

    }

    @Override
    public void run() {
        if (VoteUtils.countDemocratVotes(voteAPI) >= 10) {
            //TODO: Buisness logic for Democrat win goes here
        } else if (VoteUtils.countRepublicanVotes(voteAPI) >= 10) {
            //TODO: Buisness logic for republican win goes here
        }
    }
}