package net.tesqgr.VotingFrakenstien.Voting;

public class VoteFactory {

    public static RepublicanVote createRepublicanVote(VoteAPI voteAPI) {
        return new RepublicanVote(voteAPI);
    }

    public static DemocratVote createDemocratVote(VoteAPI voteAPI) {
        return new DemocratVote(voteAPI);
    }

    public static void createVotes(int democratVotes, int republicanVotes, VoteAPI voteAPI){
        for(int i = 0 ; i < democratVotes; i++){
            createDemocratVote(voteAPI);
        }
        for(int i = 0 ; i < republicanVotes; i++){
            createRepublicanVote(voteAPI);
        }
    }

}
