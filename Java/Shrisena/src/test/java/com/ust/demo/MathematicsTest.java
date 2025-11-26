package com.ust.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathematicsTest {
	
	@Mock
	MathsService proxy;

	@Test
	public void testSum() {
		when(proxy.sum(2, 3)).thenReturn(5);
		when(proxy.difference(2, 3)).thenReturn(1);
		
		assertEquals(5, proxy.sum(2, 3));
	}
}
