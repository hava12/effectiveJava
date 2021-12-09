package item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// Comparable을 구현한 클래스
public class WordList {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<>();
		Collections.addAll(s, args);
		System.out.println(s);
	}
}
