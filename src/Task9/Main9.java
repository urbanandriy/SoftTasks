package Task9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        DegreeMagic dm = new DegreeMagic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:\n"+"first...");
        int a = scanner.nextInt();
        System.out.println("second....");
        int b = scanner.nextInt();
        System.out.println("Answer: "+dm.calculate(a,b));
    }
}
