package item10;

public class SmellPoint extends Point{

    public SmellPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        // o가 일반 Point이면 색상을 무시하고 비교한다.
        // 굉장히 위험한 코드.. StackOverFlow 발생 가능..
        if (!(obj instanceof SmellPoint)) {
            System.out.println("Smell Point Equals");
            return obj.equals(this);
        }

        return super.equals(obj);
    }
}
