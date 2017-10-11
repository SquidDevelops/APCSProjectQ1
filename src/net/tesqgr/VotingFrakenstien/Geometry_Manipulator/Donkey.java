package net.tesqgr.VotingFrakenstien.Geometry_Manipulator;
import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;
import net.tesqgr.VotingFrakenstien.Voting.VoteFactory;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;


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
        //Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);

        // Draw text
        //g2.drawString("Democrats",20,60);

        // Draw legs
        Line2D.Double leg1 = new Line2D.Double(xLeft + 10,yTop + 70,xLeft + 10,yTop + 120);
        Line2D.Double leg2 = new Line2D.Double(xLeft + 10,yTop + 120,xLeft + 40,yTop + 120);
        Line2D.Double leg3 = new Line2D.Double(xLeft + 40,yTop + 120,xLeft + 30,yTop + 110);
        Line2D.Double leg4 = new Line2D.Double(xLeft + 30,yTop + 110,xLeft + 30,yTop + 80);
        Line2D.Double leg5 = new Line2D.Double(xLeft + 30,yTop + 80,xLeft + 60,yTop + 80);
        Line2D.Double leg6 = new Line2D.Double(xLeft + 60,yTop + 80,xLeft + 60,yTop + 120);
        Line2D.Double leg7 = new Line2D.Double(xLeft + 60,yTop + 120,xLeft + 90,yTop + 120);
        Line2D.Double leg8 = new Line2D.Double(xLeft + 90,yTop + 120,xLeft + 80,yTop + 110);
        Line2D.Double leg9 = new Line2D.Double(xLeft + 80,yTop + 110,xLeft + 80,yTop + 80);
        g2.draw(leg1);
        g2.draw(leg2);
        g2.draw(leg3);
        g2.draw(leg4);
        g2.draw(leg5);
        g2.draw(leg6);
        g2.draw(leg7);
        g2.draw(leg8);
        g2.draw(leg9);

        // Draw tail
        Line2D.Double tail1 = new Line2D.Double(xLeft + 10,yTop + 70,xLeft + 0,yTop + 75);
        Line2D.Double tail2 = new Line2D.Double(xLeft + 0,yTop + 75,xLeft + 10,yTop + 60);
        g2.draw(tail1);
        g2.draw(tail2);

        // Draw body
        Line2D.Double body1 = new Line2D.Double(xLeft + 30,yTop + 40,xLeft + 80,yTop + 40);
        QuadCurve2D body2 = new QuadCurve2D.Double(xLeft + 10,yTop + 60,xLeft + 15,yTop + 40,xLeft + 30,yTop + 40);
        QuadCurve2D body3 = new QuadCurve2D.Double(xLeft + 80,yTop + 80,xLeft + 90,yTop + 78.75,xLeft + 90,yTop + 60);
        g2.draw(body1);
        g2.draw(body2);
        g2.draw(body3);

        // Draw head
        Line2D.Double head3 = new Line2D.Double(xLeft + 95,yTop + 8,xLeft + 95,yTop + 20);
        Line2D.Double head4 = new Line2D.Double(xLeft + 95,yTop + 20,xLeft + 110,yTop + 10);
        Line2D.Double head6 = new Line2D.Double(xLeft + 105,yTop + 25,xLeft + 115,yTop + 30);
        QuadCurve2D head1 = new QuadCurve2D.Double(xLeft + 80,yTop + 40,xLeft + 87.5,yTop + 37.5,xLeft + 90,yTop + 30);
        QuadCurve2D head2 = new QuadCurve2D.Double(xLeft + 90,yTop + 30,xLeft + 85,yTop + 20,xLeft + 95,yTop + 8);
        QuadCurve2D head5 = new QuadCurve2D.Double(xLeft + 110,yTop + 10,xLeft + 112.5,yTop + 17.5,xLeft + 105,yTop + 25);
        QuadCurve2D head7 = new QuadCurve2D.Double(xLeft + 115,yTop + 30,xLeft + 150,yTop + 60,xLeft + 110,yTop + 60);
        QuadCurve2D head8 = new QuadCurve2D.Double(xLeft + 110,yTop + 60,xLeft + 100,yTop + 50,xLeft + 90,yTop + 60);
        g2.draw(head1);
        g2.draw(head2);
        g2.draw(head3);
        g2.draw(head4);
        g2.draw(head5);
        g2.draw(head6);
        g2.draw(head7);
        g2.draw(head8);


    }
    public void translate(Graphics2D g2, VoteAPI voteAPI) throws InterruptedException
    {
        //System.out.println(voteAPI.getdCanidate());
        VoteFactory.createVotes(40, 20, voteAPI);
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
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        Thread.sleep(1000);
        t.start();

    }
}




