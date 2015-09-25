/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;

import studentprogramtester.controler.DataObject;

/**
 *
 * @author marcc_000
 */
public class App {
    
    
    public static DataObject data;
    public static RunConfig runCon;
    
    public static void main(String[] args)
    {
        data = new DataObject();
        
        StudentProgramTester SPT = new StudentProgramTester();      // instantiate a new student program tester, it takes care of everything from there
    }
}
