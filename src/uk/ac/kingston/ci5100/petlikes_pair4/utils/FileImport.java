/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.utils;
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
public class FileImport //change tofile reader class
{   
    //---Primary Methods---
    public static String[] splitRawTest(String input) {
        String[] a = input.split(",");
        return a;
    }
    
    /**
     * Convert an array of Strings into one String
     * @param a target array of Strings
     * @return single String comprised of all the array elements separated by spaces
     */
    //String[] addr = rawAddress.split(":");
    //(java.lang.String[]) [, a, b, c, d, e, f];
    public ArrayList<String> jay = new ArrayList<String>();
    
    ArrayList<IndividualPetStore> FileRead ()throws FileNotFoundException, IOException
    {
            ArrayList<IndividualPetStore> petStoreArray = new ArrayList<IndividualPetStore>();
            BufferedReader row = new BufferedReader(new FileReader("petStoreRawDinosaur.csv"));
            boolean i = false;
            i = row.ready();
            System.out.println(i);
            String rawDataLine;
            row.readLine();
            while((rawDataLine = row.readLine()) != null)
            {   
               String[] list = splitRawTest(rawDataLine);
               IndividualPetStore n= new IndividualPetStore(list[0], list[1], list[2], list[3], list[4]);
               petStoreArray.add(n);
              // System.out.println(n.toString());
               //jay.add(n.toString());
               //System.out.println(jay.size());
//               System.out.println(n.getShopName());
//               System.out.println(n.getRawAddress());
//               System.out.println(n.getPhoneNumbers());
//               System.out.println(n.getWebsite());
//               System.out.println(n.getOpenCloseTimes());
//               System.out.println();q
            }    
            return petStoreArray;
            
    }
}