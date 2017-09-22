package net.tesqgr.VotingFrakenstien.Voting;

public class VoteAPI {
    private double dBias;
    private double rBias;
    private String dCanidate;
    private String rCanidate;

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
    }
}
