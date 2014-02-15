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
    public ArrayList<IndividualPetStore> mainList;
    
    public void importCSV () throws FileNotFoundException, IOException
    {
        FileImport ing = new FileImport();
        mainList = ing.FileRead();
    }
    
    public void print()
    {
        for(IndividualPetStore demo : mainList)
        {
            System.out.println(demo.getShopName());
        }
    }

    // A demo to try and attempt requested data through Command line
    public void switchDemo()
    { 
        //Main x = new Main();
        int caseNumber = Main.readCommandNumber();
        switch(caseNumber)
        {
           case 1:
               for(IndividualPetStore demo : mainList)
               {
                   System.out.println(demo.getShopName());   
               }
               break;
            case 2:
                for(IndividualPetStore demo : mainList)
                {
                    System.out.println(demo.getRawAddress());
                }
                break;
            }       
        }
    public void exportToTxt() throws FileNotFoundException
        {
            FileExport gui = new FileExport();
            //gui.notepad(mainList);
        }
}

