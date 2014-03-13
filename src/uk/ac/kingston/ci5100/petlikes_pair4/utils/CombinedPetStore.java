/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import uk.ac.kingston.ci5100.petlikes_pair4.view.ApplicationViewerControl;
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
        for (IndividualPetStore store : CombinedPetStore.storeList)
        { //create a new tab with the name of the shop
            //creat a table
            for(IndividualPet pet: CombinedPet.petList)
            { //add this data to row
                if(pet.getShop().equals(store.getShopName()))
                {
                    store.getPets().add(pet);
                }
            }
        }
    }
    
    public void averageStoreCalculation()
    {
            for (IndividualPetStore qw : CombinedPetStore.storeList)
            {
                //an average price for each store
                double totalPrice = 0;
                double averagePrice = 0;
                int countPet = 0;

                for(IndividualPet petFor : qw.getPets())
                {
                    totalPrice = petFor.getPrice()+totalPrice;
                    countPet++;
                }
                averagePrice = totalPrice/countPet;
            }
    }
    public String rThatNum(double a)
    {
        String fore = String.format("%.2f",a);
        return fore;
    }
}