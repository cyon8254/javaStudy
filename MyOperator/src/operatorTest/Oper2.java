package operatorTest;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
//		두 정수 입력받기
		int number1 = 0, number2 = 0;
		boolean isBigger = false, isSame = false;
		String message = "정수 두 개를 입력하세요 : ", result = null;
		Scanner sc = new Scanner(System.in);

		System.out.print(message);
		number1 = sc.nextInt();
		number2 = sc.nextInt();

		isBigger = number1 > number2;
		isSame = number1 == number2;
		result = isBigger ? "큰 값" + number1 : isSame ? "두 수가 같습니다" : "큰값" + number2;

		System.out.println(result);
	}

}
