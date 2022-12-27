package controllTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int firstNumber = 0, lastNumber = 0;
		String massage = "두 정수 입력 : ", resultMessage = null;
		Scanner sc = new Scanner(System.in);

		System.out.print(massage);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();

		if (firstNumber > lastNumber) {
			resultMessage = "큰 값 :" + firstNumber;
		} else if (firstNumber != lastNumber) {
			resultMessage = "큰 값 :" + lastNumber;
		} else {
			resultMessage = "두 수가 같습니다.";
		}
		System.out.println(resultMessage);
	}

}
