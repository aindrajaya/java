package id.jayalearn;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int value = generator.nextInt();
		
		System.out.println("The random number is "+value);
	}

}
