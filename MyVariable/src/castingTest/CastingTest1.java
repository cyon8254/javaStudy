package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println(11 / 9); // 1
		System.out.println(11 / 9.0); // 1.2222222222222223

//		강제 형변환
		System.out.println(11 / (double) 9); // 1.2222222222222223
		System.out.println((int) 8.43 + 2.59); // 10.59
		System.out.println((int) (8.43 + 2.59)); // 11
//		8.43 + 2.59 = 10
		System.out.println((int) 8.43 + (int) 2.59); // 10
	}
}
