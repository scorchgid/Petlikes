/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPetStore;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPetStore;


/**
 * export the list to text, just pet store names at the moment
 */
public class FileExport {
     
    void notepad() throws FileNotFoundException
    {
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        {
            for(IndividualPetStore demo : CombinedPetStore.storeList)
               {
                   out.println(demo .getShopName());   
               }
        }
    }
}