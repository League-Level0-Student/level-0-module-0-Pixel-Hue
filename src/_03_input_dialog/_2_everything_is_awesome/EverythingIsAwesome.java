package _03_input_dialog._2_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	
	String A = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, A + " is awesome!");
}
}
