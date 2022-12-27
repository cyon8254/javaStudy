package castingTest;

public class Encryption {
	public static void main(String[] args) {
//		암호화

		String pw = "ehdtjrdl";
		String encryptedPw = ""; // 빈 문자열
		String decryptedPw = ""; // 빈 문자열
		final int KEY = 3; // 상수(변하지 않음)

		for (int i = 0; i < pw.length(); i++) { // pw 길이만큼 반복
			encryptedPw += (char) (pw.charAt(i) * KEY);
		}
		System.out.println(encryptedPw);

		for (int i = 0; i < encryptedPw.length(); i++) {
			decryptedPw += (char) (encryptedPw.charAt(i) / KEY);
		}
		System.out.println(decryptedPw);
	}
}