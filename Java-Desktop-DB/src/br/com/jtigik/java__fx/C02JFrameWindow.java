package br.com.jtigik.java__fx;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C02JFrameWindow {

    public static void main(String[] args) {
        /*
         * Creating a basic empty window using Jframe
         */
        JFrame frame = new JFrame();
        /*
         * Set the window size for the frame
         * use .setSize() that accepts the width and height
         * 
         * NOTE:
         * without setting the size, window can either be maximized or nothing
         */
        frame.setSize(500, 400);

        /*
         * .setVisible() method => Displays the frame window
         * Notice that window style will be based on your operating system:
         * Windows or Mac
         * with the default buttons:
         * - Minimize
         * - Maximize
         * - Close
         */
        frame.setVisible(true);

        /*
         * Closing the window will just close the JFrame, will not stop the application!
         * Closing the window will just hide the JFrame!
         * 
         * We need to override the default behaviour of the close button
         * to exit/stop the application
         * 
         * using .setDefaultCloseOperation() method of the JFrame class
         * Passing the parameter "EXIT_ON_CLOSE" operation:
         * - It is a constant member of the JFrame class
         * - It exits the program when the window gets closed
         * 
         * Notice that the default value is "HIDE_ON_CLOSE"
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * The window can be resized by default (Try it through the mouse)
         * To disable this feature
         * this option will disable the maximize window
         * .setResizable() method with the value of false
         */
        // frame.setResizable(false);

        // ************************************
        /*
         * Adding components to the window
         */
        // Push Button
        /*
         * The Swing JButton class creates a push-button component
         * - Passing the text (value/label) for the button
         */
        // 1. Creating the button(s)
        JButton btn1 = new JButton("Click Me");
        JButton btn2 = new JButton("Calculate Average");

        // 2. Adding to the frame:
        /*
         * Accessing the content inside this "Frame"
         * using .getContentPane() method chaining with .add() method
         * Passing to .add() method the component(s) that we have created
         */
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);

        /*
         * Issue:
         * Each component will take the entire window
         * and will be above the previous component(s) by default
         * To avoid this behaviour, we need to use Panes
         * 
         * Solution:
         * The logical steps:
         * - Creating a Frame: JFrame
         * - Creating Panel (which is a portion of the JFrame window)
         * - Adding components (contents) inside this panel
         * - Finally adding the panel(s) to the frame
         * - Using Panels. Panel is a subsection of a window to layout our content
         * in a more organized way
         * Adding components to panels ==> Adding panels to frames
         * 
         * in the next class file... :-)
         */
    }

}
