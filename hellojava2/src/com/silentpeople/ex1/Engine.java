package com.silentpeople.ex1;

public class Engine {
	int rpm;
	int engineStatus;
	
	public String start_stopEngine(boolean engineStatus){
		if(engineStatus == true){
			System.out.println("on");
			this.engineStatus = 1;
			return "on";
		}else{
			System.out.println("off");
			this.engineStatus = 0;
			return "off";
		}
		
	}
	
	public void rpmControl(int oilOut){
		this.rpm = oilOut * 1000;
		System.out.println(this.rpm);
		
	}
}
