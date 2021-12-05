package item8;

import sun.misc.Cleaner;

public class Room implements AutoCloseable {
	//private static final Cleaner cleaner = Cleaner.create();

	//private final Cleaner.Cleanable cleanable;

	private final State state;

	public Room(int numJunkPies) {
		state = new State(numJunkPies);
	//	cleanable = cleaner.register(this, state);
	}

	private class State implements Runnable {
		int numJunkPiles;

		State(int numJunkPiles) {
			this.numJunkPiles = numJunkPiles;
		}

		@Override
		public void run() {
			System.out.println("방 청소");
			numJunkPiles = 0;
		}
	}

	@Override
	public void close() throws Exception {
	//	cleanable.clean();
	}
}
