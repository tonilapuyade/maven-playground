package com.toni.impl;

import com.toni.MyFeature;

public class MyFeatureClass implements MyFeature {

	private int value;	
	private String token;
	
	public MyFeatureClass() {
		super();
		this.value = 0;
	}

	public void addSomething(int value){
		this.value += value;
	}
	
	public void substractSomething(int value){
		this.value -= value;
	}
	
	public int getTokenLengthIfNeeded(boolean needed) {
		if(needed){
			token="token";
		}	
		// If not needed it gets a null pointer
		return token.length();
	}

	public int getValue() {
		return value;
	}
	
}
