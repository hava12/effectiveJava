package item8.cleaner_as_a_saftynet;

public class Adult {

	public static void main(String[] args) {
		try (Room room = new Room(99)) {
			System.out.println("Peace out");
		} catch (Exception e) {
		}
	}
}
