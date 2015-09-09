/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import java.awt.Graphics;
import javax.swing.*;


/**
 *
 * @author marcc_000
 */
public class StudentConfigTab extends JPanel 
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Eventually this will contain some stuff for choosing members of the class",20,20);
    }

}
