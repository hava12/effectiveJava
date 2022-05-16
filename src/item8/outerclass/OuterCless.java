package item8.outerclass;

import java.lang.reflect.Field;

public class OuterCless {

	class InnerCLass {

	}

	public static void main(String[] args) {
		OuterCless outerCless = new OuterCless();
		InnerCLass innerCLass = outerCless.new InnerCLass();
		System.out.println(innerCLass);

		outerCless.printConstructor();
	}

	private void printConstructor() {
		Field[] declaredFields = InnerCLass.class.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println("field type : " + field.getType());
			System.out.println("field name : " + field.getName());
		}
	}
}
