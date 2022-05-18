package item8;

import item8.finalizer.FinalizerIsBad;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

// 핵심 : 객체 내부에서 비 메모리 자원을 사용한다면 명시적 종료 메소드를 제공해야 한다.
// 이유
// 1. 가비지 컬렉션은 메모리만 수집한다.
// 2. 가비지 컬렉션이 수거하지 않는 비 메모리 자원에 대해서는
// 프로그래머가 관리 해야 한다.

public class App {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		int i =0;
		while (true) {
			i++;
			new FinalizerIsBad();
			if ((i % 1_000_000) == 0) {
				Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
				Field queueStaticField = finalizerClass.getDeclaredField("queue");
				queueStaticField.setAccessible(true);
				ReferenceQueue<Object> referenceQueue = (ReferenceQueue)queueStaticField.get(null);

				Field queueLengthField = ReferenceQueue.class.getDeclaredField("queueLength");
				queueLengthField.setAccessible(true);
				long queueLength = (long) queueLengthField.get(referenceQueue);
				System.out.format("There are %d references in the queue\r\n", queueLength);

			}
		}
	}
}
