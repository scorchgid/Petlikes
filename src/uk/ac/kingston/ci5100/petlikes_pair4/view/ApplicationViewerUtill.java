/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.view;

public class ApplicationViewerUtill 
{
       static ApplicationViewer mainView;

       
       /**
        * gets the mainView window
        * @return mainView static appviewer window
        */
    public static ApplicationViewer getMainView() {
        return mainView;
    }

      /**
        * setter for mainView
        * @param mainView main application viewer
        */
    public void setMainView(ApplicationViewer mainView) {
        ApplicationViewerUtill.mainView = mainView;
    }
}
