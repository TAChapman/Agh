package mines;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Mines extends JFrame {
    //   Window Dimensions pixels
    private final int WIDTH = 960;         //was 250
    private final int HEIGHT = 660;        //was 290
    //   Status and Menu setup
    private JLabel   statusbar;
    private JMenuBar MinesMenu;      // The menu bar

    private JMenu gameMenu;          // Game menu    has Options and Exit
    private JMenu moveMenu;          // Move menu    has Undo and Redo
    private JMenu aboutMenu;         // About menu   has info

    private JMenuItem optionsItem;   // Options item
    private JMenuItem pauseItem;     // Pause item
    private JMenuItem exitItem;      // Exit item
    private JMenuItem undoItem;      // Undo item
    private JMenuItem redoItem;      // Redo item
    private JMenuItem infoItem;      // Info item
    public Mines() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);         // TODO: close game method
        buildMenuBar();                  // Menu Added
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Find The Pirates");

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.NORTH);


        add(new Board(statusbar));

        setResizable(false);
        setVisible(true);



    }
    
    public static void main(String[] args) {
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
        optionsItem = new JMenuItem("Pause");
        optionsItem.setMnemonic(KeyEvent.VK_P);
        optionsItem.addActionListener(new ExitListener());
        //
        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.addActionListener(new ExitListener());

        //
        gameMenu = new JMenu("Game");
        gameMenu.setMnemonic(KeyEvent.VK_G);

        // Add the Exit menu item to the File menu.
        gameMenu.add(optionsItem);
    //    gameMenu.add(pauseItem);
        gameMenu.add(exitItem);
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
    infoItem.addActionListener(new ExitListener());
    //
    aboutMenu = new JMenu("About");
    aboutMenu.setMnemonic(KeyEvent.VK_A);

    //
    aboutMenu.add(infoItem);

    }


    private class ExitListener implements ActionListener
    {
        /**
         actionPerformed method
         @param e An ActionEvent object.
         */

        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }


}

