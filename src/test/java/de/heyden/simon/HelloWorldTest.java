package de.heyden.simon;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testGetHelloWorld() {
		System.out.println((new HelloWorld()).getHelloWorld());
	}
}