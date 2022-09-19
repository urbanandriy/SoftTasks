package Task7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Row row = new Row();
        System.out.println("Enter num:");
        int num = scanner.nextInt();
        System.out.println(row.create(num));
    }
}
