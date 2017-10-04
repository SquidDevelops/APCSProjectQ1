package net.tesqgr.VotingFrakenstien.Voting;

public class DemocratVote extends Vote {
    public DemocratVote(VoteAPI voteAPI) {
        super(VoteType.DEMOCRAT, voteAPI);
        voteAPI.dVotes.add(this);

    }
}
