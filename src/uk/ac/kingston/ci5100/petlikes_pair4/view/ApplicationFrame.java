/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;
import java.awt.Dimension;
import java.awt.Panel;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTabbedPane;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.CombinedPetStore;
import uk.ac.kingston.ci5100.petlikes_pair4.utils.IndividualPetStore;
/**
 *
 * @author Scorchgid
 */
public class ApplicationFrame extends JFrame
{
   public ApplicationFrame()
   {
       JTabbedPane tabs = new JTabbedPane();
       
       //-------------add the first tab which will contain all the data on shops-------//
       ApplicationPanel shops = new ApplicationPanel(CombinedPetStore.obtainPetStoresAsArrayForTable1(),IndividualPetStore.getPetStoreHeader(),"ghh");
       tabs.add("Shops", shops);
       
       //--------------FOR LOOP--------------//
//       ApplicationPanel pets = new ApplicationPanel(CombinedPet.getPetAsArrayForTable(),;
       ApplicationPanel pets = new ApplicationPanel(CombinedPet.getPetAsArrayForTable(),IndividualPetStore.getPetStoreHeader(),); 
       
       // you need: 
       // String[][] Colummns and rows
       //String [] Column names
       // String stuff for text area aka summary
       //Combined pet store
       //for(IndividualPetStore i: CombinedPetStore.getMainList())
       //{
        //   tabs.addTab(i.getShopName(), new ApplicationPanel(i.getShopName()));
           //
       //}
           
       //{tabs.addTab(i.getShopName, new ApplicationPanel(textpane))}       
       this.setSize(new Dimension(800, 400));
       this.add(tabs); 
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setVisible(true);
   }
}
