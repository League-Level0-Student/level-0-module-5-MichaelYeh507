import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class practiceTest {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setPenWidth(10);
		rob.setSpeed(10);
		//colors
		String color = JOptionPane.showInputDialog("What color would you like? Green, Yellow or Blue?");
		if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		} else if (color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		} else if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else {
			rob.setRandomPenColor();
		}
		
		//numOfShapes
		String shapes = JOptionPane.showInputDialog("How many shapes would you like to draw?");
		int numOfShapes = Integer.parseInt(shapes);
		
		for (int i = 0; i < numOfShapes; i++) {	
			for (int j = 0; j < 4; j++) {
				rob.penDown();
				rob.move(50);
				rob.turn(90);
				rob.penUp();
			}
			rob.move(100);
		}
	}
	
}
