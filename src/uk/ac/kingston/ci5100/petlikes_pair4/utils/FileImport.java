/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileImport //change tofile reader class
{   
    public static String petFirstLine;
    //---Primary Methods---
   /**
     * Convert an array of Strings into one String
     * @param a target array of Strings
     * @return single String comprised of all the array elements separated by spaces
     */
    public static String[] splitRawTest(String input) {
        String[] a = input.split(",");
        return a;
    }

    public BufferedReader getShopRow() {
        return shopRow;
    }

    public BufferedReader getPetRow() {
        return petRow;
    }
    private BufferedReader shopRow;
    private BufferedReader petRow;
    public ArrayList<String> jay = new ArrayList<String>();
    
    /**
     * Reads the CSV file 
     * @param file to be read
     * @return the CSV file as an array of pet stores
     */
    ArrayList<IndividualPetStore> fileReadPetStore ()throws FileNotFoundException, IOException
    {
        ArrayList<IndividualPetStore> petStoreArray = new ArrayList<IndividualPetStore>();
        shopRow = new BufferedReader(new FileReader("petStoreRawDinosaur.csv"));

        String rawDataLine;
        shopRow.readLine();
        while((rawDataLine = shopRow.readLine()) != null)
        {   
           String[] list = splitRawTest(rawDataLine);
           IndividualPetStore n= new IndividualPetStore(list[0], list[1], list[2], list[3], list[4]);
           petStoreArray.add(n);
        }    
        return petStoreArray;
    }
    //--------------------------------------------------------------------------------------------------------------------------------------
    ArrayList<IndividualPet> fileReadPet ()throws FileNotFoundException, IOException, Exception
    {
        ArrayList<IndividualPet> petArray = new ArrayList<IndividualPet>();
        petRow = new BufferedReader(new FileReader("petshop-pets.csv"));
        String rawDataLine;
        petFirstLine = petRow.readLine();
        while((rawDataLine = petRow.readLine()) != null)
        {   
           String[] list = splitRawTest(rawDataLine);
           IndividualPet n= new IndividualPet(list[0], list[1], list[2], list[3], list[4]);
           petArray.add(n);
        }    
        return petArray;
    }
}