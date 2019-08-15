package iovio.task1;

import java.util.*;

/**
 * @author JTJavier
 * @info This is for IOVIO TC : Task #1
 */
public class TaskEen {
	public static void main(String[] args) {
		boolean tallyHo = false;
		Random rand = new Random();

		int lambInt = rand.nextInt(9);
		int sigInt = rand.nextInt(9);
		int gamInt = rand.nextInt(9);
		int lalalaInt = Integer.parseInt(Integer.toString(lambInt) + Integer.toString(lambInt) + Integer.toString(lambInt));

		String lambdaSigma = Integer.toString(lambInt) + Integer.toString(sigInt);

		if (lalalaInt == (Integer.parseInt(lambdaSigma) * gamInt)) {
			tallyHo = true;
		}

		if (tallyHo) {
			System.out.println("lambda = " + lambInt);
			System.out.println("sigma = " + sigInt);
			System.out.println("gamma = " + gamInt);
		} else {
			System.out.println(lambdaSigma + " x " + gamInt + " <=> " + (Integer.parseInt(lambdaSigma) * gamInt) + " = "
					+ Integer.toString(lambInt) + Integer.toString(lambInt) + Integer.toString(lambInt));
		}
	}
}
