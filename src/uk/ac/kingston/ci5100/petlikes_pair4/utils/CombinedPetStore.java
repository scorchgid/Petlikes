/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    public static String[][] obtainPetStoresAsArrayForTable1()
    {
        //storeList.size();
        String[][]td = new String[storeList.size()][];
        for(int x = 0; x < storeList.size(); x++)
        {
            String[] q = new String[6];
            q[0]= storeList.get(x).getShopName();
            q[1]= storeList.get(x).getRawAddress();
            q[2]= storeList.get(x).getPhoneNumbers();
            q[3]= storeList.get(x).getWebsite();
            q[4]= storeList.get(x).getOpenCloseTimes();
            q[5]= averageStoreCalculation(storeList.get(x)); // but one day this will be the average
            td[x] = q;
        }
        return td;
    }
    
    public static ArrayList<String> obtainPetStoreAsString()
    {
        //find the number you are on
       ArrayList<String> r = null;
       for (IndividualPetStore qw : CombinedPetStore.storeList)
       {
       r.add(qw.getIndividualPetStore());
       }
       return r;
    }
    
    /// Unpack it!!!!!!!!!!!!!!!!!!!!! AS you are going through your loop for tabs. You need to sepprate it out one by one
    
    
//    
//    public String[] getMainListAsArrayForText;
//    {
//        String[]te = new String[
//                storeList.get(index)
//                
//                
//                
//                ];
//    }
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
    
    public static String averageStoreCalculation(IndividualPetStore q)
    {   
            for (IndividualPetStore qw : CombinedPetStore.storeList)
            {         
                if(q.equals(qw))
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
                
                String result = String.format("£"+"%.2f",averagePrice);
                
                return result;
                }
            }
            return null;
    }  
    public static String[] retrievePetStoreNameAsArray()
    {
        int x = 0;
        int i = 0;
        for (IndividualPetStore demo : CombinedPetStore.storeList) 
        {
            x++;
        }
        String[] list = new String[x];
        for (IndividualPetStore demow : CombinedPetStore.storeList)
        {
            list[i] = demow.getShopName(); 
            i++;
        }
        return list;
    }
/*
        public String[] averageStoreCalculation()
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
                String result = roundAverageStoreCalculationAsString(averagePrice);
            }            
    }  
  */  
}