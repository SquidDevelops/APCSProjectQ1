package net.tesqgr.VotingFrakenstien.Voting;

public class RepublicanVote extends Vote {
    public RepublicanVote(VoteAPI voteAPI) {
        super(VoteType.REPUBLICAN, voteAPI);
        voteAPI.rVotes.add(this);
    }
}
