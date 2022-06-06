package item13;

import item11.hashcode.PhoneNumber;
import java.util.Arrays;
import java.util.EmptyStackException;

// Stack의 복제 가능 버전
public class Stack implements Cloneable {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null; // 다 쓴 참조 해제
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	protected Stack clone() {
		try {
			Stack result = (Stack) super.clone();
			result.elements = elements.clone();
			return result;
 		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

	public static void main(String[] args) {
		Object[] values = new Object[2];
		values[0] = new PhoneNumber(123, 456, 7890);
		values[1] = new PhoneNumber(321, 764, 2341);

		Stack stack = new Stack();
		for (Object arg : values) {
			stack.push(arg);
		}
		Stack copy = stack.clone();

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}

		while (!copy.isEmpty()) {
			System.out.println(copy.pop() + " ");
		}
		System.out.println(stack.elements[0] == copy.elements[0]);
 	}

}
