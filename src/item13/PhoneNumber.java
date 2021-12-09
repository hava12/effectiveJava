package item13;

public class PhoneNumber {

	@Override
	public PhoneNumber clone() throws CloneNotSupportedException {
		try {
			return (PhoneNumber) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
