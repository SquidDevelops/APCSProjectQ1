package net.tesqgr.VotingFrakenstien.Tests;

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



}
