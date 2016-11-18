package com.silentpeople.ex1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class calculatorMain {
	public static String inputValCheck(String inputVal) {
		inputVal = inputVal.replace(" ", "");
		return inputVal;
	}
	public static boolean startWithNotNumeric(String inputVal) {
		boolean a1 = inputVal.startsWith("-");
		return a1;
	}
	public static String[] inputValCutting(String inputVal) {
		String[] a2 = inputVal.split("[\\+\\-\\*\\/\\=]");
		return a2;
	}
	public static int[] StringArrToIntegerArr(String[] splitValues) {
		int num[] = new int[10];
		for (int cnt = 0; cnt < splitValues.length; cnt++) {
			try {
				num[cnt] = Integer.parseInt(splitValues[cnt]);
				//System.out.println(num[cnt]);
			} catch (java.lang.NumberFormatException e) {
				System.out.println("�Է¹��� �ʰ�: -2147483648~2147483647");
			}
		}
		return num;
	}
	public static char PopSign(String inputVal) {
		String[] signArray = { "+", "-", "*", "/" };
		char sign = '+';
		for (int cnt = 0; cnt < signArray.length; cnt++) {
			int signOrder = inputVal.indexOf(signArray[cnt]);
			if (signOrder < 0) {
				continue;
			}
			sign = inputVal.charAt(signOrder);
		}
		return sign;
	}
	public static boolean blockDivideByZero(int num, char sign) {
		if (num == 0 && sign == '/') {
			System.out.println("0���� ������� �Ұ����մϴ�. �ٽ� �Է����ּ���!!");
			return true; // 0���� ������ ��Ȳ : true, �ƴϸ� : false
		}
		return false;
	}
	public static long SignChkResult(char sign, int [] num) {
		long result = 0;
		switch (sign) {
		case '+':
			result = (long) num[0] + (long) num[1];
			System.out.println(result);
			break;
		case '-':
			result = (long) num[0] - (long) num[1];
			System.out.println(result);
			break;
		case '*':
			result = (long) num[0] * (long) num[1];
			System.out.println(result);
			break;
		default:
			break;
		}
		return result;
	}
	public static double SignDivChkResult(char sign, int [] num) {
		double result2 = 0.0;
		switch (sign) {
		case '/':
			result2 = (double) num[0] / (double) num[1];
			System.out.println(result2);
			break;
		}
		return result2;
	}
	public static void main(String[] args) {
		String inputVal;
		boolean yesno = true;
		do {
			System.out.println("Input:");
			Scanner scan = new Scanner(System.in);
			inputVal = scan.nextLine();
			inputVal = inputValCheck(inputVal);
			if (startWithNotNumeric(inputVal)) { // ���ڸ� ������ ��ȣ�� �����ϸ� true�� ��ȯ�ϴ� �޼ҵ�
				System.out.println("������ �Էµ��� �ʽ��ϴ�."); // ù��° �ԷµǴ� ���� ������ �������� �ʴ´�.
				continue;
			}
			String[] splitValues = inputValCutting(inputVal);
			int [] num = StringArrToIntegerArr(splitValues); // ���ڿ� �迭�� �����迭�� ��ȯ
			char sign = PopSign(inputVal); // ���� ��ȣ ���� �ڵ�
			if(blockDivideByZero(num[1], sign)) continue; //0���� ������ ���� �ڵ�
			if(sign != '/') SignChkResult(sign, num); // sign ���� üũ�ؼ� + - * �� �°� ���
			else SignDivChkResult(sign, num);		  // sign ���� üũ�ؼ� / �� �°� ���
			System.out.println("yes(y) or no(n)");	  // Yes or No
			inputVal = scan.nextLine();
			switch (inputVal) {
			case "y": case "Y":
				yesno = true;
				continue;
			case "n": case "N":
				yesno = false;
				break;
			default:
				break;
			}
		} while (yesno);
		System.out.println("����Ǿ����ϴ�.");
	}
}
