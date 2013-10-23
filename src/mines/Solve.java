package mines;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solve implements ActionListener {
    private JFrame Wimp = new JFrame("Whimp - To the stocks with ye  !!!")   ;
    public Solve() {
        Wimp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Wimp.setSize(350, 450);
        Wimp.setLocationRelativeTo(null);
        Wimp.setVisible(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Wimp.setVisible(true);
    }
}
