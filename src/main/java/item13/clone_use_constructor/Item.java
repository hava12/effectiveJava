package item13.clone_use_constructor;

public class Item implements Cloneable {

	private String name;

	/**
	 * 이렇게 구현하면 하위 클래스의 clone()이 깨질 수 있다.
	 * @return
	 */
	@Override
	protected Object clone() {
		// 생성자를 통해 호출하면 안됌
		// Item item = new Item();
		// item.name = this.name
		// return item;

		Item result = null;
		try {
			result = (Item) super.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

}
