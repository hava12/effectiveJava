package item10;
public class ColorPoint extends Point {
	// 필드를 추가했을때 추이성, 대칭성을 충족시키는 방법이 존재하지 않는다.
	// 때문에 composition을 권장한다.
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

		// o가 일반 Point이면 색상을 무시하고 비교한다.
		// 굉장히 위험한 코드.. StackOverFlow 발생 가능..
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
