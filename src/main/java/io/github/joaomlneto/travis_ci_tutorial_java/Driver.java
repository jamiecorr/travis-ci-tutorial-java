package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {
	public static final void main(String[] args) {
		int num = 10;
		SimpleCalculator calc = new SimpleCalculator();
		num = calc.mul(num, 3);
		num = calc.mul(num, 7);
		num = calc.mul(num, 13);
		num = calc.mul(num, 37);
		System.out.println(num);

		
		
	}
}