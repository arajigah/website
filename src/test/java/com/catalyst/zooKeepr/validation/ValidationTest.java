package com.catalyst.zooKeepr.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidationTest {
	private Validation validate;
	
	@Before
	public void setup() {
		validate = new Validation("");
	}
	
	@Test
	public void happyPath() {
		validate.setInput("name");
		assertTrue(validate.validateInputLength(10));
	}
	
	@Test
	public void happyPathTrim() {
		validate.setInput("name     ");
		assertTrue(validate.validateEmpty());
	}
	
	@Test
	public void longInput() {
		validate.setInput("name");
		assertFalse(validate.validateInputLength(3));
	}
	
	@Test
	public void onlyWhitespace() {
		validate.setInput("         ");
		assertFalse(validate.validateEmpty());
	}
	

}
