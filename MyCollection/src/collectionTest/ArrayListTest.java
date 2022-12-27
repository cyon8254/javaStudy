package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void test(int data) {
		data = 20;
	}

	public static void main(String[] args) {

		int data = 10;
		ArrayListTest.test(data);
		System.out.println(data);
//		<?> : 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법.
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없다.
//		지정할 타입에 제한을 줄 수 있다.

//		무조건 0칸
		ArrayList<Integer> datas = new ArrayList<>(); // 생성자쪽 꺽새는 생략 가능 이미 앞에서 해서

		datas.add(10);
		datas.add(20);
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(80);
		datas.add(70);
		datas.add(60);

//		System.out.println(datas.size());
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//	}

//		toString재정의 되어있음
		System.out.println(datas);

//		Collections : 여러가지 알고리즘이 만들어져있
		Collections.sort(datas);
		System.out.println(datas);

		Collections.reverse(datas);
		System.out.println(datas);

		Collections.shuffle(datas);
		System.out.println(datas);

//		추가(삽입)
//		50 뒤에 500삽입
//		if (datas.contains(50)) {
////			50뒤에 삽입이니까 +1해줌
//			datas.add(datas.indexOf(50) + 1, 500);
//		}
//		System.out.println(datas);

//		수정
//		90을 9로 수정
//		90이 존재하는지
		if (datas.contains(90)) {
			System.out.println(datas.set(datas.indexOf(90), 9) + "이 9로 변경되었습니다.");
		}
		System.out.println(datas);

//		삭제
//		80삭제
//		1. 인덱스로 삭제
//		if (datas.contains(80)) {
//			System.out.println(datas.remove(datas.indexOf(80)) + "삭제");
//		}
//		System.out.println(datas);

//		2. 값으로 삭제
//		int 타입인 80이란 값을 박싱을 해서 Object 타입 Integer타입으로 바꿔줌
//		if (datas.remove(Integer.valueOf(80))) {
//			System.out.println("삭제 완료");
//		}
//		System.out.println(datas);
//	}
	}
}