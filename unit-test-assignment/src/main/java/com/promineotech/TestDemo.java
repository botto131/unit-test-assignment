package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {

		if (a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}

	public boolean isOdd(int num) {
		return num % 1 == 0;

	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;

	}

	int randomNumberSquared() {
		int result = getRandomInt();
		return result * result;
	}

}
