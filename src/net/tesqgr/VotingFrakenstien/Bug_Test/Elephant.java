package net.tesqgr.VotingFrakenstien.Bug_Test;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

public class Elephant
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

    public Elephant(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2)
    {
        // Recover Graphics2D
        //Graphics2D g2 = (Graphics2D);
        g2.setColor(Color.RED);

        // Draw text
        g2.drawString("Republicans", 35, 50);

        // Draw legs
        Line2D.Double leg1 = new Line2D.Double( xLeft + 10,yTop + 70,xLeft + 10,yTop + 120);
        Line2D.Double leg2 = new Line2D.Double( xLeft + 10,yTop + 120,xLeft + 40,yTop + 120);
        Line2D.Double leg3 = new Line2D.Double( xLeft + 40,yTop + 120,xLeft + 40,yTop + 90);
        Line2D.Double leg4 = new Line2D.Double( xLeft + 90,yTop + 90,xLeft  + 90,yTop + 120);
        Line2D.Double leg5 = new Line2D.Double( xLeft + 90,yTop + 120,xLeft + 120,yTop + 120);
        Line2D.Double leg6 = new Line2D.Double( xLeft + 120,yTop + 120,xLeft + 120,yTop + 80);
        g2.draw(leg1);
        g2.draw(leg2);
        g2.draw(leg3);
        g2.draw(leg4);
        g2.draw(leg5);
        g2.draw(leg6);

        // Draw tail
        Line2D.Double tail1 = new Line2D.Double( xLeft + 10,yTop + 70,xLeft + 0,yTop + 70);
        Line2D.Double tail2 = new Line2D.Double( xLeft + 0,yTop + 70,xLeft + 10,yTop + 60);
        g2.draw(tail1);
        g2.draw(tail2);

        // Draw body
        Line2D.Double body1 = new Line2D.Double( xLeft + 10,yTop + 60,xLeft + 10,yTop +50);
        Line2D.Double body6 = new Line2D.Double( xLeft + 140,yTop + 50,xLeft + 140,yTop + 80);
        QuadCurve2D body2 = new QuadCurve2D.Double( xLeft + 10,yTop + 50,xLeft + 15,yTop + 30,xLeft + 20,yTop + 30);
        QuadCurve2D body3 = new QuadCurve2D.Double( xLeft + 20,yTop + 30,xLeft + 40,yTop + 5,xLeft + 65,yTop + 5);
        QuadCurve2D body4 = new QuadCurve2D.Double( xLeft + 65,yTop + 5,xLeft + 120,yTop + 5,xLeft + 130,yTop + 30);
        QuadCurve2D body5 = new QuadCurve2D.Double( xLeft + 130,yTop + 30,xLeft + 135,yTop + 30,xLeft + 140,yTop + 50);
        QuadCurve2D body7 = new QuadCurve2D.Double( xLeft + 40,yTop + 90,xLeft + 65,yTop + 100,xLeft + 90,yTop + 90);
        g2.draw(body1);
        g2.draw(body2);
        g2.draw(body3);
        g2.draw(body4);
        g2.draw(body5);
        g2.draw(body6);
        g2.draw(body7);

        // Draw trunk
        Line2D.Double trunk1 = new Line2D.Double( xLeft + 120,yTop + 80,xLeft + 130,yTop +100);
        Line2D.Double trunk4 = new Line2D.Double( xLeft + 170,yTop + 80,xLeft + 160,yTop +80);
        QuadCurve2D trunk2 = new QuadCurve2D.Double( xLeft + 140,yTop + 80,xLeft + 150,yTop + 100,xLeft + 160,yTop + 80);
        QuadCurve2D trunk3 = new QuadCurve2D.Double( xLeft + 130,yTop + 100,xLeft + 150,yTop + 120,xLeft + 170,yTop + 80);
        g2.draw(trunk1);
        g2.draw(trunk2);
        g2.draw(trunk3);
        g2.draw(trunk4);
    }
    public void translate(Graphics2D g2, VoteAPI voteAPI)
    {
        //System.out.println(voteAPI.getdCanidate());
        VoteFactory.createVotes(4, 8, voteAPI);
        Thread t  = new Thread(() ->
        {
            int lastVotes = 0;
            while (true)
            {
                if (lastVotes < VoteUtils.countDemocratVotes(voteAPI))
                {
                    g2.translate(20, 0);
                    lastVotes = (int) VoteUtils.countDemocratVotes(voteAPI);
                }
                else
                {
                    g2.translate(0, 0);
                }
                if (lastVotes < VoteUtils.countRepublicanVotes(voteAPI))
                {
                    g2.translate(20, 0);
                    lastVotes = (int) VoteUtils.countRepublicanVotes(voteAPI);
                }
                else
                {
                    g2.translate(0, 0);
                }
            }
        });
        t.start();

    }
}




