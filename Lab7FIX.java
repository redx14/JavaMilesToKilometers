

package lab7;

import lab7.Miles2KiloFIX;
import javax.swing.JFrame;

public class Lab7FIX {

    public static void main(String[] args) {
        	Miles2KiloFIX gui = new Miles2KiloFIX();
		gui.setTitle("Miles to Kilometers converter");
		gui.setSize(300,100);
		gui.setLocationRelativeTo(null); //center on screen
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		gui.setVisible(true); //show it
	}
    }
