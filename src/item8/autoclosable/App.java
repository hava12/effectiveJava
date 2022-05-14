package item8.autoclosable;

public class App {

	public static void main(String[] args) {
		try (AutoCloseable good = new AutoClosableIsGood()) {
			System.out.println("good = " + good);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
