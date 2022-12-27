package collectionTest;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> bloodTypes = new HashSet<String>();
		bloodTypes.add("A");
		bloodTypes.add("B");
		bloodTypes.add("O");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");

//		System.out.println(bloodTypes);
//
//		Iterator<String> iter = bloodTypes.iterator();
//
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}
}
