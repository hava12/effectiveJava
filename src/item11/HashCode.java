package item11;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HashCode {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hudson", "Java", "Study");

		// Contain 메소드의 시간복잡도는 O(n)
		if(words.contains("Hudson")) {
			System.out.println("Hudson Java Study");
		}
		// 이 때 HashTable을 사용하면 아주 효과적이다.
		// 해시테이블은 hashCode()메소드를 사용하여 주어진 키에 대한 해시값을 계산하고 내부적으로
		// 이 값을 사용하여 데이터를 저장하기 때문에 접근할 때 효율적이다.

	}

	public class User {
		private long id;
		private String name;
		private String email;

		// 잘못된 예
		// 동일한 hash값을 반환한다면 시간복잡도가 O(n)이기 때문에 시간복잡도 O(1)의 이점을 누릴 수 없다.
		// @Override
		// public int hashCode() {
		// 	return 1;
		// }

		//값이 중복될 확률이 낮다.
		// @Override
		// public int hashCode() {
		// 	return (int)id*name.hashCode()* email.hashCode();
		// }

		//Objects의 해시코드 구현 메서드를 이용
		@Override
		public int hashCode() {
			return Objects.hash(name, email);
		}

	}

}
