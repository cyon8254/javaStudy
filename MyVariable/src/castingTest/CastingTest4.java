package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {

//		Integer.parseInt(""); => 문자열에서 변환된 정수값
//		Double.parseDouble(""); => 문자열에서 변환된 실수값

		System.out.println(Integer.parseInt("1") + 3 + 9);

//		"3.9"+9 의 결과를 12.9로 출력한다.
		System.out.println(Double.parseDouble("3.9") + 9);
	}
}
