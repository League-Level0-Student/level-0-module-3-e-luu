
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String mom = "February 12th";
		String dad = "July 15th";
		String mine = "February 2nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String b = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		if(b.equals("mom")) {
			JOptionPane.showMessageDialog(null, "February 12th");
		}
		if(b.equals("dad")) {
			JOptionPane.showMessageDialog(null, "July 15th");
		}
		if(b.equals("mine")) {
			JOptionPane.showMessageDialog(null, "February 2nd");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday

	} 
}
