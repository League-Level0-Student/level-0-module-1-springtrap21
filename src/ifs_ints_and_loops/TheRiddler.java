package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
        String grinch=JOptionPane.showInputDialog(null, "What word begins with E and ends with E but only has one letter? " );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
        if(grinch.equals("Envelope")) {
        	score++;
        	JOptionPane.showMessageDialog(null, "Correct");
        }

		// 5. Otherwise, say "wrong" and tell them the answer
        else {
        	JOptionPane.showMessageDialog(null," Wrong, The grinch will get you!");
        }


		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

