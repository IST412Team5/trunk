/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester.controler;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.io.*;
import java.util.*;
//import javax.swing.JButton;

public class BatchTester
{
    DataObject dataObject; 
public  BatchTester()
  {
      
          //dataObject = new DataObject();
    dataObject = studentprogramtester.App.data;
//  initialize student and class configuration data
    dataObject.setNumbr(0);
    dataObject.setNme("blank");
    dataObject.setHndl("000000");
    String className = "242-1\\"; 
    String configFileName = "C:\\java\\src\\program-test-242-1\\configBatch.txt";
//  System.out.println("configFileName: " + configFileName);
    
    dataObject.setPth("C:\\java\\jdk1.8.0_60\\bin");
//  set fixed paths and file names:
    dataObject.setSrcPath("C:\\java\\src\\program-test-242-1\\src\\src-output");
    dataObject.setTestDataPath("C:\\java\\src\\program-test-242-1\\src");
    dataObject.setArgsFileName(studentprogramtester.Utility.getConfigItem("ArgsTextFile", "C:\\java\\src\\args.txt"));
    //dataObject.setArgsFileName("C:/java/src/args.txt");
    dataObject.setTestInputFileName(studentprogramtester.Utility.getConfigItem("TestInputTextFile", "C:\\java\\src\\args.txt"));
/*  make sure set correctly
    System.out.println("path: " + path);
    System.out.println("sourcePath: " + sourcePath);
    System.out.println("testDataPath: " + testDataPath);
    System.out.println("argsFileName: " + argsFileName);
    System.out.println("testInputFileName: " + testInputFileName);
*/
    try
    {
//    config file has list of ordinal student number,
//    student name, and random handle
      File configFile = new File(configFileName);
      Scanner in = new Scanner(configFile);
      int runNumber = 1;
      
      while(in.hasNextLine())
      {
        String line  = in.nextLine();
        
        Scanner inLine = new Scanner(line);
//      debug code - print out scanned config info
//      System.out.print("scanned config info: ");
        while(inLine.hasNext())
        {
          dataObject.numbr = inLine.nextInt();
          dataObject.nme = inLine.next();
          dataObject.hndl = inLine.next();
        }

//      set paths and file names:
        dataObject.setClsPath("\\java\\bin\\" + className + dataObject.nme);
        dataObject.setStdPath(dataObject.srcPath + "\\" + dataObject.nme);
        dataObject.setInputFileStub(dataObject.stdPath + "\\input");
       dataObject.setOutFileName(dataObject.stdPath + "\\output-" + dataObject.nme + ".txt");
/*      make sure set correctly
        System.out.println("classPath: " + classPath);
        System.out.println("studentPath: " + studentPath);
        System.out.println("inputFileStub: " + inputFileStub);
        System.out.println("outputFileName: " + outputFileName);
*/
      
        System.out.println("UPDATED BATCH TESTER\nrun #: " + runNumber + " ;\n studentNumber: " + dataObject.numbr + 
        ";\nName: " + dataObject.nme + "; \nHandle: " + dataObject.hndl);
        System.out.println("UBT Output goes to: " + dataObject.outFileName + dataObject.showDataObject() + "END UPDATED BATCH TESTER\n\n");
        
//      run javac compiler - returns 0 on success
//      Compiler Constructor:
//      public Compiler(int numbr, String nme, String hndl, String pth, String clsPath, 
//      String srcPath, String stdPath, String outFileName)
        
       
        
       Compiler c = new Compiler(dataObject);
        int success = c.compileJava();
       

        int studentArrayNumber = runNumber - 1;
	  if(studentArrayNumber < 0){
              studentArrayNumber = 0;
          } 
//      Print whether or not compile successful
        if(success == 0) 
        {
          System.out.println("Compiled Successfully");
          studentprogramtester.App.runCon.studentButtonArray[studentArrayNumber].setBackground(Color.green);  // need to fix for student
            studentprogramtester.App.runCon.studentButtonArray[studentArrayNumber].repaint();
            studentprogramtester.App.runCon.updateLabels(studentprogramtester.App.data);
        }
        else
        {
          System.out.println("BatchTester.java (line 106) test for compile FAIL  Compile Exception, \nsuccess = " + success);
          studentprogramtester.App.runCon.studentButtonArray[studentArrayNumber].setBackground(Color.red);
           studentprogramtester.App.runCon.studentButtonArray[studentArrayNumber].repaint();
           studentprogramtester.App.runCon.updateLabels(studentprogramtester.App.data);
        }
      
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//      Run the test cases
//      TestRunner consructor:
//      public TestRunner(int numbr, String nme, String hndl, String pth, String clsPath, 
//      String srcPath, String stdPath, String tstDataPath, String argFileName, 
//      String tstInputFileName, String inputFileStub, String outFileName)
        TestRunner r = new TestRunner(dataObject);
        r.runJava();
        runNumber++;
        System.out.println();
      }
    } catch(IOException ioe)
    {
      System.out.println("main IOException");
    }
    
     studentprogramtester.App.data = dataObject;
    
    
  } // end constructor




}// end
