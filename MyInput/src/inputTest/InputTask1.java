package inputTest;

import java.util.Scanner;

public class InputTask1 {

	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용

		String num1 = null;
		String num2 = null;
		int result = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해 주세요 : ");
		num1 = sc.next();
		System.out.print("두 번째 정수를 입력해 주세요 : ");
		num2 = sc.next();
		result = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println("두 정수의 합은 " + num1 + " + " + num2 + " = " + result);
	}

}
