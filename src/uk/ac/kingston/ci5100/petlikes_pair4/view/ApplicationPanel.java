/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableColumn;

/**
 *
 * @author Scorchgid
 */
public class ApplicationPanel extends JPanel implements ActionListener {

    public ApplicationPanel(String[][] data, String[] colNames, String text)
    {  
       JTable table = new JTable(data, colNames);
       JScrollPane scrollPane = new JScrollPane(table);
       JTextArea textInput = new JTextArea();
       
       /*
       //For loop to widen columns 
       int colwidth = 0;
       for(colwidth = 0; table.getColumnCount() < colwidth; colwidth++);
       {   
       int q = table.getFontMetrics(getWidth());
       int w = table.getFontMetrics(getHeight());
       table.setSize(w, q);
       }*/
       this.add(new JTable(data, colNames));
       table.setPreferredScrollableViewportSize(new Dimension(450, 65));
       table.setFillsViewportHeight(true);
       this.add(new JTextArea(text));  
    }
    
    public ApplicationPanel(String[][] data, String[] colNames)
    {   
       JTable table = new JTable(data, colNames);
       //table.setPreferredScrollableViewportSize(new Dimension(450, 65));
       //table.setFillsViewportHeight(true);
       TableColumn column;
       JScrollPane scrollPane = new JScrollPane(table);
       scrollPane.setPreferredSize(new Dimension(900,800));
     
     //  column.setResizable(true);
       for (int i = 0; i<4; i++)
       {
           column = table.getColumnModel().getColumn(i);
           if (i == 2)
           {
               column.setPreferredWidth(400);     
           }
           else
           {
               column.setPreferredWidth(50);
           }
       }
       //this.add(new JTable(data, colNames));
        
       this.add(scrollPane);
    }   
    /*
//    public ApplicationPanel()
//    {
//        String[] colNames = {"Shop Name", "Address","Phone Number", "Website", "Operning Times"};
//        String[][] data = CombinedPetStore.getPetStoresAsArrayForTable1();
//        JTable table = new JTable(data, colNames);
//        
//        //table is made
//        //Create a textpadbit
//        //For loop
//       this.add(new JTable(data, colNames));
//       
//       //
//      
//       String summary = "this is an item of text";
//       JTextArea text = new JTextArea(summary);
//       
//       this.add(new JTextArea(summary));  
//    }
    
    public static void main (String[] args)
    {
        String[] columnNames = {"FirstName", "LastName", "Fuckall"};
        String[][] data =
        {
            {"Kenny", "South", "Well fuck you too"},
            {"Kyle", "Park",     "OH COME ON!"},
            {"Cartman", "Park", "OH COME ON!"},
        };
        
        String summary = "This is the summary";
        ApplicationPanel man = new ApplicationPanel(columnNames, data, summary);
        JFrame window = new JFrame("Title");
        window.add(man);
        window.setVisible(true);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
