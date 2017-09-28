package net.tesqgr.VotingFrakenstien.Voting;

public class VoteFactory {

    public static RepublicanVote createRepublicanVote(VoteAPI voteAPI){
       return new RepublicanVote(voteAPI);
    }

    public static DemocratVote createDemocratVote(VoteAPI voteAPI){
        return new DemocratVote(voteAPI);
    }

    public static void addDemocratVotes(VoteAPI voteAPI)


}
