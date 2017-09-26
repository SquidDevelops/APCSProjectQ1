package net.tesqgr.VotingFrakenstien.Bug_Test;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Bug_Test extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Bug bug1 = new Bug(0, 0);
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Bug bug2 = new Bug(x, y);
        bug1.draw(g2);
        bug2.draw(g2);
    }
}