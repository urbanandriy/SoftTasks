package Task10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1)Reading File
                2)Remove element by Person id
                3)Write in file""");
        String input = scanner.next();
        switch (input) {
            case "1" -> System.out.println(operations.reading());
            case "2" -> {
                System.out.println("Enter id to remove");
                int idToRemove = scanner.nextInt();
                System.out.println(operations.remove(idToRemove));
            }
            case "3" -> {
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter surname");
                String surname = scanner.next();
                System.out.println("Enter age");
                int age = scanner.nextInt();
                System.out.println("enter id");
                int id = scanner.nextInt();
                operations.writing(name, surname, age, id);
            }
        }
    }
}
