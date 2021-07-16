package com.example.demo.constants;

public enum AppConstants {
	
	ZERO(0),
	ONE(1),
	HEADER_ID("correlation-id")
	;

	public final String label;
	public final int value;
	AppConstants(String string) {
		// TODO Auto-generated constructor stub
		this.label = string;
		this.value = 0;
	}

	AppConstants(int i) {
		this.label = "";
		this.value = i;
		// TODO Auto-generated constructor stub
	}
			
}
