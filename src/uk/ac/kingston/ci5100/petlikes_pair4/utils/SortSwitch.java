/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.io.FileNotFoundException;

public class SortSwitch {
        public static int readCommandNumber() {
        String nextLine;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        nextLine = sc.nextLine();
        int paul = Integer.parseInt(nextLine);
        return paul;
    }
        
    /**
     * Demo to attempt posting requested data through command line - for later
     */
    public void switchDemo() throws FileNotFoundException 
    {
        int caseNumber = readCommandNumber();
        switch (caseNumber) 
        {
            case 0: //Do nothing
        }
    }
}