package com.silentpeople.ex1_2;

import java.util.Scanner;

public class calculatorMain {
	public static void main(String[] args) {
		System.out.println("Input:");
		Scanner scan = new Scanner(System.in);
		
		String inputVal = scan.nextLine();
		
		System.out.println(inputVal);
		
		String [] chkvals = inputVal.split("[\\+\\-\\/\\*\\=]");
		
		for(int cnt=0; cnt < chkvals.length; cnt++){	// 검증코드
			System.out.println(chkvals[cnt]);
		}
		int [] num = {0,0,0,0,0,0,0,0,0};
		for(int cnt=0; cnt < chkvals.length; cnt++){
			 
			num[cnt] = Integer.parseInt(chkvals[cnt]);
			System.out.println(num[cnt]);
		}
		
		String [] sign = {"+", "-", "*", "/"};
		for(int cnt = 0; cnt < sign.length; cnt++){
			int signOrder = inputVal.indexOf(sign[cnt]);
			System.out.println(signOrder);
		}
		
		
	
		
		
	}
	
}
