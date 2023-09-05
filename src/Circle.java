public class Circle extends Shape {
    private static final double PI = Math.PI;
    private double diametr;

    public Circle(double diametr) {
        this.diametr = diametr;
    }
    public double area(){
        double radius = diametr / 2.0;
        return PI * radius * radius;
    }
}
