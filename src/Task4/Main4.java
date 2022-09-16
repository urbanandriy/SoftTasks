package Task4;

import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Parse p1 = new Parse();
        Searching searching = new Searching();
        Replacement replacement = new Replacement();

        System.out.println("""
                Choose the mode:\s
                1)Count matches in File
                2)Change word in file""");
        System.out.println("!!!Enter must look like: <path><word to count> or <path><word to change><new word> !!!");
        String mode = scanner.next();
        System.out.println("Enter pass and word/words");
        String input = scanner.next();
        String[] strings =p1.parseString(input);
        switch (mode){
            case "1":
                if(strings.length==2){
                    searching.search(strings);
                }else System.out.println("Error. Your input ust look like <path><word to count>");
                break;
            case "2":
                 if(strings.length==3){
                    replacement.replace(strings);
                }else System.out.println("Error.Your input must look like <path><word to change><new word>");
                 break;
            default:
                System.out.println("Wrong input:(\nChoose right mode");

        }


    }
}
