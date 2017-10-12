/*
APCS Q1 Project
Jason Ramos, Luke Judy, Ezekiel George
Period: 5
10/11/17
*/
package net.tesqgr.VotingFrakenstien.Voting;

import net.tesqgr.VotingFrakenstien.VotingFrankenstien;

public class RepublicanVote extends Vote {
    public RepublicanVote(VoteAPI voteAPI) {
        super(VoteType.REPUBLICAN, voteAPI);
        voteAPI.rVotes.add(this);
        if (VoteUtils.countRepublicanVotes(voteAPI) >= 10)
            VotingFrankenstien.republicanWin();
    }
}
