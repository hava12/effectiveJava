package item13;

public class PhoneNumber {

	@Override
	// public 인 clone 메서드에서는 throws 절을 없애야 한다.
	public PhoneNumber clone() {
		try {
			return (PhoneNumber) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
