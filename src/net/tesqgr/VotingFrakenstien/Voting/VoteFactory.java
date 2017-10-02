package net.tesqgr.VotingFrakenstien.Voting;

public class VoteFactory {

    public static RepublicanVote createRepublicanVote(VoteAPI voteAPI) {
        return new RepublicanVote(voteAPI);
    }

    public static DemocratVote createDemocratVote(VoteAPI voteAPI) {
        return new DemocratVote(voteAPI);
    }

    /**
     *  This function will create a specified amount of votes on the given voteapi
     * @param democratVotes The amount of d votes you want added
     * @param republicanVotes The amount of r votes
     * @param voteAPI the non static voteapi
     */
    public static void createVotes(int democratVotes, int republicanVotes, VoteAPI voteAPI){
        for(int i = 0 ; i < democratVotes; i++){
            createDemocratVote(voteAPI);
        }
        for(int i = 0 ; i < republicanVotes; i++){
            createRepublicanVote(voteAPI);
        }
    }

}
