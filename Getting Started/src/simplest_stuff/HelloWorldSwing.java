package simplest_stuff;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
/**
 * Using the Java API's Swing library to pop open a GUI dialog with a message in it.
 * @author Foo Barstein
 * @version 0.1
 */ 

public class HelloWorldSwing {

	public static void main(String[] args) {
        // create a contaner within which we place dialogs
        JFrame frame = new JFrame("Hello world!"); 

        // ask the user for a number
        String response = JOptionPane.showInputDialog(frame, "Please enter your favorite number",  "Hello world!", JOptionPane.OK_CANCEL_OPTION);

        // output a response
        JOptionPane.showMessageDialog(frame, "Thanks for entering that " +  response, "Hello world!", JOptionPane.INFORMATION_MESSAGE);

        // force exit
        System.exit(0);
	}

}