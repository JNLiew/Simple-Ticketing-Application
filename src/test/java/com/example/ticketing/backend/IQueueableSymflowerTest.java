package com.example.ticketing.backend;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IQueueableSymflowerTest {
	@Test
	public void dequeue1() {
		int expected = 0;
		int actual = IQueuable.dequeue();

		assertEquals(expected, actual);
	}

	@Test
	public void enqueue2() {
		int queue = 0;
		IQueuable.enqueue(queue);
	}

	@Test
	public void size3() {
		int expected = 0;
		int actual = IQueuable.size();

		assertEquals(expected, actual);
	}
}
