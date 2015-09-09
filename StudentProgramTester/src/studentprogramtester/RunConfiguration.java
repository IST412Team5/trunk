/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Jtester.*;

/**
 *
 * @author marcc_000
 */
public class RunConfiguration extends JPanel{
    public RunConfiguration()
    {
        // border layout? maybe
        GridLayout GL = new GridLayout(0,2);
        super.setLayout(GL);
        GL.setHgap(5);
        GL.setVgap(5);
        GL.layoutContainer(this);
        
        JButton btnRunSingle = new JButton();
        btnRunSingle.setBackground(Color.GREEN);
        btnRunSingle.setForeground(Color.darkGray);
        btnRunSingle.setText("Run Single");
        
        this.add(btnRunSingle);

        JButton btnRunBatch = new JButton();
        btnRunBatch.setBackground(Color.RED);
        btnRunBatch.setForeground(Color.WHITE);
        btnRunBatch.setText("Run Batch");
    
        this.add(btnRunBatch);
    }
    
    ActionListener ALBatchRun = new ActionListener()
    {

        public void actionPerformed(ActionEvent ae) 
        {
            BatchTester BT = new BatchTester();
            
        }
        
    };
    
    
    
}
