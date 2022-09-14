package Task3;

public class Triangle {
    String name;
    double side1;
    double side2;
    double side3;
    double area=calculateArea(side1,side2,side3);

    public Triangle(String name,double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double calculateArea (double a,double b, double c) {
            double p = a+b+c;
           return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
