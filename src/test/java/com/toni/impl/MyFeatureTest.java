package com.toni.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyFeatureTest {

	private MyFeatureClass myFeature;
	
	@Before
	public void init(){
		myFeature = new MyFeatureClass();
	}
	
	@Test
	public void testAddSomething() {
		myFeature.addSomething(5);
		assertEquals(5, myFeature.getValue());
	}
	
	@Test
	public void testGetTokenLengthWithTrue(){
		assertEquals(5, myFeature.getTokenLengthIfNeeded(true));
	}
	
	@Test
	public void testGetTokenLengthWithTrueAnotherTime(){
		assertEquals(5, myFeature.getTokenLengthIfNeeded(true));
	}
	
	@Test
	public void testGetTokenLengthWithFalse(){
		// Null pointer
		assertEquals(5, myFeature.getTokenLengthIfNeeded(false));
	}
}
