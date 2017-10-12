/*
APCS Q1 Project
Jason Ramos, Luke Judy, Ezekiel George
Period: 5
10/11/17
*/
package net.tesqgr.VotingFrakenstien.Voting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ezekiel George
 */
public class VoteAPI {

    private double dBias;
    private double rBias;
    private String dCanidate;
    private String rCanidate;


    protected List<Vote> rVotes, dVotes;

    /**
     * This method returns the current canidate for the Democratic
     *
     * @return String Democratic Canidate
     */
    public String getdCanidate() {
        return dCanidate;
    }

    /**
     * This method returns the current canidate for the Republican
     *
     * @return String Republican canidate
     */
    public String getrCanidate() {
        return rCanidate;
    }

    /**
     * This method returns a double of a bias value to the democratic party, 1.0 being a no bias party
     *
     * @return Returns the bias of the Democratic party
     */
    public double getdBias() {
        return dBias;
    }

    /**
     * This method returns a double of a bias value to the republican party, 1.0 being a no bias party
     *
     * @return Returns the bias of the Republican party
     */
    public double getrBias() {
        return rBias;
    }

    /**
     * This method will get the current winning candidate of the election
     *
     * @return Returns the name of the winning candidate of the election
     */
    public String getWinningCandidate() {
        return VoteUtils.countDemocratVotes(this) >= VoteUtils.countRepublicanVotes(this) ? getdCanidate() : getrCanidate();
    }

    /**
     * A constructor for the VoteAPI that creates an instance of the vote system
     * <p>
     * This class should be stored nonstaticly at runtime and kept for any action on the vote machine
     *
     * @param dBias     The bias towards the Democrat party, 1 is a no bias system
     * @param rBias     The bias towards the Republican party, 1 is a no bias system
     * @param dCanidate The Democratic party's chosen canidate for this election
     * @param rCanidate The Republican party's chosen canidate for this election
     * @author Ezekiel George
     **/
    public VoteAPI(double dBias, double rBias, String dCanidate, String rCanidate) {
        this.dBias = dBias;
        this.rBias = rBias;
        this.dCanidate = dCanidate;
        this.rCanidate = rCanidate;

        rVotes = new ArrayList<Vote>();
        dVotes = new ArrayList<Vote>();
    }

}
