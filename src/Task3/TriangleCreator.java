package Task3;

public class TriangleCreator {
    public Triangle create(String[] parameters){
        double a = Double.parseDouble(parameters[1]);
        double b = Double.parseDouble(parameters[2]);
        double c = Double.parseDouble(parameters[3]);
        return new Triangle(parameters[0],a,b,c);
    }
}
