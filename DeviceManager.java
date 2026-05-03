package com.manizheh.devices;

public class DeviceManager {
	
	public void powerOnDevice(IPower device) {
		device.turnon();
	}
	
	public void poweroffDevice(IPower device) {
		device.turnoff();
	}
	
	public void increaseDeviceVolume(IVolumeControl device) {
		device.incresevolume();
	}

}
