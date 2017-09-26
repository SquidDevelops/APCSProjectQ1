package net.tesqgr.VotingFrakenstien.Voting;

public class VoteUtils {
    public static double countDemocratVotes(VoteAPI voteAPI) {
        return voteAPI.dVotes.size() * voteAPI.getdBias();
    }

    public static double countRepublicanVotes(VoteAPI voteAPI) {
        return voteAPI.rVotes.size() * voteAPI.getrBias();
    }

    public static double[] countVotes(VoteAPI voteAPI){
        return new double[]{countDemocratVotes(voteAPI), countRepublicanVotes(voteAPI)};
    }
}
