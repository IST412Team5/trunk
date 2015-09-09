/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author marcc_000
 */
public class WelcomeTab extends JPanel
{
    public WelcomeTab()
    {
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Welcome to the student program tester",20,20);
    }

}
