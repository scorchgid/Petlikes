/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class PetStoreInformation 
{           
    public static ArrayList<IndividualPetStore> mainList;

    /**
     * get the main list of individual pet stores as ArrayList
     * @return mainList as an ArrayList
     */
    public static ArrayList<IndividualPetStore> getMainList() {
        return mainList;
    }

    /**
     * 
     * @param mainList 
     */
    public static void setMainList(ArrayList<IndividualPetStore> mainList) {
        PetStoreInformation.mainList = mainList;
    }
    
    public void importCSV () throws FileNotFoundException, IOException
    {
        FileImport ing = new FileImport();
        mainList = ing.FileRead();
    }
    
    public void sortstuff()
    {
        Collections.sort(mainList);
    }
}