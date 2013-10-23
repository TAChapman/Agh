package mines;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solve implements ActionListener {
    private JFrame Wimp = new JFrame("Whimp - To the stocks with ye  !!!")   ;
    public Solve() {
        Wimp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // kick the wimp out with no saves...
        Wimp.setSize(300, 168);
        Wimp.setLocationRelativeTo(null);
        Wimp.setVisible(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Wimp.setVisible(true);
    }
}


