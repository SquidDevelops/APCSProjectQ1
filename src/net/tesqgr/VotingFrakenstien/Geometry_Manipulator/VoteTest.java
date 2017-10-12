package net.tesqgr.VotingFrakenstien.Geometry_Manipulator;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class VoteTest extends JComponent implements Runnable {
    private Elephant elephant = new Elephant(100, 300);
    private Donkey donkey = new Donkey(100,300);
    private Graphics2D g22;


    public VoteTest(){
        start();
    }
    public void paintComponent(Graphics g) {
        g22 = (Graphics2D) g;

        elephant.draw(g22);
        donkey.draw(g22);
    }

    @Override
    public void run() {
        while (isVisible()) {
            elephant.translate(g22, VoteViewer.voteAPI);
//            /donkey.translate(g22, VoteViewer.voteAPI);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    private void start()
    {
        while(!isVisible())
        {
            try
            {
                Thread.sleep(1);
            } catch(InterruptedException e) {
                System.exit(1);
            }
        }
        Thread thread = new Thread(this);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.start();
    }
}