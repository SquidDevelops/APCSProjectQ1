package net.tesqgr.VotingFrakenstien.Voting;

import net.tesqgr.VotingFrakenstien.VotingFrankenstien;

public class DemocratVote extends Vote {
    public DemocratVote(VoteAPI voteAPI) {
        super(VoteType.DEMOCRAT, voteAPI);
        voteAPI.dVotes.add(this);
        if (VoteUtils.countDemocratVotes(voteAPI) >= 10)
            VotingFrankenstien.democratWin();
    }
}
