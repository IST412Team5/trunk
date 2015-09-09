/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import java.io.*;

/**
 *
 * @author marcc_000
 */
public class Utility 
{
    public static void writeFile(String filePath, String fileContents)
    {
        // add try catch logic...
        try
        {
            FileOutputStream FOS = new FileOutputStream(filePath);
            OutputStreamWriter OSW = new OutputStreamWriter(FOS,"utf-8");
            BufferedWriter bw = new BufferedWriter(OSW);
            bw.write(fileContents);
            bw.close();
        
        }
        catch(Exception e)
        {
            // do something here with the exception
        }
        
        
        
        
        
        
        
    }
    
    
}
