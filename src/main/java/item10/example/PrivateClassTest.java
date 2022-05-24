package item10.example;

public class PrivateClassTest {

	public long getId() {
		PrivateClass privateClass = new PrivateClass(11);
		return privateClass.getId();
	}

	private class PrivateClass {
		private final long id;

		private PrivateClass(long id) {
			this.id = id;
		}

		public long getId() {
			return id;
		}
	}
}
