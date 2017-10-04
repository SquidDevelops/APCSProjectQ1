package net.tesqgr.VotingFrakenstien.Voting;

public class Vote {
    private VoteType voteType;
    private long timeStamp;

    /**
     * This constructor constructs the basic vote and adds a time stamp to it in UNIX time
     *
     * @param voteType The enum type of the vote
     * @param voteAPI  The current instance of the of the Vote API
     */
    public Vote(VoteType voteType, VoteAPI voteAPI) {
        this.timeStamp = System.currentTimeMillis();
        this.voteType = voteType;
    }

    /**
     * This returns the enum type of the vote of the party
     *
     * @return The enum type of the vote
     */
    public VoteType getVoteType() {
        return voteType;
    }

    /**
     * @return The UNIX time stamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

}
