package cz.vsb.fei.java2.testhashcode;

import java.util.Random;

public record Triangle(int a, int b, int c) {

	public static final Random RANDOM = new Random();
	
	public int perimeter() {
		return a + b + c;
	}
	
	public static Triangle generate() {
		return new Triangle(RANDOM.nextInt(5)+1, RANDOM.nextInt(5)+1, RANDOM.nextInt(5)+1);
	}
}
