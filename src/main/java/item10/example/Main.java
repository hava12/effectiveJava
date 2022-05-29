package item10.example;

import java.net.URL;

public class Main {
	public static void main(String[] args) {

		// 상위 클래스에서 재정의한 equals가 하위 클래스에도 딱 들어맞음
		// EximPeople eximPeople = new EximPeople("921103-1111111");
		// People people = new People("921103-1111111");
		//
		// System.out.println(eximPeople.equals(people));
		// System.out.println(people.equals(eximPeople));

		PrivateClassTest privateClassTest = new PrivateClassTest();

	}
}
