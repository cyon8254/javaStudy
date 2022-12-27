package collectionTest;

public class StreamTask {
	public static void main(String[] args) {
//      1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);

//      1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.rangeClosed(1, 100).filter(v -> v % 2 != 0).forEach(System.out::println);
//		IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(System.out::println);

//      ABCDEF를 각 문자별로 출력
//		String data = "ABCDEF";
//		data.chars().forEach(v -> System.out.println((char) v));
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char) c));

//      A~F까지 ArrayList에 담고 출력
//		ArrayList<Character> datas = new ArrayList<>();
//		IntStream.rangeClosed('A', 'F').forEach(i -> datas.add((char) i));
//		System.out.println(datas);

//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Character> datas = new ArrayList<>();
//		IntStream.range(0, 5).map(v -> (v > 2 ? v + 1 : v)).forEach(v -> datas.add((char) (v + 65)));
//		IntStream.rangeClosed('A', 'F').map(v -> (v > 67 ? v + 1 : v)).forEach(v -> datas.add((char) (v + 65)));		
//		System.out.println(datas);

//      5개의 문자열을 입력받은 후 모두 소문자로 변경(String.toLowerCase())
//		System.out.println("ABC".toLowerCase());
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);

//      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas = new ArrayList<>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream().filter(fruit -> fruit.charAt(0) >= 'A').filter(fruit -> fruit.charAt(0) <= 'Z')
//				.forEach(System.out::println);

//      한글을 정수로 변경
//		String hangle = "공일이삼사오육칠팔구";
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		String data = sc.next();

		// 문자열을 IntStream으로 변경 후 map에서 각 문자에 대한 번호를 indexOf에 전달한다.
		// 해당 문자에 맞는 값을 hangle에서 찾은 후 해당 인덱스 번호를 가져와 기존의 c의 값을 대체한다.
//		data.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
//		data.chars().map(hangle::indexOf).forEach(System.out::print);

//      정수를 한글로 변경
//		String hangle = "공일이삼사오육칠팔구";
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		String data = sc.next();

		// 문자열을 IntStream으로 변경 후 map에서 각 문자에 대한 번호에서 48을 빼주어야 입력한 정수값이 된다.
		// 입력한 정수를 hangle의 인덱스번호로 사용하여 해당 문자를 가져온다.
//		data.chars().map(c -> c - 48).forEach(c -> System.out.print(hangle.charAt(c)));

	}
}