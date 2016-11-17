package com.silentpeople.ex1_2;

import java.util.Scanner;

public class calculatorMain {
	public static void main(String[] args) {
		String inputVal;
		boolean whilechk = true;
		do{
			System.out.println("Input:");
			Scanner scan = new Scanner(System.in);
			
			inputVal = scan.nextLine();
			
			inputVal = inputVal.replaceAll("\\s","");
			System.out.println("�Է¹��� �� :"+inputVal);
			String divchk = "-";
			String [] chkvals = inputVal.split("[\\+\\-\\/\\*\\=]");
			if(inputVal.startsWith("-")){
				chkvals[0] = divchk.concat(chkvals[1]);
				System.out.println("concat: "+chkvals[0]);
				chkvals[1] = chkvals[2];
				chkvals[2] = "0";
			}
			for(int cnt=0; cnt < chkvals.length; cnt++){	// �����ڵ�
				System.out.println("chkvals ���� : "+chkvals[cnt]);
			}
			int [] num = {0,0,0,0,0,0,0,0,0};
			for(int cnt=0; cnt < chkvals.length; cnt++){
				try{
					num[cnt] = Integer.parseInt(chkvals[cnt]);
					System.out.println(num[cnt]);
				}catch(java.lang.NumberFormatException e){
					System.out.println("�Է¹��� �ʰ�: -2147483648 ~ 2147483648");
				}
			}
			
			String [] signArray = {"+", "-", "*", "/"};
			char sign = '0';
			for(int cnt = 0; cnt < signArray.length; cnt++){
				int signOrder = inputVal.indexOf(signArray[cnt]);
				if(signOrder <= 0){
					continue;
				}
				System.out.println("signOrder�� :"+signOrder);
				sign = inputVal.charAt(signOrder);
				System.out.println("��ȣ:"+sign);
			}
			
			if(num[1] == 0 && sign == '/'){
				System.out.println("0���� ������� �Ұ��� �մϴ�. �ٽ� �Է����ּ���");
				
			}
			switch(sign){
				case '+':
					long addresult = Long.valueOf(num[0]) + (long)num[1];
					System.out.println("result:"+addresult);
					break;
				case '-':
					long subresult = (long)num[0] - Long.valueOf(num[1]);
					System.out.println("result:"+subresult);
					break;
				case '*':
					long mulresult = Long.valueOf(num[0]) * Long.valueOf(num[1]);
					System.out.println("result:"+mulresult);
					break;
				case '/':
					double divresult = Double.valueOf(num[0]) / Double.valueOf(num[1]);
					System.out.println("result:"+divresult);
					break;
				default:
					break;
			}
			
			System.out.println("yes(y) or no(n)");
			inputVal = scan.nextLine();
			/*if(inputVal.equals("y") || inputVal.equals("Y")){
				whilechk = true;
				continue;
			}else if(inputVal.equals("n") || inputVal.equals("N")){
				whilechk = false;
				break;
			}*/
			
			switch (inputVal) {
				case "y" : case "Y" :
					whilechk = true;
					continue;
				case "n" : case "N" :
					whilechk = false;
					break;
				default:
					break;
			}
		
		}while(whilechk);
		System.out.println("����");
		
	}
	
}

