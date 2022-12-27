package jobTask;

import java.util.Random;

public class OakSeller {

	String[] table = { "사원", "팀장", "다이아" };
	int[] pay = { 0, 10_000, 100_000 };
	int[] incomes = { 1_000, 3_000, 9_000 };

	String name;
	int positionNumber;
	int successRating;
	int income;
	int count;

	Random r = new Random();

	public OakSeller() {
		this("박해준", 0);
	}

	public OakSeller(String name, int positionNumber) {
		this.name = name;
		this.positionNumber = positionNumber;
		this.successRating = 50; // 성공 확률
	}

	int sell() { // 성공 : 0, 대성공 : 1, 실패 : -1
		if (rate(successRating)) { // 성공 확률 50%
			count = 0; // 성공시 연속 실패 횟수 0
			if (rate(20)) { // 대성공 20%
				income += incomes[positionNumber] * 3; // 받는 돈 곱하기 3
				successRating += 5; // 성공확률 +5
				return 1; // 1 대성공
			}
			income += incomes[positionNumber]; // 돈 플러스 해주기
			successRating -= 2; // 성공확률 -2
			return 0; // 0 성공
		}
		// 실패
		count++; // 실패 카운트 추가
		income -= 2_000; // 돈 2000만원 빼기
		successRating += 5;
		return -1; // -1 실패
	}

	void demote() {
		positionNumber--; // 강등, 좌천
	}

	boolean promote() {
		income -= pay[positionNumber + 1];
		if (positionNumber == 0 ? rate(30) : rate(10)) { // 팀장 진급 성공확률30 다이아 진급 성공확률10
			positionNumber++;
			return true;
		}
		return false;
	}

	boolean rate(int rating) {
		int[] percent = new int[100];
		for (int i = 0; i < rating; i++) {
			percent[i] = 1;
		}

		return percent[r.nextInt(percent.length)] == 1;
	}
}
