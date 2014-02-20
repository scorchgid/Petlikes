/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.control;
import java.io.FileNotFoundException;
import java.io.IOException;
import uk.ac.kingston.ci5100.petlikes_pair4.view.ApplicationViewer;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.PetStoreInformation;
import uk.ac.kingston.ci5100.petlikes_pair4.view.ApplicationViewerUtill;
import uk.ac.kingston.ci5100.petlikes_pair4.view.CommandLineExport;

public class ApplicationControl {
    
    /**
     * Creates objects from other classes for use - imports data, 
     * sorts it and creates the viewer
     * @param args the command line arguments 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        PetStoreInformation psi = new PetStoreInformation();
        CommandLineExport cmd = new CommandLineExport();
        
        // Import CSV File
        psi.importCSV(); 
        // Sort the data in the way you want
        psi.sortstuff();

        //Create the viewer
        
        ApplicationViewer av = new ApplicationViewer(); 
        ApplicationViewerUtill avu = new ApplicationViewerUtill();
        avu.setMainView(av);

        //Print the data you want
        cmd.switchDemo();
    }
}