/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Scorchgid
 */
public class ApplicationPanel extends JPanel {

    public static JButton closeButton()
    {
       ApplicationPanelHandler apb = new ApplicationPanelHandler(); 
       JButton closeButton = new JButton("Close");
       closeButton.setActionCommand("Close");
       closeButton.addActionListener(apb);
       return closeButton;
    }
    
    private static JComboBox storeComboList;
    private static JTextField searchParameter;
    
    public static String getSearchParameter() {
        return searchParameter.getText();
    }

    public static void setSearchParameter(JTextField notice) {
        ApplicationPanel.searchParameter = searchParameter;
    }
    public static String getStoreComboList() {
        return (String)storeComboList.getSelectedItem();
    }
    
    public static void setStoreComboList(JComboBox storeComboList) {
        storeComboList = storeComboList;
    }
    
    //Application Panel Just Table
    public ApplicationPanel(String[][] data, String[] colNames)
    {  
//     this.setLayout(new GridLayout(0,1,0,2));
       GridLayout grid = new GridLayout(0,1,0,2);
       grid.setVgap(6);
       this.setLayout(grid);
       
       JTable table = new JTable(data, colNames);
       JScrollPane scrollPane = new JScrollPane(table);
       table.setFillsViewportHeight(true);
       scrollPane.setPreferredSize(new Dimension(900,800));
       this.add(scrollPane);
       this.add(closeButton());
       
       //table.setPreferredScrollableViewportSize(new Dimension(450, 65));
       //table.setFillsViewportHeight(true);
       //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       //scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_S‌​CROLLBAR_ALWAYS);
       // ApplicationFrame.getFrames().getContentPane().add( new JScrollPane( table ), BorderLayout.CENTER );
       // column.setResizable(true);
       //TableColumn column = new TableColumn(table.getColumnModel().getColumnCount());
    }
    
    //Application Panel Button Menu
    public ApplicationPanel (String[] listItems)
    {
        this.setLayout(new GridLayout(3,2));
        ApplicationPanelHandler aph = new ApplicationPanelHandler();
        
        JButton searchButton = new JButton("Search");
        JLabel searchQuestion = new JLabel(
                "Please select from the list the shop you wish to search from:");

        JLabel notice = new JLabel(
                "Please enter the type of pet you are searching for:");
        searchParameter = new JTextField();

        storeComboList = new JComboBox(listItems);
        storeComboList.setSelectedIndex(0);
        this.add(searchQuestion);
        this.add(storeComboList);
        
        searchParameter.setPreferredSize(new Dimension(300,25));
        searchButton.setActionCommand("Search");
        
        this.add(notice);
        this.add(searchParameter);
/*        
        Object comboSelectedItemAsObject=  storeComboList.getSelectedItem();
        String comboSelectedItem = String.valueOf(comboSelectedItemAsObject);
        System.out.println(comboSelectedItem);
 */
        //Listen to text, submit on text entered.
        searchButton.addActionListener(aph);
        
        //closeButton.addActionListener(new ActionListener); see above!!
        add(closeButton());   
        add(searchButton);
    }

    //Search results in a JList
    public ApplicationPanel(ArrayList<String> items)
    {JList label = new JList(items.toArray());this.add(label);}
    
    /*
     * 
     *     //ApplicationPanel Table with Text Box
    
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
       }
       this.add(new JTable(data, colNames));
       table.setPreferredScrollableViewportSize(new Dimension(450, 65));
       table.setFillsViewportHeight(true);
       this.add(new JTextArea(text));  
    }
     * 
     * 
     * 
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
}
