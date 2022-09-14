package Task3;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        StringParser stringParser = new StringParser();
        TriangleCreator creator = new TriangleCreator();
        ArrayList<Triangle> triangleList = new ArrayList<>();
        Printing printing = new Printing();
        Scanner scanner = new Scanner(System.in);
        boolean loopSwitcher = true;
        while (loopSwitcher) {

        System.out.println("Enter triangle name and parameters. \n" + "It must look like <name>,<a>,<b>,<c>");
        String[] output = stringParser.parse(scanner.nextLine());
        triangleList.add(creator.create(output));

            System.out.println("Do you wnt to continue?\n"+"YES/NO");
            String stop = scanner.next();
            if (stop.equalsIgnoreCase("yes")|| stop.equalsIgnoreCase("y")){
                loopSwitcher=false;
            }
    }
        triangleList.sort(Comparator.comparing(Triangle::getArea));
        printing.print(triangleList);
    }
}
