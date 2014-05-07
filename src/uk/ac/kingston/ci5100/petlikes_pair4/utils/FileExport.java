/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import uk.ac.kingston.ci5100.petlikes_pair4.view.CommandLineExport;
/**
 *
 * @author Scorchgid
 */
public class FileExport {
    
    public void writeToFilePet(String shop, String type, String price, String date, String notes) throws IOException
    {
        try
        {
            String del = (",");
            BufferedWriter writer = new BufferedWriter(new FileWriter("petshop-pets.csv",true));
            writer.newLine();
            writer.append (shop + del + type + del + price + del + date + del + notes);
            writer.flush();
            writer.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}