package Task3;

import InputClases.InputClass;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        InputClass inputClass = new InputClases.InputClass();
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

            System.out.println("Do you wnt to continue?\n" + "YES/NO");
            String stop = inputClass.inputStr().toLowerCase();
            if (stop.equals("yes") || stop.equals("y")) {
                System.out.println("Next circle");
            } else loopSwitcher = false;
        }
        triangleList.sort(Comparator.comparing(Triangle::getArea));
        System.out.println(printing.print(triangleList));
    }
}
