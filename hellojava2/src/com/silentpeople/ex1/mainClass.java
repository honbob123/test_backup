package com.silentpeople.ex1;

import java.util.Scanner;

public class mainClass {

	public static void main(String [] args){
		/*testclass tclass1;
		tclass1 = new testclass("babo",10);
		
	//	tclass1.age = 10;
		
	//	tclass1.scanprintname();
		
		Scanner sc = new Scanner(System.in);
		tclass1.age = sc.nextInt();
		
		if(^[0-9]*$){ // 조건 : age변수에 숫자가 들어오면
			tclass1.age = age;
		}
		
		tclass1.printAge();*/
		while(true) {
			
			System.out.println("Input Value: ");
			Scanner sc = new Scanner(System.in);
			String controlValue = sc.nextLine(); // 시동값 : 악셀값 // 0/1, 0~100
			
			String [] values = controlValue.split(":");
			
			int sidongval = Integer.parseInt(values[0]);
			int accelval = Integer.parseInt(values[1]);
			
			Sidong sidong1 = new Sidong();
			sidong1.engineStartStop(sidongval);
			
		}
		
	}
	
}