package _01_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_Or_Not {
	public static void main(String[] args) {
		String primeOrNot =  JOptionPane.showInputDialog("Give me a number.");
		int num = Integer.parseInt(primeOrNot);
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, "Its a prime!");
			} else if (num % i >=1) {
				JOptionPane.showMessageDialog(null, "Its not a prime!");
				System.exit(0);
			}
		}
		
	}
}
