package com.catalyst.zooKeepr.validation;

public class Validation {
	private String input;
	
	public Validation(String input) {
		this.input = input;
	}
	
	public boolean validateInputLength(int length) {
		if (input.length() < length) {
			return true;
		}
		return false;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public boolean validateEmpty() {
		if (input.trim().length() == 0) {
			return false;
		}
		return true;
	}
}
