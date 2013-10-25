package mines;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mines extends JFrame {

    //   Window Dimensions pixels
    private final int WIDTH = 1260;                     //1260
    private final int HEIGHT = 660;
    //   Status and Menu setup
    private JLabel statusbar;
    private JMenuBar MinesMenu;      // The menu bar
    private JPanel Statistics;         // Statistics Panel
    private JPanel HOF;                //Hall of Fame Panel

    private JMenu gameMenu;          // Game menu    has Options Solve and Exit
    private JMenu moveMenu;          // Move menu    has Undo and Redo
    private JMenu aboutMenu;         // About menu   has info

    private JMenuItem optionsItem;   // Options item
    private JMenuItem pauseItem;     // Pause item
    private JMenuItem solveItem;     // Pause item
    private JMenuItem exitItem;      // Exit item
    private JMenuItem undoItem;      // Undo item
    private JMenuItem redoItem;      // Redo item
    private JMenuItem infoItem;      // Info item
    private JCheckBoxMenuItem easyLevel;
    private JCheckBoxMenuItem mediumLevel;
    private JCheckBoxMenuItem hardLevel;
     private JCheckBoxMenuItem gameLevelMenu;

    private JTextField statsText;    // To hold player stats

    // set up a master container to display Game, Options etc... as Card layout
    private JPanel ControlP = new JPanel();


    public Mines() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         // TODO: close game method
        buildMenuBar();                  // Menu Added
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Pirates Cove");



        statusbar = new JLabel("");
        add(statusbar, BorderLayout.CENTER);
        add(new Board(statusbar));

        Statistics = new JPanel();               //  Markup   adds the stats
        GTimer Gametimer = new GTimer();
        add(Gametimer,BorderLayout.WEST)   ;
        add(Statistics,BorderLayout.WEST) ;
        Statistics.setSize(200, 600);
        Statistics.setBackground(Color.BLUE);
        setResizable(false);
        setVisible(true);

       HOF = new JPanel();               //  Markup   adds the stats
       add(HOF,BorderLayout.EAST) ;
       HOF.setBackground(Color.BLUE);
       setResizable(false);
       setVisible(true);

    }



    public static void main(String[] args) {           //  Game wrapper
        new Mines();
    }

    private void buildMenuBar()
    {
        // Create the menu bar.
        MinesMenu = new JMenuBar();

        //infoItem
        buildGameMenu();
        buildMoveMenu();
        buildAboutMenu();

        // Stats panels

        //
        MinesMenu.add(gameMenu);
        MinesMenu.add(moveMenu);
        MinesMenu.add(aboutMenu);

        //
        setJMenuBar(MinesMenu);
    }

    private void buildGameMenu()
    {
        //
        optionsItem = new JMenuItem("Options");
        optionsItem.setMnemonic(KeyEvent.VK_O);
        optionsItem.addActionListener(new ExitListener());
        //
        pauseItem = new JMenuItem("Pause");
        pauseItem.setMnemonic(KeyEvent.VK_P);
        pauseItem.addActionListener(new ExitListener());
        //
        solveItem = new JMenuItem("Solve");
        solveItem.setMnemonic(KeyEvent.VK_S);
        solveItem.addActionListener(new Solve());
        //
        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.addActionListener(new ExitListener());

        //
        gameMenu = new JMenu("Game");
        gameMenu.setMnemonic(KeyEvent.VK_G);

        // Add the Exit menu item to the File menu.
        gameMenu.add(optionsItem);
        gameMenu.add(pauseItem);
        gameMenu.add(solveItem);
        gameMenu.add(exitItem);
    }
      private void buildGameLevelMenu()
      {
          easyLevel = new JCheckBoxMenuItem("Easy", true);
          easyLevel.setMnemonic(KeyEvent.VK_E);
          easyLevel.setSelected(false);
          easyLevel.addActionListener(new ExitListener());

          mediumLevel = new JCheckBoxMenuItem("Medium", true);
          mediumLevel.setMnemonic(KeyEvent.VK_M);
          mediumLevel.setSelected(false);
          mediumLevel.addActionListener(new ExitListener());

          hardLevel = new JCheckBoxMenuItem("Hard", true);
          hardLevel.setMnemonic(KeyEvent.VK_E);
          hardLevel.setSelected(false);
          hardLevel.addActionListener(new ExitListener());

          gameLevelMenu.add(easyLevel);
          gameLevelMenu.add(mediumLevel);
          gameLevelMenu.add(hardLevel);

      }
    private void buildMoveMenu()
    {
        //
        undoItem = new JMenuItem("Undo");
        undoItem.setMnemonic(KeyEvent.VK_U);
        undoItem.addActionListener(new ExitListener());
        //
        redoItem = new JMenuItem("Redo");
        redoItem.setMnemonic(KeyEvent.VK_R);
        redoItem.addActionListener(new ExitListener());
        //
        moveMenu = new JMenu("Move");
        moveMenu.setMnemonic(KeyEvent.VK_M);
        //
        moveMenu.add(undoItem);
        moveMenu.add(redoItem);

    }


    private void buildAboutMenu()  {

    infoItem = new JMenuItem("Info");
    infoItem.setMnemonic(KeyEvent.VK_I);
    infoItem.addActionListener(new About());
    //
    aboutMenu = new JMenu("About");
    aboutMenu.setMnemonic(KeyEvent.VK_A);

    //
    aboutMenu.add(infoItem);

    }

}
class ExitListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    { System.exit(0); }
}





