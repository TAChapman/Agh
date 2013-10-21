package mines;


import java.io.*;
import java.util.*  ;
import javax.swing.JPanel;

public class Player extends JPanel{
    private String playerName;
    private int gameLevel;
    private String [] saveGame = new String[40]  ;
    private String [] gameStats = new String[10] ;
    public Player(String pName, int gLevel)       {
        playerName = pName;
        gameLevel=gLevel;
     //   PullFile();

    }
//  read in player's data from the player.gam file
    void PullFile() throws FileNotFoundException   {
       // try{


     //   }
      //  catch(FileNotFoundException e){      // create from a default file
        }

   // }
}
