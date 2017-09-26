package net.tesqgr.VotingFrakenstien.Voting;

import java.util.ArrayList;
import java.util.List;

public class VoteAPI {

    private double dBias;
    private double rBias;
    private String dCanidate;
    private String rCanidate;



    protected List<Vote> rVotes, dVotes;

    /**
     * This method returns the current canidate for the Democratic
     * @return String Democratic Canidate
     */
    public String getdCanidate() {
        return dCanidate;
    }
    /**
     * This method returns the current canidate for the Republican
     * @return String Republican canidate
     */
    public String getrCanidate() {
        return rCanidate;
    }

    public double getdBias() {
        return dBias;
    }

    public double getrBias() {
        return rBias;
    }

    /**
     * A constructor for the VoteAPI that creates an instance of the vote system
     * <p>
     * This class should be stored nonstaticly at runtime and kept for any action on the vote machine
     * @param dBias The bias towards the Democrat party, 1 is a no bias system
     * @param rBias The bias towards the Republican party, 1 is a no bias system
     * @param dCanidate The Democratic party's chosen canidate for this election
     * @param rCanidate The Republican party's chosen canidate for this election
     *
     * @author Ezekiel George
     **/
    public VoteAPI(double dBias, double rBias, String dCanidate, String rCanidate){
        this.dBias = dBias;
        this.rBias = rBias;
        this.dCanidate = dCanidate;
        this.rCanidate = rCanidate;

        rVotes = new ArrayList<Vote>();
        dVotes = new ArrayList<Vote>();
    }

}
