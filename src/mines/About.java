package mines;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About implements ActionListener {
    private JFrame About = new JFrame("The Pirates Cove") ;
    private JPanel A1 = new JPanel()  ;
    private JLabel Dev1, Dev2, Dev3;
    public About(){
 //       About.add(A1)  ;
 //       Dev1.setText("Developed by:");
  //      Dev2.setText("Patricia Chapman");
//        Dev1.setText("Neil Rieck");
 //       A1.add(Dev1)  ;
   //     A1.add(Dev2)  ;
     //   A1.add(Dev3)  ;
        About.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        About.setSize(350, 450);
        About.setLocationRelativeTo(null);

        About.setVisible(false);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        About.setVisible(true);
    }
}
