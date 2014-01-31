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
 */
public class FileUtill 
{   
    void FileRead ()throws FileNotFoundException, IOException
    {
            BufferedReader row = new BufferedReader(new FileReader("petStoreDinosaur.csv"));
            
            while(row <  ++)
            {
                ArrayList<String> a = new ArrayList<String>;
                a.add(row.readLine() String );
                
                        
                
            }        
    }
    
    
}
