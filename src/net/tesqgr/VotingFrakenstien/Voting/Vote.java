package net.tesqgr.VotingFrakenstien.Voting;

public class Vote {
    private VoteType voteType;
    private long timeStamp;

    public Vote(VoteType voteType, VoteAPI voteAPI){
        this.timeStamp = System.currentTimeMillis();
        this.voteType = voteType;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public long getTimeStamp(){
        return timeStamp;
    }

}
