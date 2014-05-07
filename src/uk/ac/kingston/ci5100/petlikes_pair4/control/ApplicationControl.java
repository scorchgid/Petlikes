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
    private static ApplicationFrame frame;
    private static CombinedPet pet;
    private static CombinedPetStore psi;
    public static CombinedPet getPet() {
        return pet;
    }
    public static CombinedPetStore getPsi() {
        return psi;
    }
    public static ApplicationFrame getFrame() {
        return frame;
    }
    public static void setFrame(ApplicationFrame a) {
        ApplicationControl.frame = a;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        // TODO code application logic here
        psi = new CombinedPetStore();
        pet = new CombinedPet();
        
        // Import CSV File
        psi.importCSV(); 
        pet.importCSV();
        
        // Sort the data in the way you want
        psi.sortstuff();
        pet.sortstuff();
        psi.petGrab();
        
        //Create the viewer
        frame = new ApplicationFrame();
         
        //Run commandline tester
        CommandLineExport cmd = new CommandLineExport(); cmd.switchDemo();
    }
}