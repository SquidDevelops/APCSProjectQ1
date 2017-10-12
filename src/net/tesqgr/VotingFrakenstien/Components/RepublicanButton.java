package net.tesqgr.VotingFrakenstien.Components;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;

import javax.swing.*;

public class RepublicanButton extends JButton {
    public RepublicanButton(VoteAPI voteAPI) {
        super("Vote Republican");
        this.addActionListener(e -> {
            VoteFactory.createRepublicanVote(voteAPI);
        });
    }
}
