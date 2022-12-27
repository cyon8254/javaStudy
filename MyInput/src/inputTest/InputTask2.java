package inputTest;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후
//		3개의 정수의 곱 출력
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("3개의 정수를 입력해 주세요 : ");
		number1 = Integer.parseInt(sc.next());
		number2 = Integer.parseInt(sc.next());
		number3 = Integer.parseInt(sc.next());
		result = number1 * number2 * number3;

		System.out.printf("3개의 정수를 곱한 값은 : %d X %d X %d = %d", number1, number2, number3, result);
	}

}
