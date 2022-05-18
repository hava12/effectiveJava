package item8.cleaner_as_a_saftynet;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
	private static final Cleaner cleaner = Cleaner.create();

	private static class State implements Runnable {

		int numJunkPiles; // Number of junk piles in this room
		State(int numJunkPiles) {
			this.numJunkPiles = numJunkPiles;
		}

		@Override
		public void run() {
			System.out.println("Cleaning Room");
			numJunkPiles = 0;
		}
	}

	// 방의 상태. cleanable과 공유한다.
	private final State state;

	// cleanable 객체. 수거 대상이 되면 방을 청소한다.
	private final Cleaner.Cleanable cleanable;

	public Room(int numJunkPiles) {
		this.state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	// cleanable 객체. 수거 대상이 되면 방을 청소한다.
	@Override
	public void close() throws Exception {
		cleanable.clean();
	}
}
