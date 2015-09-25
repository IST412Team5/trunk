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


/**
 *
 * @author marcc_000
 */
public class RunConfiguration extends JPanel{
    
    
    
    
    public RunConfiguration(){
        
        
        super();
         this.setLayout(null);
        RunConfig screen = new RunConfig();
        screen.setLocation(0, 0);
        add(screen);
        
    }
        /*
        // border layout? maybe
        BorderLayout BL = new BorderLayout();
        super.setLayout(BL);
        BL.layoutContainer(this);
        
        JButton btnRunSingle = new JButton();
        btnRunSingle.setBackground(Color.GREEN);
        btnRunSingle.setForeground(Color.darkGray);
        btnRunSingle.setText("Run Single");
        
        this.add(btnRunSingle,"East");

        JButton btnRunBatch = new JButton();
        btnRunBatch.setBackground(Color.RED);
        btnRunBatch.setForeground(Color.WHITE);
        btnRunBatch.setText("Run Batch");
    
        this.add(btnRunBatch,"West");
        
        JPanel JP = new JPanel();
        JP.setLayout(new GridLayout(0,2));
        JP.setBackground(Color.BLUE);
        
        this.add(JP);
    }
    
    ActionListener ALBatchRun = new ActionListener()
    {

        public void actionPerformed(ActionEvent ae) 
        {
            BatchTester BT = new BatchTester();
            
        }
        
    };
    */
    
} // end 
    
    
    

