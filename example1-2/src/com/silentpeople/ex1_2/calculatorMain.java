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
			try{
				num[cnt] = Integer.parseInt(chkvals[cnt]);
				System.out.println(num[cnt]);
			}catch(java.lang.NumberFormatException e){
				System.out.println("입력범위 초과: -2147483648 ~ 2147483648");
			}
		}
		
		String [] signArray = {"+", "-", "*", "/"};
		char sign = '0';
		for(int cnt = 0; cnt < signArray.length; cnt++){
			int signOrder = inputVal.indexOf(signArray[cnt]);
			if(signOrder < 0){
				continue;
			}
			System.out.println(signOrder);
			sign = inputVal.charAt(signOrder);
			System.out.println(sign);
		}
		
		switch(sign){
		case '+':
			long result = Long.valueOf(num[0]) + (long)num[1];
			System.out.println(result);
			break;
		case '-':
			long result1 = num[0] - num[1];
			System.out.println();
			break;
		case '*':
			System.out.println(num[0] * num[1]);
			break;
		case '/':
			System.out.println(num[0] / num[1]);
			break;
		default:
			break;
		}
	
		
		
	}
	
}
