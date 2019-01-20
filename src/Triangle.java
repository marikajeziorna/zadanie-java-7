public class Triangle {
    private int a;
    private int b;
    private int c;
    boolean count;

    public Triangle(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}

