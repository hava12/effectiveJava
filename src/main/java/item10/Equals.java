package item10;

public class Equals {
	// equals를 재정의하지 않는 것이 최선
	// equals가 실수라도 호출되는 것을 막고자 하는 경우
	// 인스턴스가 하나만 새성되는 경우 참조 주소값만 비교하면 되기 때문에 재정의할 필요가 없다.

	// 논리적 동치성을 검사할 필요가 없다.

	// 상위 클래스에서 재정의한 equals가 하위 클래스에도 적절하다.

	// 클래스가 private 이거나 package-private이고 equals메서드를 호출할 일이 없다.
	@Override
	public boolean equals(Object obj) {
		throw new AssertionError(); // 호출 금지
	}
}
