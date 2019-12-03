package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
			//skills.skill1();
			//skills.skill2();
			//skills.skill3();
			//skills.skill4();
			//skills.skill5();
	}
	
	void skill1() {
		//money
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int money = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "You have " + money*10 + " cents.");
		
		//height
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int inches = Integer.parseInt(height) ;
		if (inches<36) {
			JOptionPane.showMessageDialog(null, "Eat ur Wheaties!");
		} else {
			JOptionPane.showMessageDialog(null, "Good job!");
		}
	}
	
	void skill2() {
		for (int i = 1; i < 31; i++) {
			if (i % 3 ==0) {
				System.out.println(i);
			}
		}
	}
	
	void skill3() {
		Random rand = new Random();
		int num = rand.nextInt(21) - rand.nextInt(11);
		JOptionPane.showMessageDialog(null, "The difference between the two random numbers are " + num);
	}
	
	void skill4() {
		//city suggestion
		String city = JOptionPane.showInputDialog("What city do you live in?");
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
		}else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego");
		}
		
		//car in family
		String cars = JOptionPane.showInputDialog("How many cars does your family have?");
		int numCars = Integer.parseInt(cars);
		if (numCars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transports.");
		} else if (numCars == 1) {
			JOptionPane.showMessageDialog(null, "You have a nice car");
		} else {
			JOptionPane.showMessageDialog(null, "You must have lots of people in your family");
		}
		
	}
	
	void skill5() {
		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
	}
}
