package net.tesqgr.VotingFrakenstien.Bug_Test;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Donkey
{
    private int xLeft;
    private int yTop;


    public int getxLeft()
    {
        return xLeft;
    }

    public void setxLeft(int xLeft)
    {
        this.xLeft = xLeft;
    }

    public int getyTop()
    {
        return yTop;
    }

    public void setyTop(int yTop)
    {
        this.yTop = yTop;
    }

    public Donkey(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2)
    {
        Rectangle body
                = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double frontTire
                = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double rearTire
                = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);

        Point2D.Double r1
                = new Point2D.Double(xLeft + 10, yTop + 10);
        Point2D.Double r2
                = new Point2D.Double(xLeft + 20, yTop);
        Point2D.Double r3
                = new Point2D.Double(xLeft + 40, yTop);
        Point2D.Double r4
                = new Point2D.Double(xLeft + 50, yTop + 10);
        Line2D.Double frontWindshield
                = new Line2D.Double(r1, r2);
        Line2D.Double roofTop
                = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield
                = new Line2D.Double(r3, r4);
        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
    public void translate(Graphics2D g2, VoteAPI voteAPI)
    {
        //System.out.println(voteAPI.getdCanidate());
        VoteFactory.createVotes(4, 8, voteAPI);
        if (VoteUtils.countDemocratVotes(voteAPI) > 5)
        {
            g2.translate(6, 7);
        }
        else
        {
            g2.translate(8, 8);
        }
        if (VoteUtils.countDemocratVotes(voteAPI) > 5)
        {
            g2.translate(6, 7);
        }
        else
        {
            g2.translate(8, 8);
        }
    }
}




