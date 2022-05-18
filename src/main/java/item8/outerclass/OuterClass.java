package item8.outerclass;

import java.lang.reflect.Field;

// 정적이 아닌 중첩 클래스
// Inner  클래스는 Outer Class 에 굉장히 종속적
public class OuterClass {

	private void hi() {
		System.out.println("hi");
	}

	class InnerCLass {
		private void hello(){
			OuterClass.this.hi();
		}
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		InnerCLass innerCLass = outerClass.new InnerCLass();

		System.out.println(innerCLass);

		outerClass.printFields();
	}

	private void printFields() {
		Field[] declaredFields = InnerCLass.class.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println("field type : " + field.getType());
			System.out.println("field name : " + field.getName());
		}
	}
}
