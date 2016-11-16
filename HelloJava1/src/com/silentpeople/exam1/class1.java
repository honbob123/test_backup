package com.silentpeople.exam1;

import java.util.Scanner;


public class class1 {
// 클래스 선언(클래스명: class1)

	public static void main(String[] args) {		// main 메소드(Method)
		/*
		byte salary = (byte)2400000;
		long salary2 = 2200000000L;
		short salary3 = 33000;
		char name = 'a';
		float ratio = (float)1.8;
		float ratio2 = 1.8F;
		double ratio3 = 1.234859430946904509959594599595955964412321345698895611155605808075804806780578056808430683;
		String str1 = "Hello"; // String class
		String str2 = "Hello";
		
		String str1 = "apple";
		boolean startsWith = str1.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		String str2 = "test";
		boolean endsWith = str2.endsWith("t");
		System.out.println("endsWith: "+ endsWith);
		
		String str3 = "java";
		String str4 = "java";
		boolean equals = str3.equals(str4);
		System.out.println("equals: "+ equals);
		
		String str5 = "abcdef";
		int indexOf = str5.indexOf("d");
		System.out.println("indexOf: "+ indexOf);
		
		String str6 = "AndroidApp";
		int lastIndexOf = str6.lastIndexOf("A");
		System.out.println("lastIndexOf: "+ lastIndexOf);
		
		String str7 = "abcdef";
		int length = str7.length();
		System.out.println("length: "+ length);
		
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replace: "+ replace);
		
		String str9 = "ABCD EF";
		String replaceAll = str9.replaceAll("\\p{Space}", "*");
		System.out.println("replaceAll: "+ replaceAll);
		
		String str10 = "A:B:C:D:abcd";
		String[] split = str10.split(":");
		System.out.println("split: "+ split[1]);
		
		String str11 = "ABCDEF";
		String substring = str11.substring(0, 2);
		System.out.println("substring: "+ substring);
		
		String str12 = "abcDEF";
		String toLowerCase = str12.toLowerCase();
		System.out.println("toLowerCase: "+ toLowerCase);
		
		String str13 = "abcDEF";
		String toUppercase = str13.toUpperCase();
		System.out.println("toUppercase: "+ toUppercase);
		
		String str14 = "1234";
		String toString = str14.toString();
		System.out.println("toString: "+ toString);
		
		String s = "	java java java		";
		String v;
		v = s.trim();
		System.out.println("trim: "+ v);
		
		
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: "+ String.valueOf(i));
		System.out.println("valueOf: "+ String.valueOf(l));
		System.out.println("valueOf: "+ String.valueOf(c));
		
		String str15 = "A";
		String str16 = "A";
		int compareTo = str15.compareTo(str16);
		if(compareTo > 0){
			System.out.println(str15 + " > " + str16);
		} else if (compareTo == 0){
			System.out.println(str15 + " = " + str16);
		} else {
			System.out.println(str15 + " < " + str16);
		}
		
		String str17 = "abcd";
		String str18 = "c";
		boolean contains = str17.contains(str18);
		System.out.println("contains: "+ contains);
		
		String str19 = "charAt";
		char charAt = str19.charAt(2);
		System.out.println("charAt: " + charAt);
		
		String str20 = "Han";
		String str21 = "SeeJin";
		String concat = str20.concat(str21);
		System.out.println("concat: " + concat);
		
		int i2 = 123456789;
		String str22 = String.format("%,d", i2);
		System.out.println("format: " + str22);
		
		int i3 = 123456;
		String str23 = String.format("%,d", i3);
		String str24 = "123456";
		boolean matches = str23.matches(str24);
		System.out.println("matches: " + matches);
		
		String str25 = "Aman";
		String replaceFirst = str25.replaceFirst("A", "super");
		System.out.println("replaceFirst: " + replaceFirst);
		
		System.out.println(Math.random());
		
		int age = 5;
		
		switch (age) {
			case 1:
				System.out.println("1살 입니다.");
				break;
			case 2:
				System.out.println("2살 입니다.");
				break;
			case 3:
				System.out.println("3살 입니다.");
				break;
			default:
				System.out.println("Range out");
		}
		if(age == 1){
			System.out.println("1살 입니다.");
		}else if(age == 2){
			System.out.println("2살 입니다.");
		}else if(age == 3){
			System.out.println("3살 입니다.");
		}else {
			System.out.println("Range out");
		}
		for(String input:args){
			System.out.println(input);
		}
		
		int i;
		Scanner sc = new Scanner(System.in);
		while(true){
			i = sc.nextInt();
			System.out.println(i);
			if(i == 18) break;
		}
		do {
			i = sc.nextInt();
			System.out.println(i);
		}while(i != 18);
		
		System.out.println("Hello World!");
		System.out.println("순시리는 이렇게 말했다. \"난 피해자다.\" 그랬다");
		System.out.println("나는 지금 집에 \n \f \b 가구 \t 가고 싶다");
		System.out.println("salary="+salary);
		System.out.println("salary="+salary2);
		System.out.println("10 % 3 = "+10%3);
		System.out.println(str1+" == "+str2+" : "+str1.equals(str2));
		
		int i = 1234;
		long j = 112232443;
		String str1 = String.valueOf(i);
		String str2 = String.valueOf(j);
		System.out.println(str1);
		System.out.println(str2);
		
		int i;
		String[][] name = {
			      			{"바보","보보","부부"},
			      			{"호호","하하","히히"},
			      			{"크크","키키","코코"}
			      			};
	    for(i=0; i<name.length; i++) {
		System.out.println(name[0][i]);	
	    }
	    */
		/*-------------------------------------------------------------
		int addval, subval, mulval;
		float divval;
		Scanner sc = new Scanner(System.in);
		String val;
		
		int chk;
		int num1, num2;
		String exit = "exit";
		do{
			val = sc.nextLine();
			if((chk = val.indexOf("+")) != -1){
				num1 = Integer.valueOf(val.substring(0, chk));
				//System.out.println(num1);
				//System.out.println(val.indexOf("-"));
				num2 = Integer.valueOf(val.substring(chk+1,val.length()-1));
				//System.out.println(num1 + " " + num2);
				addval = add(num1, num2);
				System.out.println(val+" "+addval);
			}else if((chk = val.indexOf("-")) != -1){
				num1 = Integer.valueOf(val.substring(0, chk));
				//System.out.println(num1);
				
				num2 = Integer.valueOf(val.substring(chk+1,val.length()-1));
				//System.out.println(num1 + " " + num2);
				subval = sub(num1, num2);
				System.out.println(val+" "+subval);
			}else if((chk = val.indexOf("*")) != -1){
				num1 = Integer.valueOf(val.substring(0, chk));
				//System.out.println(num1);
				
				num2 = Integer.valueOf(val.substring(chk+1,val.length()-1));
				//System.out.println(num1 + " " + num2);
				mulval = mul(num1, num2);
				System.out.println(val+" "+mulval);
			}else if((chk = val.indexOf("/")) != -1){
				num1 = Integer.valueOf(val.substring(0, chk));
				//System.out.println(num1);
				
				num2 = Integer.valueOf(val.substring(chk+1,val.length()-1));
				//System.out.println(num1 + " " + num2);
				divval = div(num1, num2);
				System.out.println(val+" "+divval);
			}else{
				System.out.println("정상 종료");
			}
		}while(!val.equals(exit));
		----------------------------------------------------------*/
		Scanner sc = new Scanner(System.in);
		String test;
		test = sc.nextLine();
		int[] cpy;
		int i = 0, startval = 0, last = 0;
		cpy = new int[100];
		/*
		if(test.indexOf("+",chk+1) < test.indexOf("-",chk+1)){
			chk = test.indexOf("+",chk+1);
			cpy[i] = Integer.valueOf(test.substring(startval, chk));
		}else{
			chk = test.indexOf("-");
		}
		*/
		String testbackup = test.replace("-", "+");
		System.out.println(testbackup);
		int chk = testbackup.indexOf("+");
		do{
			cpy[i] = Integer.valueOf(testbackup.substring(startval, chk));
			startval = chk;
			i++;
			if(testbackup.indexOf("+",startval+1) == -1){
				chk = testbackup.lastIndexOf("+");
				cpy[i] = Integer.valueOf(testbackup.substring(chk, testbackup.indexOf("=")));
				break;
			}else{
				chk = testbackup.indexOf("+",startval+1);
			}
			
		}while(chk!=-1);
		
		for(int j = 0; j <= i; j++){
			System.out.println(cpy[j]);
		}
		//System.out.println(test.indexOf(String.valueOf(cpy[0]))+1);
		//System.out.println(test.indexOf(String.valueOf(cpy[0]))+1);
		
		//if(test.indexOf("+",test.indexOf(cpy[1])+1 == ))
		String[] backup;
		backup = new String[10];
		int antchk = 0;
		for(int cut = 0; cut < test.length(); cut++){
			backup[cut] = test.substring(cut,cut+1);
		}
		for(int backupchk = 0; backupchk < test.length(); backupchk++){
			if(backup[backupchk].equals("+") || backup[backupchk].equals("-"))
			{
				antchk = backupchk;
				break;
			}
		}
		if(test.indexOf("+") == antchk){
			last = cpy[0] + cpy[1];
		}else{
			last = cpy[0] - cpy[1];
		}
		int plusval = 2;
		for(int chkval = antchk+1; chkval < test.length(); chkval++){
			if(backup[chkval].equals("+")){
				last = last + cpy[plusval];
				plusval++;
			}else if(backup[chkval].equals("-")){
				last = last - cpy[plusval];
				plusval++;
			}
		}
		//boolean sibal = test.indexOf("+",test.indexOf(String.valueOf(cpy[1]))+1) < test.indexOf("-",test.indexOf(String.valueOf(cpy[1]))+1);
		//System.out.println(sibal);
		/*
		for(int cpychk = 1;cpychk < i ;cpychk++){
			if(test.indexOf("+") == test.indexOf(String.valueOf(cpy[0]))+1){
				last = last + cpy[cpychk+1];
			}else{
				last = last - cpy[cpychk+1];
			}
		}
		*/
		System.out.println(last);
			
		//int test1 = Integer.valueOf(test.substring(0, test.indexOf("=")));
		
		//System.out.println();
		//for(int i=0; i<test.length();i++){
			
			//chk = test.indexOf("+");
			
		//}
		/*
		int cnt = 3;
		String[] noval = nameOut(cnt);
		
		Thread.sleep(4000);
		
		try {
			Thread.sleep(4000);
		} 
		catch(InterruptedException e){
			System.out.println("InterruptedException 예외가 발생");
		}
		finally{
			System.out.println("정상실행 중");
		}
		
		System.out.println(noval[0] + noval[1] + noval[2]);
		*/
	}
	public static int add(int num1, int num2){
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public static int sub(int num1, int num2){
		int val;
		val = num1 - num2;
		return val;
	}
	public static int mul(int num1, int num2){
		int val;
		val = num1 * num2;
		return val;
	}
	public static float div(float i, float j){
		float val;
		val = i / j;
		return val;
	}
	public static String[] nameOut(int cnt){
		
		String[] name = {"하하","호호","히히"};
		
		String[] outname = {"","",""};
		
		for(int i=0; i< cnt; i++){
			outname[i] = name[i];
		}
		return outname;
	}
}
