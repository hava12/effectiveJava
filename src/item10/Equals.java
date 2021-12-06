package item10;

public class Equals {
	// equals가 실수라도 호출되는 것을 막고자 하는 경우
	@Override
	public boolean equals(Object obj) {
		throw new AssertionError(); // 호출 금지
	}
}
