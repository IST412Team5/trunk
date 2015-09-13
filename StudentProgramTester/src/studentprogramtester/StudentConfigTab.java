package studentprogramtester;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class StudentConfigTab extends JPanel {

    public StudentConfigTab() {
        super();
        BorderLayout BL = new BorderLayout();
        super.setLayout(BL);
        BL.layoutContainer(this);
    }

    private void loadStudents() {
        String file = Utility.getConfigItem("StudentFilePath", "C:\\java\\students.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            StringBuilder stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");

            try {
                while ((line = reader.readLine()) != null) {

                }
            } catch (IOException IOE) {
            }
        } catch (FileNotFoundException fnfex) {
        }
    }
}
