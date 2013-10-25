package mines;

import com.sun.tools.javac.comp.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class About implements ActionListener {           //Displays the about window when About/Info menu item   selected
    private JFrame About = new JFrame("About The Pirates Cove") ;
    private JPanel APA= new JPanel();
    private JLabel imgLabel = new JLabel(new ImageIcon("Archive/about.png"));

    public About() {
        About.add(APA)  ;
         APA.setLayout(new GridLayout(1, 1));
        About.setSize(350, 310);

        About.add(imgLabel);
        About.setLocationRelativeTo(null);
      //  About.setVisible(false);





    }
    @Override
    public void actionPerformed(ActionEvent e) {
        About.setVisible(true);
    }
}
