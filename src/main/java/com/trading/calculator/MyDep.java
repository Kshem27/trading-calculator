package com.trading.calculator;
//t1
public class MyDep {
	public int algo(int input) {
		return step1(step2(input));
	}
	public int step1(int input) {
		return input+2;
	}
	public int step2(int input) {
		return input+6;
	}
}
