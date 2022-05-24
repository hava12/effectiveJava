package item10.example;

import java.util.Objects;

public class People {

	final String regNo;
	String name;
	int age;

	public People(String regNo) {
		this.regNo = regNo;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || !(o instanceof People)) {
			return false;
		}

		People people = (People)o;
		return regNo.equals(people.regNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regNo);
	}
}
