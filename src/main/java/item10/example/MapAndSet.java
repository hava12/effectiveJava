package item10.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

// Map의 key와 Set의 원소로 사용되기 위해서는 논리적 동치성을 잘 재정의해줘야 한다
public class MapAndSet {

	public static void main(String[] args) {
		Map<GoodClass, String> goodMap = new HashMap<>();
		Set<GoodClass> goodSet = new HashSet<>();

		GoodClass goodClassOne = new GoodClass(10);
		GoodClass goodClassTwo = new GoodClass(10);

		goodMap.put(goodClassOne, "100");
		System.out.println("[GoodMap] good contains : " + goodMap.containsKey(goodClassTwo));

		goodSet.add(goodClassOne);
		System.out.println("[GoodSet] good contains : " + goodSet.contains(goodClassTwo));

		Map<BadClass, String> badMap = new HashMap<>();
		Set<BadClass> badSet = new HashSet<>();

		BadClass badClassOne = new BadClass(10);
		BadClass badClassTwo = new BadClass(10);

		badMap.put(badClassOne, "100");
		System.out.println("[BadMap] bad contains : " + badMap.containsKey(badClassTwo));

		badSet.add(badClassOne);
		System.out.println("[BadSet] bad contains : " + badSet.contains(badClassTwo));

	}

	public static class GoodClass {
		final long id;

		public GoodClass(long id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			GoodClass goodClass = (GoodClass)o;
			return id == goodClass.id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
	}

	public static class BadClass {
		final long id;

		public BadClass(long id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			return false;
		}
	}
}
