package sample.actuator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class HelloWorldServiceTest {

	@Test
	public void anotherTest() {
		HelloWorldService mockFoo = mock(HelloWorldService.class);
		
		when(mockFoo.getHelloMessage())
		.thenReturn("Hola Hola")
		.thenReturn("Hello Hello");
		
		
		assertEquals("Expected correct message","Hola Hola",mockFoo.getHelloMessage());
		assertEquals("Expected correct message","Hello Hello",mockFoo.getHelloMessage());
	}
}



