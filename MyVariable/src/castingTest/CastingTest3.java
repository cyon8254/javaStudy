package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
//		문자열과 다른 일반 자료형 연결하면 항상 문자열
		System.out.println("1" + 3); // 13
		System.out.println("1" + 3 + 8); // 138
		System.out.println("1" + (3 + 8)); // 111
		System.out.println("1 더하기 3은 " + (1 + 3)); // 1더하기 3은 4

	}
}
