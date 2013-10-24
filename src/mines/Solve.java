package mines;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Solve implements ActionListener {
    private JFrame Wimp = new JFrame("Whimp - To the stocks with ye  !!!")   ;
    private JPanel WPa = new JPanel();
    private JLabel imgLabel = new JLabel(new ImageIcon("Archive/j17.png"));


    public Solve() {
       Wimp.add(WPa)  ;
        Wimp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // kick the wimp out with no saves...
        Wimp.setSize(300, 168);

        Wimp.add(imgLabel);
        Wimp.setLocationRelativeTo(null);
        Wimp.setVisible(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Wimp.setVisible(true);
    }
}


