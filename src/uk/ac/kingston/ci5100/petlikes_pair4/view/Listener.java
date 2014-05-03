/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Scorchgid
 */
public class Listener implements ActionListener 
{
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== closeButton)
        {
            JOptionPane.showMessageDialog(ApplicationPanel,this,"hello");
        }
    }
}
