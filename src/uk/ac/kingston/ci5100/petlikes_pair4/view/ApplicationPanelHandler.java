/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTabbedPane;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPetStore;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPetStore;

/**
 *
 * @author Scorchgid
 */
public class ApplicationPanelHandler implements ActionListener
{
 
    @Override public void actionPerformed(ActionEvent ae)
    {
              if (ae.getActionCommand().equals("Close"))
              {
                  System.exit(0);
              }
              else if (ae.getActionCommand().equals("Search"))
              {   
                   for(IndividualPetStore demo : CombinedPetStore.storeList)
                   System.out.println(demo.getIndividualPetStore());
              }
              else if (ae.getActionCommand().equals("Go"))
              {
                  System.out.println("Okay Go is pressed");
                  ApplicationPanel.
                  ApplicationPanel buttona = new ApplicationPanel(CombinedPetStore.retrievePetStoreNameAsArray());
                  xe.add("Go", buttona);
                          
              }
    }
    
    @Override public void actionPerformed(ActionEvent ae, String x)
    {
              if(ae.getActionCommand().equals("combo"))
              {
                  // How can you do actions on a combo box?
                  System.out.println(x);
              }    
// return a search method in a new tab
    }        
// we can have if….else if statements or switch statements for handling many possible ActionCommands
}



            

