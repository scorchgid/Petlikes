/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author k1258579, k1009705
 */
package uk.ac.kingston.ci5100.petlikes_pair4.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class PetStoreInformation 
{    
        
    public void importCSV () throws FileNotFoundException, IOException
    {
        FileUtill ing = new FileUtill();
        ArrayList<String> rawList = ing.FileRead();
        {
            for (int i = 0; i<rawList.size(); i++)
            {
                IndividualPetStore Store = new IndividualPetStore();
                String m = rawList.get(i);
                String[] list = splitRawTest(m);

                this.shopName = list[0];
                this.rawAddress = list[1];
                this.phoneNumbers = list[2];
                this.website = list[3];
                this.openCloseTime = list[4];

            }
        }
    }    
    //---Primary Methods---
    public String[] splitRawTest (String input)
    {
        String[] a = input.split(",");    
        return a;
    }
    public void giveStringToAt(String[] c)
    {
        setShopName(c[0]);
        setRawAddress(c[1]);
        setPhoneNumbers(c[2]);
        setWebsite(c[3]);
        setOpenCloseTime(c[4]);
    }
    /**
     * Convert an array of Strings into one String
     * @param a target array of Strings
     * @return single String comprised of all the array elements separated by spaces
     */
    
    
    //String[] addr = rawAddress.split(":");
    //(java.lang.String[]) [, a, b, c, d, e, f];    
    
    

}