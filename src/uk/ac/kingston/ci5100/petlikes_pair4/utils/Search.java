/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.utils;

/**
 *
 * @author Scorchgid
 */
public class Search {

    public String[] searchAction(String shopIWant, String petIWant)
    {
        int x=1;
        int i=1;
        for(IndividualPet pet : CombinedPet.petList) 
        {
            if (pet.getShop().equals(shopIWant) & pet.getType().toLowerCase().contains(petIWant))
            {
                x++;
            }
            else{}
        }
        String[] result = new String[x];
        for(IndividualPet pet : CombinedPet.petList) 
        {
            if (pet.getShop().equals(shopIWant) & pet.getType().toLowerCase().contains(petIWant))
            {
                result[i] = pet.toPet();
            }
            else{}
        }
        return result;
    }
}