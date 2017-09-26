package net.tesqgr.VotingFrakenstien.Voting;

public class VoteFactory {

    public static Vote createRepublicanVote(VoteAPI voteAPI){
       return new Vote(VoteType.REPUBLICAN, voteAPI);
    }

    public static Vote createDemocratVote(VoteAPI voteAPI){
        return new Vote(VoteType.DEMOCRAT, voteAPI);
    }


}
