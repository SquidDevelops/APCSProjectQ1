package net.tesqgr.VotingFrakenstien.Components;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;

import javax.swing.*;

public class DemocratButton extends JButton {
    public DemocratButton(VoteAPI voteAPI) {
        super("Vote Democrat");
        this.addActionListener(e -> {
            VoteFactory.createDemocratVote(voteAPI);
            System.out.println("demo vote" + VoteUtils.countDemocratVotes(voteAPI));
        });

    }
}
