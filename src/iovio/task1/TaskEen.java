package iovio.task1;

import java.util.*;

/**
 * @author JTJavier
 * @info This is for IOVIO TC : Task #1
 */
public class TaskEen {
	public static void main(String[] args) {
		Random rand = new Random(); // Use random util to generate random int

		int lambInt = rand.nextInt(9); // Generate random int for lambda (from 0 to 9)
		int sigInt = rand.nextInt(9); // Generate random int for sigma (from 0 to 9)
		int gamInt = rand.nextInt(9); // Generate random int for gamma (from 0 to 9)
		int lalalaInt = Integer.parseInt(Integer.toString(lambInt) + Integer.toString(lambInt) + Integer.toString(lambInt)); // Generate lambdalambdalamda integer by first concatenating lambda (that were converted to string)

		String lambdaSigma = Integer.toString(lambInt) + Integer.toString(sigInt); // Formula requires a digit that combines the generate number from lambda and sigma. This string will be this digit later on.

		if (lalalaInt == (Integer.parseInt(lambdaSigma) * gamInt)) { // If condition checks if the lambdalambdalambda integer we have generated is equal to lambdasigma multiplied by gamma
			System.out.println("lambda = " + lambInt); // If condition is true, it displays the lambda, sigma, and gamma digits used
			System.out.println("sigma = " + sigInt);
			System.out.println("gamma = " + gamInt);
		} else {
			System.out.println(lambdaSigma + " x " + gamInt + " <=> " + (Integer.parseInt(lambdaSigma) * gamInt) + " = "
					+ Integer.toString(lambInt) + Integer.toString(lambInt) + Integer.toString(lambInt)); // If condition is false, it displays the inequality based on task specifications
		}
	}
}
