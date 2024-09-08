package br.com.jtigik.java__fx;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C05MainJPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Creating all the components
        JButton btn1 = new JButton("Click Me");
        JButton btn2 = new JButton("Calculate Average");

        JButton btn3 = new JButton("Another Button");
        JButton btn4 = new JButton("One more Button");

        // 2. Creating the panel(s) and adding the components
        JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel();

        pnl1.add(btn1);
        pnl1.add(btn2);

        pnl2.add(btn3);
        pnl2.add(btn4);

        // 3. Adding the panel to the frame if it's only one panel
        // frame.getContentPane().add(pnl2);!!!
        // But we have two
        // Creating one main panel to contain all the other panels
        JPanel mainPanel = new JPanel();

        // Adding the two panels to the mainPanel
        mainPanel.add(pnl1);
        mainPanel.add(pnl2);

        frame.getContentPane().add(mainPanel);
        /*
         * Adding more User Interface Components
         * In the next class file... :-)
         */
    } // main()
}
