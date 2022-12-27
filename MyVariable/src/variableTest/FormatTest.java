package variableTest;

public class FormatTest {

	public static void main(String[] args) {

//		이름, 나이, 몸무게 저장할 변수 선언
		String name = "박해준";
		int age = 26;
		double weight = 70.4;

		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n몸무게 : %.1fkg", age, weight);

	}

}
