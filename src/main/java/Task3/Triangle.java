package Task3;

public class Triangle {
    private final String name;
    private final double area;

    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.area = calculateArea(side1, side2, side3);
    }

    private double calculateArea(double a, double b, double c) {
        double p = a + b + c;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.area, area) != 0) return false;
        return name.equals(triangle.name);
    }
}
