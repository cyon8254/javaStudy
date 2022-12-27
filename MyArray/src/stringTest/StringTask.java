package stringTest;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		length(), charAt()

//		Scanner sc = new Scanner(System.in);
//		String msg = "문자열 : ", str = null, result = "";
//		System.out.println(msg);
//		str = sc.nextLine();
//
//		for (int i = 0; i < str.length(); i++) { // 입력받은 문자열 만큼 반복
//			char c = str.charAt(i); // 문자 추출
//			if (c >= 65 && c <= 90) { // 대문자
//				result += (char) (c + 32);
//			} else if (c >= 96 && c <= 122) { // 소문자
//				result += (char) (c - 32);
//			} else {
//				result += c;
//			}
//
//		}
//		System.out.println(result);

//		정수를 한글로 변경
//		예) 1024
//		 -> 일공이사
//		charAt()

//		int number = 0; // 입력받을 정수
		Scanner sc = new Scanner(System.in);
		String msg = "정수 : ", hangle = "공일이삼사오육칠팔구", result = "", number = null;

		System.out.print(msg);
		number = sc.next();

		for (int i = 0; i < number.length(); i++) {
			result += hangle.charAt(number.charAt(i) - 48);
		}
		System.out.println(result);

//		System.out.println(number % 10);
//		number /= 10;
//		System.out.println(number % 10);
//		number /= 10;
//		System.out.println(number % 10);
//		number /= 10;
//		System.out.println(number % 10);

//		while (number != 0) { // 몇번 반복할지 모르니 while문 사용
//			result = hangle.charAt(number % 10) + result; // 가져온 문자 값 , 기존 값을 뒤로 보내야 하니까 result를 뒤에 더해줌
//			number /= 10;
//		}
//		System.out.println(result);
	}

}
