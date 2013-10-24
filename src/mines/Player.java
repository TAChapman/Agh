package mines;


import java.io.*;
import java.util.*  ;
import javax.swing.JPanel;

public class Player {
    private String playerName;
    private int gameLevel,lifePoints;

    private ArrayDeque <int[]> curGame = new ArrayDeque<int[]> () ;
    private String [] gameStats = new String[10] ;


    public Player(String pName, int gLevel)       {
        playerName = pName;
        gameLevel=gLevel;
        lifePoints= 10;
        pullFile();         //TODO :Recover the file from the disk based on the player name.gam

    }
//  read in player's data from the player.gam file
    private void pullFile()    {
       // try{

        int[] currentBoard = new int[256];

        curGame.push(currentBoard);
        currentBoard =  curGame.pop();
     //   }
      //  catch(FileNotFoundException e){      // create from a default file
        }

   // }
}
