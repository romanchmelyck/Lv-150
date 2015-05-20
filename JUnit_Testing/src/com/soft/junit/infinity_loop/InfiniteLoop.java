package com.soft.junit.infinity_loop;

public class InfiniteLoop {
	public static int loop(int one) {
		while (one == 1) {
			one = 1;
		}
		return 2;
	}
}
