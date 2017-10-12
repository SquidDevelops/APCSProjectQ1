/*
APCS Q1 Project
Jason Ramos, Luke Judy, Ezekiel George
Period: 5
10/11/17
*/
package net.tesqgr.VotingFrakenstien.Components;


import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;

import javax.swing.*;

public class DemocratButton extends JButton {
    public DemocratButton(VoteAPI voteAPI) {
        super("Vote Democrat");
        this.addActionListener(e -> {
            VoteFactory.createDemocratVote(voteAPI);
        });

    }
}
