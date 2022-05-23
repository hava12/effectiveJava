package item10.example;

public class ThreadExample {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			System.out.println("스레드는 동작을 표현한다");
		});

		thread.start();
	}
}
