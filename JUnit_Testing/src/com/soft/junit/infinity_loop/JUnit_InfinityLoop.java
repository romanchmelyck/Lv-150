package com.soft.junit.infinity_loop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;

public class JUnit_InfinityLoop {

	@Test (timeout = 1000)
	public void test() {
		int three = InfiniteLoop.loop(1);
		assertEquals(1, three, 0);
	}

}
