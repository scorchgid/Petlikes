/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Scorchgid
 */
public class CombinedPet {

    public static ArrayList<IndividualPet> petList;

    public static ArrayList<IndividualPet> getMainList() {
        return petList;
    }
    public static void setPetList(ArrayList<IndividualPet> mainList) {
        CombinedPet.petList = mainList;
    }    
    
    public void importCSV() throws FileNotFoundException, IOException, Exception
    {
        FileImport ing = new FileImport();
        petList = ing.FileReadPet();
    }
            public void sortstuff()
    {
        Collections.sort(petList);
        
    }
    public static String[][] getPetAsArrayForTable()
    {
        String[][]td = new String[petList.size()][];
        for(int x = 0; x < petList.size(); x++)
        {
            String[] q = new String[4];
            q[0]= petList.get(x).getType();
            q[1]= petList.get(x).getPriceString();
            q[2]= petList.get(x).getDateAcquired();
            q[3]= petList.get(x).getNotes();
            td[x] = q;
        }
        return td;
    }
}
