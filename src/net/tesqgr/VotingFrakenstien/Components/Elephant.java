package net.tesqgr.VotingFrakenstien.Components;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;
import net.tesqgr.VotingFrakenstien.Voting.VoteUtils;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Elephant {
    private int xLeft;
    private int yTop;
    private int lastVotes = 0;
    Line2D.Double leg1;
    Line2D.Double leg2;
    Line2D.Double leg3;
    Line2D.Double leg4;
    Line2D.Double leg5;
    Line2D.Double leg6;
    Line2D.Double tail1;
    Line2D.Double tail2;
    Line2D.Double body1;
    Line2D.Double body6;
    QuadCurve2D body2;
    QuadCurve2D body3;
    QuadCurve2D body4;
    QuadCurve2D body5;
    QuadCurve2D body7;
    Line2D.Double trunk1;
    Line2D.Double trunk4;
    QuadCurve2D trunk2;
    QuadCurve2D trunk3;


    public Elephant(int x, int y) {
        xLeft = x;
        yTop = y;

        leg2 = new Line2D.Double(xLeft + 10, yTop + 120, xLeft + 40, yTop + 120);
        leg1 = new Line2D.Double(xLeft + 10, yTop + 70, xLeft + 10, yTop + 120);
        leg3 = new Line2D.Double(xLeft + 40, yTop + 120, xLeft + 40, yTop + 90);
        leg4 = new Line2D.Double(xLeft + 90, yTop + 90, xLeft + 90, yTop + 120);
        leg5 = new Line2D.Double(xLeft + 90, yTop + 120, xLeft + 120, yTop + 120);
        leg6 = new Line2D.Double(xLeft + 120, yTop + 120, xLeft + 120, yTop + 80);
        tail2 = new Line2D.Double(xLeft + 0, yTop + 70, xLeft + 10, yTop + 60);
        tail1 = new Line2D.Double(xLeft + 10, yTop + 70, xLeft + 0, yTop + 70);
        body1 = new Line2D.Double(xLeft + 10, yTop + 60, xLeft + 10, yTop + 50);
        body6 = new Line2D.Double(xLeft + 140, yTop + 50, xLeft + 140, yTop + 80);
        body2 = new QuadCurve2D.Double(xLeft + 10, yTop + 50, xLeft + 15, yTop + 30, xLeft + 20, yTop + 30);
        body3 = new QuadCurve2D.Double(xLeft + 20, yTop + 30, xLeft + 40, yTop + 5, xLeft + 65, yTop + 5);
        body4 = new QuadCurve2D.Double(xLeft + 65, yTop + 5, xLeft + 120, yTop + 5, xLeft + 130, yTop + 30);
        body5 = new QuadCurve2D.Double(xLeft + 130, yTop + 30, xLeft + 135, yTop + 30, xLeft + 140, yTop + 50);
        body7 = new QuadCurve2D.Double(xLeft + 40, yTop + 90, xLeft + 65, yTop + 100, xLeft + 90, yTop + 90);
        trunk1 = new Line2D.Double(xLeft + 120, yTop + 80, xLeft + 130, yTop + 100);
        trunk4 = new Line2D.Double(xLeft + 170, yTop + 80, xLeft + 160, yTop + 80);
        trunk2 = new QuadCurve2D.Double(xLeft + 140, yTop + 80, xLeft + 150, yTop + 100, xLeft + 160, yTop + 80);
        trunk3 = new QuadCurve2D.Double(xLeft + 130, yTop + 100, xLeft + 150, yTop + 120, xLeft + 170, yTop + 80);
    }


    public void draw(Graphics2D g2) {
        //Set Color
        g2.setColor(Color.RED);

        // Draw text
        g2.drawString("Republicans", xLeft + 35, yTop + 50);

        // Draw legs
        leg2 = new Line2D.Double(xLeft + 10, yTop + 120, xLeft + 40, yTop + 120);
        leg1 = new Line2D.Double(xLeft + 10, yTop + 70, xLeft + 10, yTop + 120);
        leg3 = new Line2D.Double(xLeft + 40, yTop + 120, xLeft + 40, yTop + 90);
        leg4 = new Line2D.Double(xLeft + 90, yTop + 90, xLeft + 90, yTop + 120);
        leg5 = new Line2D.Double(xLeft + 90, yTop + 120, xLeft + 120, yTop + 120);
        leg6 = new Line2D.Double(xLeft + 120, yTop + 120, xLeft + 120, yTop + 80);
        tail2 = new Line2D.Double(xLeft, yTop + 70, xLeft + 10, yTop + 60);
        tail1 = new Line2D.Double(xLeft + 10, yTop + 70, xLeft, yTop + 70);
        body1 = new Line2D.Double(xLeft + 10, yTop + 60, xLeft + 10, yTop + 50);
        body6 = new Line2D.Double(xLeft + 140, yTop + 50, xLeft + 140, yTop + 80);
        body2 = new QuadCurve2D.Double(xLeft + 10, yTop + 50, xLeft + 15, yTop + 30, xLeft + 20, yTop + 30);
        body3 = new QuadCurve2D.Double(xLeft + 20, yTop + 30, xLeft + 40, yTop + 5, xLeft + 65, yTop + 5);
        body4 = new QuadCurve2D.Double(xLeft + 65, yTop + 5, xLeft + 120, yTop + 5, xLeft + 130, yTop + 30);
        body5 = new QuadCurve2D.Double(xLeft + 130, yTop + 30, xLeft + 135, yTop + 30, xLeft + 140, yTop + 50);
        body7 = new QuadCurve2D.Double(xLeft + 40, yTop + 90, xLeft + 65, yTop + 100, xLeft + 90, yTop + 90);
        trunk1 = new Line2D.Double(xLeft + 120, yTop + 80, xLeft + 130, yTop + 100);
        trunk4 = new Line2D.Double(xLeft + 170, yTop + 80, xLeft + 160, yTop + 80);
        trunk2 = new QuadCurve2D.Double(xLeft + 140, yTop + 80, xLeft + 150, yTop + 100, xLeft + 160, yTop + 80);
        trunk3 = new QuadCurve2D.Double(xLeft + 130, yTop + 100, xLeft + 150, yTop + 120, xLeft + 170, yTop + 80);


        g2.draw(leg1);
        g2.draw(leg2);
        g2.draw(leg3);
        g2.draw(leg4);
        g2.draw(leg5);
        g2.draw(leg6);

        // Draw tail

        g2.draw(tail1);
        g2.draw(tail2);

        // Draw body

        g2.draw(body1);
        g2.draw(body2);
        g2.draw(body3);
        g2.draw(body4);
        g2.draw(body5);
        g2.draw(body6);
        g2.draw(body7);

        // Draw trunk

        g2.draw(trunk1);
        g2.draw(trunk2);
        g2.draw(trunk3);
        g2.draw(trunk4);
    }

    public void translate(Graphics2D g2, VoteAPI voteAPI) {
        if (lastVotes < VoteUtils.countRepublicanVotes(voteAPI)) {
            xLeft += 0x32;
            lastVotes = (int) Math.ceil(VoteUtils.countRepublicanVotes(voteAPI));
        }
    }


}





