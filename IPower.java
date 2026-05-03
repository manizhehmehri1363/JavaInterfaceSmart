package com.manizheh.devices;

public interface IPower {
	void turnon();
	void turnoff();
	
	default void TestPrint() {
		System.out.println(" Hi");
	}
	
    static void info() {
    	System.out.println("This is a Power device interface.");
    }
	
}
