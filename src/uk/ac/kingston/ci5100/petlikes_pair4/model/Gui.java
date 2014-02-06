/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Scorchgid
 */
public class Gui {
    void Gui() throws FileNotFoundException
    {
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        out.print(); //within these () you should place the array
        System.setOut(out);
    }
    
}