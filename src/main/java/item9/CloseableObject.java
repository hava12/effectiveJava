package item9;

public class CloseableObject implements AutoCloseable {

	public String business() {
		return "수행";
	}
	@Override
	public void close() throws Exception {
		throw new RuntimeException("예외발생");
	}
}
