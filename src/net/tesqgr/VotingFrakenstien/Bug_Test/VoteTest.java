package net.tesqgr.VotingFrakenstien.Bug_Test;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class VoteTest extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Donkey bug1 = new Donkey(0, 100);
        VoteAPI voteAPI = new VoteAPI(1, 1, "Memes", "Memer");
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Elephant bug2 = new Elephant(0 ,300);
        bug1.translate(g2,voteAPI);
        bug1.draw(g2);
        bug2.translate(g2, voteAPI);
        bug2.draw(g2);
    }
}