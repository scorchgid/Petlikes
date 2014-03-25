/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Scorchgid
 */
public class ApplicationTable extends JPanel 
{
    JTable table;
    
    //---- JTABLE ----//
    public void SwingTable()
    {
        String[] columnNames = {"FirstName", "LastName", "Fuckall"};
        String[][] data =
        {
            {"Kenny", "South", "Well fuck you too"},
            {"Kyle", "Park",     "OH COME ON!"},
            {"Cartman", "Park", "OH COME ON!"},
        };

        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(450, 630));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    //---- JFRAME ----//
    public void JFrame()
    {
        JFrame frame = new JFrame();
        ApplicationTable t = new ApplicationTable();
        t.SwingTable();
        frame.setTitle("Lets try");
        frame.setSize(500, 500);
        frame.setLocation(500, 500);
        frame.setVisible(true);
   //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOS);
        frame.add(t);
    }
}
