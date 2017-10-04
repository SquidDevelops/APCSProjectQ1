package net.tesqgr.VotingFrakenstien.Tests;

import net.tesqgr.VotingFrakenstien.Constants;
import net.tesqgr.VotingFrakenstien.Voting.Vote;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;
import org.junit.Test;

public class VoteAPITest {

    @Test
    public void testIfVotesCount(){
        VoteAPI voteapi = new VoteAPI(1, 1, "Jason Ramos", "Jason Unramos");
        VoteFactory.createDemocratVote(voteapi);
        VoteFactory.createRepublicanVote(voteapi);
        assert(VoteUtils.countDemocratVotes(voteapi) == 1 && VoteUtils.countRepublicanVotes(voteapi) == 1);
    }

    @Test
    public void testIfDemocraticVotesBiased(){
        VoteAPI voteAPI = new VoteAPI(2, 1, "Jason Ramos", "Jason Unramos");
        VoteFactory.createDemocratVote(voteAPI);
        assert(VoteUtils.countDemocratVotes(voteAPI) == 2);
        VoteFactory.createDemocratVote(voteAPI);
        assert (VoteUtils.countDemocratVotes(voteAPI) == 4);
        assert(VoteUtils.countVotes(voteAPI)[Constants.DEMOCRAT_INDEX] == 4);
    }
    
    @Test
    public void testIfRepublicanVotesBiased(){
        VoteAPI voteAPI = new VoteAPI(1, 2, "Jason Ramos", "Jason Unramos");
        VoteFactory.createRepublicanVote(voteAPI);
        assert(VoteUtils.countRepublicanVotes(voteAPI) == 2);
        VoteFactory.createRepublicanVote(voteAPI);
        assert (VoteUtils.countRepublicanVotes(voteAPI) == 4);
        assert(VoteUtils.countVotes(voteAPI)[Constants.REPUBLICAN_INDEX] == 4);
    }



}
