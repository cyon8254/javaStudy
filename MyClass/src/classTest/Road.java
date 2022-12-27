package classTest;

class Car {
//	전역변수는 자동초기화 된다.
	String brand;
	String color;
	int price;

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Car(String color) {
		brand = "자동차";
		this.color = color;
	}

	void enginStart() {
		System.out.println(brand + " 시동 켜기");
	}

	void enginStop() {
		System.out.println(brand + " 시동 끄기");
	}
}

public class Road {
//	실행 프로그램을 만들어주는 메소드
	public static void main(String[] args) {
//	객체(주소값 담겨있음)생성자
		Car momCar = new Car("Benz", "Black", 10_000);
		Car dadyCar = new Car("BMW", "Blue", 8_000);
		Car myCar = new Car("Red");

		momCar.enginStart();
		dadyCar.enginStart();
		myCar.enginStart();
	}

}
