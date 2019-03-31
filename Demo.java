package com.cs.arith;

public class Demo {

	public static void main(String[] args) {
		int n = 5;
		double number = 0;
		for (int i = 0; i <= n; i++) {
			number += 1 / fack(i);
		}
		System.out.println(number);

	}

	// 阶乘表达式
	public static double fack(int k){
		if(k==1){
			return 1;
		}
		if(k>1){
			return k*fack(k-1);
		}
		return 1;
	}

}
