package com.silentpeople.ex1_2;

import java.util.Scanner;

public class calculatorMain {
	public static void main(String[] args) {
		System.out.println("Input:");
		Scanner scan = new Scanner(System.in);
		
		String inputVal = scan.nextLine();
		
		inputVal = inputVal.replaceAll("\\s","");
		System.out.println(inputVal);
		String divchk = "-";
		String [] chkvals = inputVal.split("[\\+\\-\\/\\*\\=]");
		if(inputVal.startsWith("-")){
			chkvals[0] = divchk.concat(chkvals[1]);
			System.out.println("concat: "+chkvals[0]);
			chkvals[1] = chkvals[2];
		}
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
		
		if(num[1] == 0 && sign == '/'){
			System.out.println("0으로 나누기는 불가능 합니다. 다시 입력해주세요");
			
		}
		switch(sign){
		case '+':
			long addresult = Long.valueOf(num[0]) + (long)num[1];
			System.out.println(addresult);
			break;
		case '-':
			long subresult = (long)num[0] - Long.valueOf(num[1]);
			System.out.println(subresult);
			break;
		case '*':
			long mulresult = Long.valueOf(num[0]) * Long.valueOf(num[1]);
			System.out.println(mulresult);
			break;
		case '/':
			double divresult = Double.valueOf(num[0]) / Double.valueOf(num[1]);
			System.out.println(divresult);
			break;
		default:
			break;
		}
	
		
		
	}
	
}

