package inheritanceTest;

class Human {
	void eat() {
		System.out.println("먹기");
	}

	void sleep() {
		System.out.println("잠자기");
	}

	void walk() {
		System.out.println("두 발로 걷기");
	}
}

//     자식           부모
class Monkey extends Human {
	void 이잡아라() {
		System.out.println("이잡기");
	}

	@Override // @ 어노테이션
	void walk() { // 재정의
//		부모의 코드를 그대로 사용하고자 할때
		super.walk();
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();

	}
}
