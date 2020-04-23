package _01_robot._2_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RoboGraf {
public static void main(String[] args) {
	Robot Aether = new Robot("mini");
	Aether.penDown();
	Aether.setSpeed(100);
	Aether.turn(-90);
	Aether.move(75);
	Aether.turn(-90);
	Aether.move(100);
	Aether.turn(-90);
	Aether.move(75);
	Aether.turn(-90);
	Aether.move(45);
	Aether.turn(-90);
	Aether.move(50);
	

}
}
