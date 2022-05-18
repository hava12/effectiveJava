package item8.finalizer.attack;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

	@Test
	void ordinaryAccount() {
		Account account = new Account("Hudson");
		account.transfer(BigDecimal.valueOf(10.4),"hello");
	}

	@Test
	void pootinAccount() {
		Account account = null;
		try {
			account = new BrokenAccount("푸틴");
		} catch (Exception exception) {
			System.out.println("에러");
		}
		System.out.println(account);
		System.gc();
	}
}