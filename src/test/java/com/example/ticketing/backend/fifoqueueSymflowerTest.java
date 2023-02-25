package com.example.ticketing.backend;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class fifoqueueSymflowerTest {
	@Test
	public void dequeue1() {
		fifoqueue f = null; // TODO This is a fallback value due to incomplete analysis.
		Integer expected = null; // TODO This is a fallback value due to incomplete analysis.
		Integer actual = f.dequeue();

		assertEquals(expected, actual);
	}

	@Test
	public void enqueue2() {
		fifoqueue f = null; // TODO This is a fallback value due to incomplete analysis.
		int value = 0; // TODO This is a fallback value due to incomplete analysis.
		f.enqueue(value);
	}

	@Test
	public void fifoqueue3() {
		fifoqueue expected = null; // TODO This is a fallback value due to incomplete analysis.
		fifoqueue actual = new fifoqueue();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getQueue4() {
		fifoqueue f = null; // TODO This is a fallback value due to incomplete analysis.
		String[] expected = null; // TODO This is a fallback value due to incomplete analysis.
		String[] actual = f.getQueue();

		assertArrayEquals(expected, actual);
	}

	@Test
	public void size5() {
		fifoqueue f = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = f.size();

		assertEquals(expected, actual);
	}
}
