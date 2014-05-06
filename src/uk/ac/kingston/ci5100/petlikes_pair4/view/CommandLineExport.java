/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.io.FileNotFoundException;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPetStore;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPet;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPetStore;
import java.util.Scanner;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPet;

public class CommandLineExport {

    /**
     * Reads the number input into the command line for use in switchDemo 
     * below.
     * @return int Paul for caseNumber in switchDemo
     */
    public static int readCommandNumber() {
        String nextLine;
        Scanner sc = new Scanner(System.in);
        nextLine = sc.nextLine();
        int paul = Integer.parseInt(nextLine);
        return paul;
    }
    public static String readString() {
        String nextLine;
        Scanner sc = new Scanner(System.in);
        nextLine = sc.nextLine();
        return nextLine;
    }
    public static void searchButton()
    {
    String comboSelectedItem = ApplicationPanel.getStoreComboList();
                String searchPam = ApplicationPanel.getSearchParameter();
                System.out.println("you entered: " + searchPam +" @ " + comboSelectedItem);
                int x = 0;
                for(IndividualPet pet : CombinedPet.petList)
                {        
                    if (pet.getShop().equals(comboSelectedItem) && pet.getType().toLowerCase().contains(searchPam.toLowerCase()))
                    {
                        System.out.println("We have found "+pet.getType());
                        x++;
                    }
                    else
                    {
                        
                    }                
                }
                if (x==0)
                {
                    System.out.println("Nope Sorry we couldn't find any " + searchPam + " at " + comboSelectedItem);
                }
                else
                {}
    }
    
    /**
     * A demo that attempts to take input from the command line through 
     * readCommandNumber over and displays the into requested and noted below 
     * either through the command line or in the ApplicationText window 
     */
    public void switchDemo() throws FileNotFoundException 
    {
        int caseNumber = readCommandNumber();
        switch (caseNumber) 
        {
            case 0: //Do nothing
                System.out.println("Skipping Switch Demo");
                break;
            case 1: // Print the Shop Name
                for (IndividualPetStore demo : CombinedPetStore.storeList) {
                    System.out.println(demo.getShopName());
                }
                break;
            case 2: // Print The Raw Address
                for (IndividualPetStore demo : CombinedPetStore.storeList) {
                    System.out.println(demo.getRawAddress());
                }
                break;
            case 3: // Print all the petstore information
                for (IndividualPetStore demo : CombinedPetStore.storeList) {
                    System.out.println(demo.toString());
                }
                break;
            case 4: // Print all the information line by line
                for(IndividualPetStore demo : CombinedPetStore.storeList) {
                   System.out.println(demo.getIndividualPetStore());
                }
                break;
            case 5: // Print all the information line by line with a line sepprating
                for(IndividualPetStore demo : CombinedPetStore.storeList) {
                    System.out.println("____________________________________________");
                    System.out.println(demo.getIndividualPetStore());
                }
                break;
            case 6 : //Export to TXT
                {
                    FileExport gui = new FileExport();
                    gui.notepad(); 
                }
                break;
            case 7 : //printTextInSwingDemo
                {
                    ApplicationViewerControl.mainView.getDave().setText("lessser");
                }
                break;
            case 8 : 
                for (IndividualPetStore demo : CombinedPetStore.storeList) {
                    String texts = demo.toString();
                    ApplicationViewerControl.mainView.getDave().append(texts + "\n");
                    }
                break;
            case 9 : 
                for (IndividualPetStore demo : CombinedPetStore.storeList) 
                {
                    String line = "____________________________________________";
                    String texts = demo.getIndividualPetStore();
                    ApplicationViewerControl.mainView.getDave().append(line + "\n" + texts + "\n");
                }
                break;
            case 10 :
                for (IndividualPet demo : CombinedPet.petList)
                {
                    String text = demo.toString();
                    ApplicationViewerControl.mainView.getDave().append("\n " + text);
                }    
            case 11 : //Average Store Calculation
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
                   String fore = String.format("%.2f",totalPrice/countPet);
                   System.out.println("aveprice in pethsop "+ qw.getShopName() + "is" + " £" + fore);
               }
            case 12: //Display a listof pets
            {
                   for(IndividualPet demo : CombinedPet.petList) 
                   {
                   System.out.println(demo.getType());
                   }
            }
            case 13 : //Pet Search - will find any matching letters and print Yes, Searches all pets
            {
                System.out.println("Please enter a string to search");
                String parameter = readString();
                int x = 1;
                    for(IndividualPet pet : CombinedPet.petList) 
                    {
                        System.out.print(x+". "+pet.getType()+" ");
                        if (pet.getType().toLowerCase().contains(parameter))
                        {
                            System.out.println("yes");
                        }
                        else
                        {
                            System.out.println("no");
                        }
                        x++;
                    }
                System.out.println("Done");
            }
            case 14 : // pet search based on shop   
            {
                System.out.print("please enter the shop you wish to search for: ");
                String shopIWant = readString();
                System.out.print("Now please enter the pet you wish to search for that is within that shop: ");
                String petIWant  = readString();
                
                int x=1;
                    for(IndividualPet pet : CombinedPet.petList) 
                    {
                        System.out.print(x+". "+pet.getShop()+" Has "+pet.getType());
                        if (pet.getShop().equals(shopIWant) & pet.getType().toLowerCase().contains(petIWant))
                        {
                            System.out.println("  YES");
                        }
                        else
                        {
                            System.out.println("   no");
                        }
                        x++;
                    }        
                }
            case 15 : // 14 Refined that it only prints the matching values
            {
                System.out.print("Please enter the shop you wish to search for: ");
                String shopIWant = readString();
                System.out.print("Now please enter the pet you wish to search for that is within that shop: ");
                String petIWant  = readString();
                
                int x=1;
                    for(IndividualPet pet : CombinedPet.petList) 
                    {
                        
                        if (pet.getShop().equals(shopIWant) & pet.getType().toLowerCase().contains(petIWant))
                        {
                            System.out.println(x+". "+pet.getShop()+" does indeed have a "+pet.getType());
                        }
                        else
                        {}
                        x++;
                    }
            }
            case 16 : // 14 Refined that it only prints the matching values
            {
                
            }
            
        }
    }
}