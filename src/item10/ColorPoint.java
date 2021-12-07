package item10;

import java.awt.Color;

public class ColorPoint extends Point {
	private final Color color;

	// equals 규약을 어긴 것은 아니지만 중요한 정보를 놓치게 됨.
	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	// 대칭성은 지켜지지만 추이성을 깨버리는 코드
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}

		if (!(obj instanceof ColorPoint)) {
			return obj.equals(this);
		}

		return super.equals(obj) && ((ColorPoint)obj).color == color;
	}

	public static void main(String[] args) {

		//대칭성은 지켜주지만 추이성을 깨버리는 예
		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));


	}
}
