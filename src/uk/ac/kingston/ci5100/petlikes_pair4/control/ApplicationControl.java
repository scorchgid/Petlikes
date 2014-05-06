/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.control;
import java.io.FileNotFoundException;
import java.io.IOException;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPet;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPetStore;
import uk.ac.kingston.ci5100.petlikes_pair4.view.ApplicationFrame;
import uk.ac.kingston.ci5100.petlikes_pair4.view.CommandLineExport;

public class ApplicationControl {
    
    /**
     * Creates objects from other classes for use - imports data, 
     * sorts it and creates the viewer
     * @param args the command line arguments 
     */
    private static ApplicationFrame a;
    
    public static ApplicationFrame getA() {
        return a;
    }
    public static void setA(ApplicationFrame a) {
        ApplicationControl.a = a;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        // TODO code application logic here
        CombinedPetStore psi = new CombinedPetStore();
        CombinedPet pet = new CombinedPet();
        
        // Import CSV File
        psi.importCSV(); 
        pet.importCSV();
        
        // Sort the data in the way you want
        psi.sortstuff();
        pet.sortstuff();
        psi.petGrab();
        
        a = new ApplicationFrame();
        
        //Create the viewer
         
        
        //ApplicationText av = new ApplicationText(); 
        //ApplicationViewerControl avu = new ApplicationViewerControl();
        //avu.setMainView(av);
        
        //ApplicationTable tab = new ApplicationTable();
        //tab.JFrame();
        
        //Print the data you want
        CommandLineExport cmd = new CommandLineExport();
        cmd.switchDemo();
    }
}