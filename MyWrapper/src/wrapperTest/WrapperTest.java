package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10;

//		boxing
//		Integer data_I=new Integer(data_i);
//		Integer data_I = Integer.valueOf(data_i);

//		auto boxing
//		클래스 타입으로 사용하려 박싱함
		Integer data_I = data_i;

//		unboxing
//		data_i = data_I.intValue();

//		auto unboxing
		data_i = data_I;
	}
}