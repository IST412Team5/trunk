/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import java.io.*;
import java.util.Properties;

/**
 *
 * @author marcc_000
 */
public class Utility {

    public static void writeFile(String filePath, String fileContents) {
        // add try catch logic...
        try {
            FileOutputStream FOS = new FileOutputStream(filePath);
            OutputStreamWriter OSW = new OutputStreamWriter(FOS, "utf-8");
            BufferedWriter bw = new BufferedWriter(OSW);
            bw.write(fileContents);
            bw.close();

        } catch (Exception e) {
            // do something here with the exception
        }
    }

    public static String getConfigFile() {
        String AbsolutePath = new File(".").getAbsolutePath();
        return AbsolutePath + "appconfig.properties";
    }

    public static void setConfigItem(String Item, String value) {
    // save a configuration item
        File configFile = new File(getConfigFile());
        try {
            Properties props = new Properties();
            props.setProperty(Item, value);
            FileWriter writer = new FileWriter(configFile);
            props.store(writer, "host settings");
            writer.close();
        } catch (FileNotFoundException ex) {
        // file does not exist
        } catch (IOException ex) {
    // I/O error
        }
    }

    // get a configuration item by it's name
    public static String getConfigItem(String item, String defaultValue) {
        String val = null;
        try {
            FileReader reader = new FileReader(getConfigFile());
            Properties props = new Properties();
            props.load(reader);

            val = props.getProperty(item);

            reader.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        if (isNullOrWhiteSpace(val)) {
            val = defaultValue;
        }
        return val;
    }

    public static boolean isNullOrWhiteSpace(String a) {
        return a == null || (a.length() > 0 && a.trim().length() <= 0);
    }
}
