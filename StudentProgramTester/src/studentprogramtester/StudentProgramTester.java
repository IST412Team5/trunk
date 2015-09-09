package studentprogramtester;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author marcc_000
 */
public final class StudentProgramTester extends JFrame {

    Container pane = getContentPane();
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;
    JTabbedPane tp;

    public StudentProgramTester() {
        super("Program Tester");
        initApp();
    }

    private void initApp() {
        setLocation(300, 100);                      // place the JFrame at 300,100
        setSize(FRAME_WIDTH, FRAME_HEIGHT);         // set the size of the window to 800x800
        setResizable(false);                        // no resizing permitted, therefore no redrawing needed

        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Terminate the program on window close
        setContentPane(pane);
        initTabbedDoc();
        setVisible(true);                           // so we can see it
    }

    private void initTabbedDoc() {
//        ChangeListener changeListener = new ChangeListener()
//        {
//            public void stateChanged(ChangeEvent ce)
//            {
//                JTabbedPane sourceTabbedPane = (JTabbedPane) ce.getSource();
//                int idx = sourceTabbedPane.getSelectedIndex();
//                sourceTabbedPane.setSelectedIndex(idx);
//                
//            }
//        };
//
//        tp.addChangeListener(changeListener);

        tp = new JTabbedPane() {
            public Dimension getPreferredSize() {
                return new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
            };
        };


        tp.setVisible(true);

        IOConfigTab ICT = new IOConfigTab();
        WelcomeTab WT = new WelcomeTab();
        AppConfig AC = new AppConfig();
        StudentConfigTab SCT = new StudentConfigTab();
        RunConfiguration RCT = new RunConfiguration();
        tp.add("Welcome",WT);
        tp.add("Application Configuration", AC);
        tp.add("Program IO Configuration", ICT);
        tp.add("Roster Configuration", SCT);
        tp.add("Configure and Run", RCT);
        this.add(tp);
        
        this.pack();
    }

}
