package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	static int robotWinner;
	static Random r = new Random();
	static boolean raceInProgress = true;
	
	public static void main(String[] args) {
		
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			System.out.println(rob[i]);
			rob[i] = new Robot();
			rob[i].setX(50 + i * 200);
			rob[i].setY(550);	
			rob[i].setSpeed(15);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
	
		while(raceInProgress) {
		for(int t = 0; t < rob.length; t++) {
			int distance = r.nextInt(51);
			rob[t].move(distance);
			
			if(rob[t].getY() <=0 ) {
				raceInProgress = false;
				robotWinner = t; 
				
				break;
				
			}
		}
		}
		rob[robotWinner].setPenColor(700, 100, 100);
		rob[robotWinner].penDown();
		rob[robotWinner].sparkle();
		rob[robotWinner].turn(180);
		rob[robotWinner].move(700);
		
	
		
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. OPTIONAL: make the robots race around a circular track.
	}
}