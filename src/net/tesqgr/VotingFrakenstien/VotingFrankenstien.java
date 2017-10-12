package net.tesqgr.VotingFrakenstien;

import net.tesqgr.VotingFrakenstien.Components.DemocratButton;
import net.tesqgr.VotingFrakenstien.Components.RepublicanButton;
import net.tesqgr.VotingFrakenstien.Components.VoteAnimals;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;
//import java.awt.*;

public class VotingFrankenstien {
    public static VoteAPI voteAPI = new VoteAPI(1, 1, "George", "Ryan");
    public static AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());

    private static boolean hasWon;


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

    public static void republicanWin() {
        //TODO:Logic
        System.out.println("R win");
        if (!hasWon)
            frame.get().getContentPane().setBackground(Color.RED);
        hasWon = true;
    }

    public static void democratWin() {
        //TODO:Logic
        System.out.println("d win");
        if (!hasWon)
            frame.get().getContentPane().setBackground(Color.BLUE);
        hasWon = true;
    }

}