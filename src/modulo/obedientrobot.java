package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	public static void main(String[] args) {
		Robot robot = new Robot();
		String color = JOptionPane.showInputDialog("what color do you want? red, yellow or blue?");
		if (color.equals("red")) {
			robot.setPenColor(Color.RED);
		}else if(color.equals("blue")) {
			robot.setPenColor(Color.BLUE);
		}else if(color.equals("yellow")) {
			robot.setPenColor(Color.YELLOW);
		}
		String shape = JOptionPane.showInputDialog("do you want the robot to draw a circle, square, or triangle");
	if(shape.equals("circle")) {
		drawCircle(robot);
	}else if(shape.equals("square")) {
		drawSquare(robot);
	}
	else if(shape.equals("triangle")) {
		drawTriangle(robot);
	}
	}

	public static void drawSquare(Robot robot) {
		robot.setSpeed(20);
		robot.penDown();
		for (int i = 0; i < 4; i++) {
			robot.turn(90);
			robot.move(100);
		}
	}
public static void drawTriangle(Robot robot) {
	robot.setSpeed(20);
	robot.penDown();
	robot.move(100);
	for (int i = 0; i < 3; i++) {
		robot.turn(120);
		robot.move(100);
	}
}
public static void drawCircle(Robot robot) {
	robot.setSpeed(20);
	robot.penDown();
	for (int i = 0; i < 360; i++) {
		robot.turn(1);
		robot.move(1);
	}
}
}
