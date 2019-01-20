public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(6, 5, 8);

        CountTriangle countTriangle = new CountTriangle();
        countTriangle.isRightTriangle(triangle1);
        countTriangle.isRightTriangle(triangle2);

        System.out.println("It is rectangular Triangle: " + triangle1.count);
        System.out.println("It isn't rectangular Triangle: " + triangle2.count);
    }
}
