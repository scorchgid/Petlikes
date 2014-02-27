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
    
    public void importCSV() throws FileNotFoundException, IOException
    {
        FileImport ing = new FileImport();
        petList = ing.FileReadPet();
    }
}
