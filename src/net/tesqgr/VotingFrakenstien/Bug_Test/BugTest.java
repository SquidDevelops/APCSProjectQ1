package net.tesqgr.VotingFrakenstien.Bug_Test;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BugTest extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Bug bug1 = new Bug(0, 0);
        //System.out.println(bug1.getxLeft());
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Bug bug2 = new Bug(x, y);
        bug1.draw(g2);
        VoteAPI voteAPI = new VoteAPI(1, 1, "Memes", "Memer");
        bug1.translate(g2,voteAPI);
        bug2.draw(g2);
        bug1.draw(g2);
    }
}