package net.tesqgr.VotingFrakenstien.Geometry_Manipulator;

import net.tesqgr.VotingFrakenstien.Voting.VoteAPI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class VoteTest extends JComponent implements Runnable {
    private Elephant elephant = new Elephant(100, 300);
    private Graphics2D g22;


    public VoteTest(){
        start();
    }
    public void paintComponent(Graphics g) {
        g22 = (Graphics2D) g;
        //Donkey donkey = new Donkey(0, 100);

        int x = getWidth() - 60;
        int y = getHeight() - 30;
        //try
        // {
        //  donkey.translate(g2,voteAPI);
        // } catch (InterruptedException e)
        // {
        //   e.printStackTrace();
        //}
        // donkey.draw(g2);

        //g2.draw(new Line2D.Double( 10,  120,  40,  120));

        elephant.draw(g22);
    }

    @Override
    public void run() {
        while (isVisible()) {
            elephant.translate(g22, VoteViewer.voteAPI);

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