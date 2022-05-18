package item8.cleaner_as_a_saftynet;

public class Teenager {
	public static void main(String[] args) {
		Room room = new Room(99);
		System.out.println("Peace out");

		// 다음 줄의 주석을 해제한 후 동작을 다시 확인해보자.
		// 단, 가비지 컬렉터를 강제로 호출하는 이런 방식에 의존해서는 절대 안된다.
		System.gc();
	}
}
