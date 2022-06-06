package item11.hashtable;

import item11.hashcode.PhoneNumber;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<PhoneNumber, String> map = new HashMap<>();
		PhoneNumber number1 = new PhoneNumber(123, 456, 7890);
		PhoneNumber number2 = new PhoneNumber(456, 456, 7890);

		System.out.println(number1.equals(number2));
		System.out.println(number1.hashCode());
		System.out.println(number2.hashCode());

		map.put(number1, "hudson");
		map.put(number2, "dongyeop");

		String s = map.get(number2);
		String s2 = map.get(new PhoneNumber(123, 456, 7890));
		System.out.println(s);
		System.out.println(s2);

	}
}
