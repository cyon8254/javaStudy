package collectionTest;

public class ForEachTest {
	public static void main(String[] args) {
		int[][] arrData = { { 10, 30, 80 }, { 20, 40, 10 } };
//	각 학생의 총점과 평균
		int sum = 0;
		double avg = 0.0;
		for (int[] arData : arrData) {
			sum = 0;
			for (int score : arData) {
				sum += score;
			}
			avg = sum / (double) arData.length;
			avg = Double.parseDouble(String.format("%.2f", avg));
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
		}

	}
}
