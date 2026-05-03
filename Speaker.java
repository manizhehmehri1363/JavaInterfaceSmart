package com.manizheh.devices;

public class Speaker implements IVolumeControl,IPower{

	@Override
	public void incresevolume() {
		System.out.println("speaker volume increased");
		
	}

	@Override
	public void decreasevolume() {
		System.out.println("speaker volume decreased");
		
	}

	@Override
	public void turnon() {
		System.out.println("Speaker is on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Speaker is off");
		
	}

}
