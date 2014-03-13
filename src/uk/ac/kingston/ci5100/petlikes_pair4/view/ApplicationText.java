/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ApplicationText extends JFrame
{
    /**
     * Create the main application window
     */
    private JTextArea textArea =  new JTextArea();
    
   /**
     * getter for main text area
     * @return dave as JTextArea
     */
    public JTextArea getDave() {
        return textArea;
    }
    /**
     * setter for main text area in our ApplicationText
     */
    public void setDave(JTextArea dave) {
        this.textArea = dave;
    }
    
    public ApplicationText()
    {
        JScrollPane scroll = new JScrollPane(textArea);
        this.setTitle("Petshop Data Viewer");
        this.setSize(500,500);
        
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setPreferredSize(new Dimension(300, 200));
        this.add(scroll);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}