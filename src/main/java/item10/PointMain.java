package item10;

public class PointMain {

    public static void main(String[] args) {
        SmellPoint smellPoint = new SmellPoint(1, 1);
        ColorPoint colorPoint = new ColorPoint(1, 1, Color.BLUE);

        smellPoint.equals(colorPoint);
    }
}
