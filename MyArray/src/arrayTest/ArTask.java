package arrayTest;

public class ArTask {
	public static void main(String[] args) {

//		브론즈
//		1~10까지 배열에 담고 출력

//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}

//		10~1까지 중 짝수만 배열에 담고 출력

//		int[] arData = new int[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}

//		1~100까지 배열에 담은 후 홀수만 출력

//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) { // 배열의 길이만큼 반복(100번), 0~99
//		각 방에 1부터 100까지 순서대로 담는다.
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i] % 2 == 1) {
//				System.out.print(arData[i] + " ");
//			}
//		}

//		실버
//		1~100까지 배열에 담은 후 짝수의 합 출력

//		int sum = 0;
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i] % 2 == 0) {
//				sum += arData[i];
//			}
//		}
//		System.out.println(sum);

//		A~F까지 배열에 담고 출력

//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char) (i + 65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}

//		A~F까지 중 C제외하고 배열에 담은 후 출력

//		char[] arData = new char[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = ((char) (i > 1 ? i + 66 : i + 65));
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}

//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력

//		String msg = "정수 5개를 입력해 주세요 : ";
//		int max = 0, min = 0;
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		System.out.print(msg);
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//		max = arData[0];
//		min = arData[0];
//		for (int i = 1; i < arData.length; i++) {
//			if (arData[i] > max) {
//				max = arData[i];
//			}
//			if (arData[i] < min) {
//				min = arData[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);

//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기

//		int count = 0, sum = 0;
//		double avg = 0.0;
//		String countingmsg = "정수 개수 : ", msg = "번째 정수 : ", avgMsg = "평균 : ";
//		int[] arData = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.print(countingmsg);
//		count = sc.nextInt();
//		arData = new int[count];
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + msg);
//			arData[i] = sc.nextInt();
//
//		}
//		for (int i = 0; i < arData.length; i++) {
//			sum += arData[i];
//		}
//		avg = (double) sum / arData.length;
////		소수점 둘 째 자리까지 나누기 위해서, String 클래스의 format 메소드를 사용한다.
//		avg = Double.parseDouble(String.format("%.2f", avg));
//		System.out.println(avgMsg + avg);
	}

}
