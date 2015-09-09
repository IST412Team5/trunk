/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author marcc_000
 */
public class IOConfigTab extends JPanel
{
    JTextArea tbCMDLineArgs;
    JTextArea tbTestInput;
    JButton btnSave;
    JButton btnCancel;
    public IOConfigTab()
    {
        configureLayout();
    }

    private void configureLayout()
    {
        GridLayout GL = new GridLayout(0,2);
        super.setLayout(GL);
        GL.setHgap(5);
        GL.setVgap(5);
        GL.layoutContainer(this);
        

        
        JLabel lblCmdLineArgs = new JLabel("Command Line Arguments");
        tbCMDLineArgs = new JTextArea();
        tbCMDLineArgs.setText("Factorial 5\nFactorial 10\nArraySearcher 4 4 2 3 1 5\nArraySearcher 3 4 2 3 4 5\nTestProgram");

        JLabel lblTestInput = new JLabel("System Inputs");
        tbTestInput = new JTextArea();
        tbTestInput.setText("None\nNone\nNone\nNone\nNone");
        
        btnSave = new JButton("Save");
        btnSave.addActionListener(ALSaveButton);
        
        btnCancel = new JButton("Cancel");

        super.add(lblCmdLineArgs);
        super.add(tbCMDLineArgs);

        super.add(lblTestInput);
        super.add(tbTestInput);
        
        super.add(btnSave);
        super.add(btnCancel);

    }
    
    
    ActionListener ALSaveButton = new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            Utility.writeFile("c:\\java\\src\\args.txt", tbCMDLineArgs.getText());
            Utility.writeFile("c:\\java\\src\\TestInput.txt", tbTestInput.getText());
        }

    };
    
            
    

}
