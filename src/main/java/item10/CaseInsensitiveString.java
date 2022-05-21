package item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 대칭성을 위배하는 코드
// 코드 10-1 잘못된 코드 - 대칭성 위배 (54-55쪽)
public class CaseInsensitiveString {
	public static void main(String[] args) {
		CaseInsensitiveString cis =  new CaseInsensitiveString("Polish");
		String s = "polish";

		//대칭성 위배
			System.out.println(cis.equals(s)); // true
		System.out.println(s.equals(cis)); // false

		List<CaseInsensitiveString> list = new ArrayList<>();
		list.add(cis);

		System.out.println(list.contains(s));
	}
	private final String s;
	public CaseInsensitiveString(String s) {
		this.s = Objects.requireNonNull(s);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CaseInsensitiveString) {
			return s.equalsIgnoreCase(((CaseInsensitiveString)obj).s);
		}
		if (obj instanceof String) { // 한 방향으로만 작동한다.
			return s.equalsIgnoreCase((String) obj);
		}
		return false;
	}

}

