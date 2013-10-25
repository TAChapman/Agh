package mines;


import java.awt.*;
                   import java.awt.event.*;
                   import javax.swing.*;

                    class Options {

                       public Options(String[] args) {
                           final JFrame frame = new JFrame("Options");

                           // implement ItemListener interface
                           class MyItemListener implements ItemListener {

                               public void itemStateChanged(ItemEvent ev) {
                                   boolean selected = (ev.getStateChange() == ItemEvent.SELECTED);
                                   AbstractButton button = (AbstractButton) ev.getItemSelectable();
                                   String command = button.getActionCommand();


                               }
                           }

                           // creates radio buttons

                           JRadioButton easyOption = new JRadioButton("Easy");


                           JRadioButton mediumOption = new JRadioButton("Medium");


                           JRadioButton hardOption = new JRadioButton("Hard");





                           //add radio buttons to a ButtonGroup
                           final ButtonGroup group = new ButtonGroup();
                           group.add(easyOption);
                           group.add(mediumOption);
                           group.add(hardOption);


                           // Frame setting
                           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           frame.setSize(960, 650);
                           Container cont = frame.getContentPane();

                           cont.setLayout(new GridLayout(0, 1));
                           cont.add(new JLabel("Please Choose your Game Level:"));
                           cont.add(easyOption);
                           cont.add(mediumOption);
                           cont.add(hardOption);
                           cont.add(new JLabel("Please Enter your name:"));
                           cont.add(new JTextField ());
                           frame.setVisible(true);
                       }
                   }




