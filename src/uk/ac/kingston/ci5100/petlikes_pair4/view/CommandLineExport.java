/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.io.FileNotFoundException;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPetStore;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.PetStoreInformation;
import java.util.Scanner;

public class CommandLineExport {

    /**
     * Reads the number input into the command line for use in switchDemo 
     * below.
     * @return int paul for caseNumber in switchDemo
     */
    public static int readCommandNumber() {
        String nextLine;
        Scanner sc = new Scanner(System.in);
        nextLine = sc.nextLine();
        int paul = Integer.parseInt(nextLine);
        return paul;
    }
    
    /**
     * A demo that attempts to take input from the command line through 
     * readCommandNumber over and displays the into requested and noted below 
     * either through the command line or in the ApplicationViewer window 
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
                for (IndividualPetStore demo : PetStoreInformation.mainList) {
                    System.out.println(demo.getShopName());
                }
                break;
            case 2: // Print The Raw Address
                for (IndividualPetStore demo : PetStoreInformation.mainList) {
                    System.out.println(demo.getRawAddress());
                }
                break;
            case 3: // Print all the petstore information
                for (IndividualPetStore demo : PetStoreInformation.mainList) {
                    System.out.println(demo.toString());
                }
                break;
            case 4: // Print all the information line by line
                for(IndividualPetStore demo : PetStoreInformation.mainList) {
                   System.out.println(demo.getIndividualPetStore());
                }
                break;
            case 5: // Print all the information line by line with a line sepprating
                for(IndividualPetStore demo : PetStoreInformation.mainList) {
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
                    ApplicationViewerUtill.mainView.getDave().setText("lessser");
                }
                break;
            case 8 : 
                for (IndividualPetStore demo : PetStoreInformation.mainList) {
                    String texts = demo.toString();
                    ApplicationViewerUtill.mainView.getDave().append(texts + "\n");
                    }
                break;
            case 9 : 
                for (IndividualPetStore demo : PetStoreInformation.mainList) 
                {
                    String line = "____________________________________________";
                    String texts = demo.getIndividualPetStore();
                    ApplicationViewerUtill.mainView.getDave().append(line + "\n" + texts + "\n");
                }
                break;
        }
    }
}