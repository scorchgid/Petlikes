/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.kingston.ci5100.petlikes_pair4.model;
import sun.swing.PrintColorUIResource;
import uk.ac.kingston.ci5100.petlikes_pair4.model.PetStoreInformation;
/**
 *
 * @author Charlotte
 */
public class Test {
    
public static String decodeThisString = "Petsmart,178-180 London Rd: Guildford: Surrey: GU1 1: UK,(0122) 828-2181,www.petsmart.co.uk/londonroad,9am-5pm";
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
         System.out.println("test\n");
        // TODO code application logic here       
        PetStoreInformation psi = new PetStoreInformation();
        
        String[] b = psi.splitRawTest(decodeThisString);
        psi.giveStringToAt(b);
        Object e = psi.getWebsite();
        System.out.println(e);
        
        //PetStoreInformation.rawTest(decodeThisString);
        
        //PetStoreInformation ps = new PetStoreInformation();
	// This method should be moved to the back end, only a methods from other backend classes of this project should be used here.
        //ps.setName("Jill's Pet Store");
        //ps.setAddress("3-5 Stadhampton Rd: Drayton St Leonard: Drayton Saint Leonard: Oxfordshire :OX10 7: UK");
        //ps.setWebsite("www.jills-pet-store.co.uk");
        // These methods
    }
}

