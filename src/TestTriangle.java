public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(6, 5, 8);

        System.out.println("It is rectangular Triangle: " + triangle1.isRightTriangle());
        System.out.println("It isn't rectangular Triangle: " + triangle2.isRightTriangle());
    }
}
