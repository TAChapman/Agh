package mines;


import java.io.*;
import java.util.*  ;
import javax.swing.JPanel;

public class Player extends JPanel{
    private String playerName;
    private int gameLevel,lifePoints;

    private ArrayList <String> saveGame = new ArrayList <String>() ;
    private String [] gameStats = new String[10] ;
    public Player(String pName, int gLevel)       {
        playerName = pName;
        gameLevel=gLevel;
        lifePoints= 10;
        PullFile();         //TODO :Recover the file from the disk based on the player name.gam

    }
//  read in player's data from the player.gam file
    void PullFile()    {
       // try{


     //   }
      //  catch(FileNotFoundException e){      // create from a default file
        }

   // }
}
