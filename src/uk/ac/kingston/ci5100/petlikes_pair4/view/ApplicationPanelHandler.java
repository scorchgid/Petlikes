/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uk.ac.kingston.ci5100.petlikes_pair4.control.ApplicationControl;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPet;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPet;
/**
 *
 * @author Scorchgid
 */
public class ApplicationPanelHandler implements ActionListener
{   
    @Override public void actionPerformed(ActionEvent ae)
    {
        String caseWord = ae.getActionCommand();        
        switch (caseWord)
        {
            case "Close": 
                System.exit(0);
                break;
            case "Search":
                String comboSelectedItem = ApplicationPanel.getStoreComboList();
                String searchPam = ApplicationPanel.getSearchParameter();
                int x=0;
                ArrayList<String> resultslist = new ArrayList<String>();
                for(IndividualPet pet : CombinedPet.petList)
                {        
                    if (pet.getShop().equals(comboSelectedItem) && pet.getType().toLowerCase().contains(searchPam.toLowerCase()))
                    {
                        resultslist.add(pet.getType());
                        x++;
                    }
                    else {}
                }
                String res = " results";
                if (x==0)
                {
                    JOptionPane.showMessageDialog(ApplicationControl.getA(), "("+ x + res +"\n Apologies, I was unable to find any matches to your search criteria \n" + "You Searched: " + searchPam + "\nWithin: "+ comboSelectedItem,"Search error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                if (x==1) {res = " result";}
                JOptionPane.showMessageDialog(ApplicationControl.getA(), "Search complete we found \n"+ x + res,"Search error",JOptionPane.INFORMATION_MESSAGE);
                ApplicationPanel yo = new ApplicationPanel(resultslist);
                
                //Create a new version so that it prints a text list of results.
                ApplicationControl.getA().getTabs().add("Search Results",yo);
                ApplicationControl.getA().getTabs().setSelectedComponent(yo);
                }    
            case "SearchCommand":
                CommandLineExport.searchButton();
            case "try":
        }                  
    }
// return a search method in a new tab
}        
// we can have if….else if statements or switch statements for handling many possible ActionCommand}



            

