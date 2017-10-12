package net.tesqgr.VotingFrakenstien.Components;

import net.tesqgr.VotingFrakenstien.VoteViewer;

import javax.swing.*;
import java.awt.*;

public class VoteAnimals extends JComponent implements Runnable {
    private Elephant elephant = new Elephant(100, 400);
    private Donkey donkey = new Donkey(100, 200);
    private Graphics2D g22;


    public VoteAnimals() {
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
            donkey.translate(g22, VoteViewer.voteAPI);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    private void start() {
        while (!isVisible()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.exit(1);
            }
        }
        Thread thread = new Thread(this);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.start();
    }
}