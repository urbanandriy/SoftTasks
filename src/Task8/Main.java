package Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if( input.isEmpty()||!Character.isDigit(input.charAt(0))){
            System.out.println("Empty input or wrong input type");
            throw new Exception("Write right value");
        }
        int[] ints = new int[Integer.parseInt(input)];
        ints[0]=0;
        ints[1]=1;
        for (int i=2;i<ints.length;++i){
            ints[i]=ints[i-1]+ints[i-2];
        }
        System.out.println(Arrays.toString(ints));
    }
}
