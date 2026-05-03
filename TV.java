package com.manizheh.devices;

public class TV implements IPower,IVolumeControl{

	@Override
	public void turnon() {
		System.out.println("TV is on");
	}

	@Override
	public void turnoff() {
		System.out.println("TV is of");
		
	}

	@Override
	public void incresevolume() {
	     System.out.println("TV volume increased");
	}

	@Override
	public void decreasevolume() {
		System.out.println("TVvolume decreased");
	}

}
