package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import java.awt.Color;
import java.awt.Graphics;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	static Robot[] robs = new Robot[30];
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static boolean isRacing = true;

	
public static void main(String[] args) {
	int lineDifference = 10;
	for(int i=0; i < robs.length; i++) {
		robs[i] = new Robot(1890,1078);
		robs[i].setSpeed(60);
		robs[i].show();
		robs[i].miniaturize();
		lineDifference = lineDifference+15;
	}
robs[0].setWindowSize(1920, 1080);
	while(isRacing) {
	for (int i = 0; i < robs.length; i++) {
	Random ran = new Random();
	int ranInt = ran.nextInt(49)+1;
	 robs[i].move(ranInt);
	 if(robs[i].getY() <= 20) {
		// isRacing=false;
		// JOptionPane.showMessageDialog(null, "Robot #"+ (i+1) + " has won the race! Give them a round of applause!");
		// break;
		 robs[i].turn(-90);
		 robs[i].setY(21);
	 }
	 if(robs[i].getX() <= 20) {
		 robs[i].turn(-90);
		 robs[i].setX(21);
	 }
	 if(robs[i].getY() >= 1080) {
		 robs[i].turn(-90);
		 robs[i].setY(1078);
	 }
}
}
}

        // 2. create an array of 5 robots.
//done
        // 3. use a for loop to initialize the robots.
//done
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    //done
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    //done
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    //done
        // 7. declare that robot the winner and throw it a party!
    //done
        // 8. try different races with different amounts of robots.
    //done
        // 9. make the robots race around a circular track.

}
