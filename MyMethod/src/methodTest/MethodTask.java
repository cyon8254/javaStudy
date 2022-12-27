package methodTest;

public class MethodTask {

//	1~10까지 println()으로 출력하는 메소드

	void printNumber() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"홍길동"을 n번 println()으로 출력하는 메소드

	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}

//	이름을 n번 println()으로 출력하는 메소드

	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//	세 정수의 뺄셈을 해주는 메소드

	int subtract(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}

//	두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다)

	int[] divide(int num1, int num2) {

		int[] result = null; // 배열 생성

		if (num2 != 0) { // 0으로는 나눌수 없으니 수 2 가 0이 아닐때
			result = new int[2];

			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		return result;
	}

//	1~n까지의 합을 구해주는 메소드
	int add(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i + 1;
		}
		return result;
	}

//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int change(int num) {
		return ++num;
	}

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeBigSmall(String input) {
		String[] result = null;
		String after = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (65 <= c && 90 >= c) {
				after += (char) (c + 32); // 문자 정수 연산하면 정수 나오니까 형 변환
			} else if (96 <= c && 122 >= c) {
				after += (char) (c - 32);
			} else
				after += c;
		}
		return after;
	}

//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int getCount(String string, char c) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
//	5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드

	int getValue(int[] nums, int number) {
		return nums[number - 1];
	}

//	한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024), indexOf()사용
//	"공일이삼사오육칠팔구"
//	"일공이사"

	int changeToInteger(String hangle) {
		String hangleOriginal = "공일이삼사오육칠팔구", result = "";
		for (int i = 0; i < hangle.length(); i++) {
			hangleOriginal.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}

//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드

	int[] getMaxAndMin(int[] nums) {
		int[] results = new int[2]; // return을 두번 할수 없으니 배열 생성
		results[0] = nums[0]; // 최대값
		results[1] = nums[0]; // 최소값

		for (int i = 0; i < nums.length; i++) {
			if (results[0] < nums[i]) {
				results[0] = nums[i];
			}
			if (results[1] < nums[i]) {
				results[1] = nums[i];
			}

		}
		return results;
	}

//	어려움★★★★★
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void로 하되, 출력 없이 사용하는 부분에 결과를 전달한다)
//	매개변수는 2개 전달해야 한다.
//	예) getMaxAndMin();
//		여기서부터 최대값, 최소값 사용 가능

	void getMaxAndMin(int[] nums, int[] results) {
		results[0] = nums[0]; // 최대값
		results[1] = nums[0]; // 최소값

		for (int i = 0; i < nums.length; i++) {
			if (results[0] < nums[i]) {
				results[0] = nums[i];
			}
			if (results[1] < nums[i]) {
				results[1] = nums[i];
			}

		}

	}

	public static void main(String[] args) {
		MethodTask mt = new MethodTask();

//		mt.printNumber();
//		mt.printHong(10);
//		mt.printName("박해준", 10);
//		System.out.println(mt.subtract(5, 4, 2));
//		int[] result = mt.divide(10, 5);
//		String msg = null;
//		msg = result == null ? "0으로 나눌 수 없습니다." : "몫 : " + result[0] + "\n나머지 : " + result[1];
//		System.out.println(msg);
//		System.out.println();
//		System.out.println(mt.add(5));
//		System.out.println(mt.change(1));
//		System.out.println(mt.changeBigSmall("ApPlEgOoD"));

//		getMaxAndMin(arData,result);
//		result[0],result[1]
//		1~n까지의 합을 구해주는 메소드
//		int add(int num)
//		System.out.println(mt.add(10));

//		홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//		int change(int num)
//		System.out.println(mt.change(2));

//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//		String changeBigSmall(String input)
//		System.out.println(mt.changeBigSmall("aPPle"));

//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//		int getCount(String string, char c)
//		System.out.println(mt.getCount("apple", 'p') + "개");

//		5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
//		int getValue(int[] nums, int number)
//		int[] arData = { 1, 2, 5, 7, 8 };
//		System.out.println(mt.getValue(arData, 3));

//		한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024), indexOf()사용
//		"공일이삼사오육칠팔구"
//		"일공이사"
//		int changeToInteger(String hangle)
//		int result = mt.changeToInteger("삼공오이사");
//		System.out.println(result-3);

	}
}