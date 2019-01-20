public class CountTriangle {
    public boolean isRightTriangle(Triangle triangle) {
        triangle.count = triangle.getA() * triangle.getA() + triangle.getB() * triangle.getB() == triangle.getC() * triangle.getC();
        return triangle.count;
    }
}
