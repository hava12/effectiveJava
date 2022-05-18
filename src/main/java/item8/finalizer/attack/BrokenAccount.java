package item8.finalizer.attack;

import java.math.BigDecimal;

public class BrokenAccount extends Account {
	public BrokenAccount(String accountId) {
		super(accountId);
	}

	// finalize Attack을 방지하여 오버라이딩 불가
	// @Override
	// protected void finalize() throws Throwable {
	// 	this.transfer(BigDecimal.valueOf(1000004), "hello");
	// }
}

