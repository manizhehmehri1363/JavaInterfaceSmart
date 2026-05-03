package com.manizheh.devices;

public class Main {

	public static void main(String[] args) {
           TV tv = new TV();
           tv.TestPrint();
           IPower.info();
           Speaker speaker = new Speaker();
           SmartLight light = new SmartLight();
           Fan fan = new Fan();
           fan.turnon();
           fan.setLevel(3);
           fan.turnoff();
           DeviceManager manager = new DeviceManager();
           
           // Power Control
           manager.powerOnDevice(tv);
           manager.powerOnDevice(speaker);
           manager.powerOnDevice(light);
    
           
           System.out.println("-------------------");
           
           // Volum Control
           manager.increaseDeviceVolume(tv);
           manager.increaseDeviceVolume(speaker);
           
           System.out.println("--------------------");
           
           
           manager.poweroffDevice(tv);
           manager.poweroffDevice(speaker);
           manager.poweroffDevice(light);
	}
           
}
