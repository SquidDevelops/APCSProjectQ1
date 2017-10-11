package net.tesqgr.VotingFrakenstien.Geometry_Manipulator;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class VoteTest extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Donkey donkey = new Donkey(0, 100);
        VoteAPI voteAPI = new VoteAPI(1, 1, "Memes", "Memer");
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Elephant elephant = new Elephant(0 ,300);
        try
        {
            donkey.translate(g2,voteAPI);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        donkey.draw(g2);
        try
        {
            elephant.translate(g2, voteAPI);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        elephant.draw(g2);
    }

}