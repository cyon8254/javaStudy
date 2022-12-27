package ambiguityTest;

public class ClassC implements InterA, InterB {
	@Override
	public void printData() { // 재정의
		InterA.super.printData();
	}
}
