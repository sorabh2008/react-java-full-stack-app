package com.example.demo.constants;


public enum ErrorConstants {
	CODE_200(200),
	MESSAGE_200("SUCCESS"),;

	public final String label;
	public final int value;
	ErrorConstants(String string) {
		// TODO Auto-generated constructor stub
		this.label = string;
		this.value = 0;
	}

	ErrorConstants(int i) {
		this.label = "";
		this.value = i;
		// TODO Auto-generated constructor stub
	}
	
}
