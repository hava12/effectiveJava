package item11.hashcode;

import java.util.Objects;

public final class PhoneNumber {
	private final short areaCode, prefix, lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max) {
			throw new IllegalArgumentException(arg + ": " + val);
		}
		return (short) val;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber that = (PhoneNumber)o;
		return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
	}

	// @Override
	// public int hashCode() {
	// 	return 42;
	// 	// return Objects.hash(areaCode, prefix, lineNum);
	// }

	// 전형적인 hashcode 구하는 방법
	// 왜 하필이면 31 - 홀수를 써야 햇다. 뒤에 0이 채워져서 숫자가 많이 날아갈 수 있다.?
	// 왜 하필 31이냐. 해시를 할 때 사전에 들어있는 모든 단어를 해시를 할 때 31이 해시충돌이 가장 적었음.
	// @Override
	// public int hashCode() {
	// 	int result = Short.hashCode(areaCode);
	// 	result = 31 * result + Short.hashCode(prefix);
	// 	result = 31 * result + Short.hashCode(lineNum);
	// 	return result;
	// }

	// 인텔리 제이에 맡긴 해시코드 메서드
	@Override
	public int hashCode() {
		return Objects.hash(areaCode, prefix, lineNum);
	}
}
