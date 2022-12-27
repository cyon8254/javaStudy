package classTest;

class A {
	int data;

	A(int data) {
		// this 접근한 객체 주소값
		this.data = data;
	}

	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A(10);

		a.printData();
	}

}
