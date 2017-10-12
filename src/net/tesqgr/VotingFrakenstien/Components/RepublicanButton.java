package net.tesqgr.VotingFrakenstien.Components;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;

import javax.swing.*;

public class RepublicanButton extends JButton {
    public RepublicanButton(VoteAPI voteAPI) {
        super("Vote nigga");
        this.addActionListener(e -> {
            VoteFactory.createRepublicanVote(voteAPI);
            System.out.println("demo vote" + VoteUtils.countRepublicanVotes(voteAPI));
        });
    }
}
