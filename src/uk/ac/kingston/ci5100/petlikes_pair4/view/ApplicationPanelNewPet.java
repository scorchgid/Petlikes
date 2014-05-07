/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.util.Calendar;
import java.util.Date;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Scorchgid
 */
public class ApplicationPanelNewPet extends JPanel{
    
    private static JComboBox petStoreList;
    private static JTextField petType;
    private static JTextField petPrice;
    private static JTextField petNotes;
    private static JDatePickerImpl datePicker;
    public static boolean check;

    public static JTextField getPetType() {
        return petType;
    }

    public static JTextField getPetPrice() {
        return petPrice;
    }

    public static JTextField getPetNotes() {
        return petNotes;
    }

    public static void setCheck(boolean check) {
        ApplicationPanelNewPet.check = check;
    }

    public void setDatePicker(JDatePickerImpl datePicker) {
        this.datePicker = datePicker;
    }
    
    public static JDatePickerImpl getDatePicker() {
        return datePicker;
    }
    
    public static JComboBox getPetStoreList() {
        return petStoreList;
    }

    public static void setPetStoreList(JComboBox petStoreList) {
        ApplicationPanelNewPet.petStoreList = petStoreList;
    }

    public static String getPetTypeAsText() {
        return petType.getText();
    }

    public static String getPetPriceAsText() {
        return petPrice.getText();
    }

    public static String getPetNotesAsText() {
        return petNotes.getText();
    }

    public static String getStoreComboList() {
        return (String)petStoreList.getSelectedItem();
    }
    
 
    //New pet page
    public ApplicationPanelNewPet (String[] listItems)
    {
        petStoreList = new JComboBox(listItems);
        petStoreList.setSelectedIndex(0);
        petType = new JTextField();
        petPrice = new JTextField();
        petNotes = new JTextField();
        petNotes.setText("none");
           
        ApplicationPanelHandler apb = new ApplicationPanelHandler(); 
        JButton submit = new JButton("Submit");
        JLabel petStoreLabel = new JLabel("Please select the store where the pet is based: ");
        JLabel petTypeLabel = new JLabel("Please enter the type of pet: ");
        JLabel petPriceLabel = new JLabel("Please enter the price of the pet £: ");
        JLabel petDateLabel = new JLabel("Please select the date of arrival: ");
        JLabel petNotesLabel = new JLabel("Please enter any addtional notes about the pet: ");
        
        UtilCalendarModel model = new UtilCalendarModel();
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        datePicker = new JDatePickerImpl(datePanel, new ApplicationCalendarReformat());
        this.setLayout(new GridLayout(0,2));
        submit.setActionCommand("Submit");
        submit.addActionListener(apb);
        
        this.add(petStoreLabel);
        this.add(petStoreList);
        this.add(petTypeLabel);
        this.add(petType);
        this.add(petPriceLabel);
        this.add(petPrice);
        this.add(petDateLabel);
        this.add(datePicker);
        this.add(petNotesLabel);
        this.add(petNotes);
        this.add(ApplicationPanel.closeButton());
        this.add(submit);
        
        
    }
}
