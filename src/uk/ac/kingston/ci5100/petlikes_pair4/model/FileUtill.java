/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Scorchgid
 * x = 5 = y = 1
 */
public class FileUtill //change tofile reader class
{   
    ArrayList<String> FileRead ()throws FileNotFoundException, IOException
    {
            ArrayList<String> pass = new ArrayList<String>();
            BufferedReader row = new BufferedReader(new FileReader("petStoreRawDinosaur.csv"));
            boolean i = false;
            i = row.ready();
            System.out.println(i);
            String rawDataLine;
            row.readLine();
            while((rawDataLine = row.readLine()) != null)
            {
                //System.out.println(rawDataLine);
                pass.add(rawDataLine);
            }    
            return pass;
    }
    
    
}
