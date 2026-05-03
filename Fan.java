package com.manizheh.devices;

public class Fan implements IAdjustable{

	@Override
	public void turnon() {
		System.out.println("Fan ON");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Fan OFF");
		
	}

	@Override
	public void setLevel(int level) {
		System.out.println("Fan speed = " + level);
		
	}

}
