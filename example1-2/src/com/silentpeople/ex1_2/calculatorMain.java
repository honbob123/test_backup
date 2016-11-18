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
				System.out.println("입력범위 초과: -2147483648~2147483647");
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
			System.out.println("0으로 나누기는 불가능합니다. 다시 입력해주세요!!");
			return true; // 0으로 나누는 상황 : true, 아니면 : false
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
			if (startWithNotNumeric(inputVal)) { // 숫자를 제외한 기호로 시작하면 true를 반환하는 메소드
				System.out.println("음수는 입력되지 않습니다."); // 첫번째 입력되는 수는 음수를 지원하지 않는다.
				continue;
			}
			String[] splitValues = inputValCutting(inputVal);
			int [] num = StringArrToIntegerArr(splitValues); // 문자열 배열을 정수배열로 변환
			char sign = PopSign(inputVal); // 연산 기호 추출 코드
			if(blockDivideByZero(num[1], sign)) continue; //0으로 나누기 방지 코드
			if(sign != '/') SignChkResult(sign, num); // sign 값을 체크해서 + - * 중 맞게 계산
			else SignDivChkResult(sign, num);		  // sign 값을 체크해서 / 에 맞게 계산
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
		System.out.println("종료되었습니다.");
	}
}
