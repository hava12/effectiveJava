package item8.finalizer;

public class FinalizerIsBad {

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
