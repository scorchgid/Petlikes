/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Scorchgid
 */
public class FileExport {
    void notepad(ArrayList<String> list) throws FileNotFoundException
    {
        System.out.print(list.size());
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        {
            //out.println(list);
        }
    }
}