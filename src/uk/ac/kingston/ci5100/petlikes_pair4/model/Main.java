/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.kingston.ci5100.petlikes_pair4.model;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Charlotte
 */
public class Main {

    public String readCommands()
    {
        String nextLine;
        Scanner sc = new Scanner(System.in);
        nextLine = sc.nextLine();
        return nextLine;
    }
    
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        PetStoreInformation psi = new PetStoreInformation();
        psi.importCSV();
        psi.exportToTxt();
        //psi.print();
        psi.switchDemo();
        
    }
}

