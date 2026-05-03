package com.manizheh.devices;

public class SmartLight implements IPower{

	@Override
	public void turnon() {
		System.out.println("Light is ON");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Light is OFF");
		
	}

}
