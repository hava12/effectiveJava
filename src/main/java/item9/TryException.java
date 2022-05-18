package item9;

public class TryException {

	public static void main(String[] args) throws Exception {

		// Try Finally Case
		// CloseableObject closeable = new CloseableObject();
		// try {
		// 	System.out.println("비즈니스 수행 : " + closeable.business());
		// 	throw new RuntimeException("Error");
		// } finally {
		// 	closeable.close();
		// }

		// Try with resource Case
		try ( CloseableObject closeableObject = new CloseableObject()) {
			System.out.println("비즈니스 수행 : " + closeableObject.business());
			throw new RuntimeException("Error");
		}

	}
}
