package item8;

public class FinalizerIsBad {

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
