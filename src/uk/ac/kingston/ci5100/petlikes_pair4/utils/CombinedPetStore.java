/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class CombinedPetStore 
{           
    public static ArrayList<IndividualPetStore> storeList;

    /**
     * get the main list of individual pet stores as ArrayList
     * @return storeList as an ArrayList
     */
    public static ArrayList<IndividualPetStore> getMainList() {
        return storeList;
    }

    /**
     * 
     * @param storeList 
     */
    public static void setStoreList(ArrayList<IndividualPetStore> mainList) {
        CombinedPetStore.storeList = mainList;
    }
    
    public void importCSV () throws FileNotFoundException, IOException
    {
        FileImport ing = new FileImport();
        storeList = ing.FileReadPetStore();
    }
    
    public void sortstuff()
    {
        Collections.sort(storeList);
    }
    
    public void petGrab()
    {
        int index = 0;
        
        for(IndividualPet demo: CombinedPet.petList)
        {
            
            // Trying to compare
            index++;
            i = storeList.get(index);
            if(demo.shop == ;
        }
    }
}