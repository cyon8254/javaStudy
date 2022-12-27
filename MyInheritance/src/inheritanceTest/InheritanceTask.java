package inheritanceTest;

class Car {

//	브랜드, 색상, 가격
	String brand;
	String color;
	int price;

	public Car() {
		;
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

//	열쇠로 시동 킴
	void enginStart() {
		System.out.println("열쇠로 시동 킴");
	}

//	열쇠로 시동 끔
	void enginStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

class SuperCar extends Car {

//	모드
	String mode;

//	자식 기본 생성자는 부모의 기본 생성자를 호출한다.
//	부모에 기본 생성자가 없으면 자식의 기본 생성자는 오류가 발생한다.
	public SuperCar() {
		;
	}

	public SuperCar(String brand, String color, int price, String mode) {
//		부모의 생성자 중 3개의 값을 전달받는 생성자 호출
		super(brand, color, price);
		this.mode = mode;
	}

//	음성으로 시동 킴
	@Override
	void enginStart() {
		super.enginStart();
		System.out.println("음성으로 시동 킴");
	}

//	음성으로 시동 끔
	@Override
	void enginStop() {
		System.out.println("음성으로 시동 끔");
	}

//	지붕 열기
	void roofOpen() {
		System.out.println("지붕 열림");
	}

//	지붕 닫기
	void roofClose() {
		System.out.println("지붕 닫힘");
	}

}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar rollsroyce = new SuperCar();
		rollsroyce.enginStart();
		rollsroyce.enginStop();
		rollsroyce.roofOpen();
		rollsroyce.roofClose();
	}
}
