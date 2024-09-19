package Lab.src;

public class Rectangle {
    double side1, side2, diagonal;

    private Rectangle(){}

    public static Rectangle createRectangleBySides(double s1, double s2) {
        Rectangle newRec = new Rectangle();
        newRec.side1 = s1;
        newRec.side2 = s2;
        newRec.diagonal = Math.sqrt(s1 * s1 + s2 * s2);
        return newRec;
    }

    public static Rectangle createRectangleBySideAndDiag(double s1, double diagonal) {
        Rectangle newRec = new Rectangle();
        newRec.side1 = s1;
        newRec.diagonal = diagonal;
        newRec.side2 = Math.sqrt(diagonal * diagonal - s1 * s1);
        return newRec;
    }

    public double computeArea() {
        return side1 * side2;
    }
}
