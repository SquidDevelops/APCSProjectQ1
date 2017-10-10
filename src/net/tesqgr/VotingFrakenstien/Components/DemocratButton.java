package net.tesqgr.VotingFrakenstien.Components;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;

import javax.swing.*;

public class DemocratButton extends JButton {
    public DemocratButton(String text, VoteAPI voteAPI) {
        super(text);
        this.addActionListener(e -> {
            VoteFactory.createDemocratVote(voteAPI);
            System.out.println("demo vote" + VoteUtils.countDemocratVotes(voteAPI));
        });

    }
}