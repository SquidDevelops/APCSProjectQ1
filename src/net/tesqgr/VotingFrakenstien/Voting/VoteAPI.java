package net.tesqgr.VotingFrakenstien.Voting;

import java.util.ArrayList;
import java.util.List;

public class VoteAPI {
    private double dBias;
    private double rBias;
    private String dCanidate;
    private String rCanidate;

    private List<Vote> rVotes, dVotes;

    public String getdCanidate() {
        return dCanidate;
    }

    public String getrCanidate() {
        return rCanidate;
    }

    public VoteAPI(double dBias, double rBias, String dCanidate, String rCanidate){
        this.dBias = dBias;
        this.rBias = rBias;
        this.dCanidate = dCanidate;
        this.rCanidate = rCanidate;

        rVotes = new ArrayList<Vote>();
        dVotes = new ArrayList<Vote>();
    }
}
