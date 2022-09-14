package Task3;

import java.util.ArrayList;

public class Printing {
    public void print(ArrayList<Triangle> list){
        int num = 0;
        System.out.println("========Triangles list:==========");
        for(Triangle triangle: list){
            System.out.println(num++ +")  "+triangle.getName()+"-->>"+ triangle.getArea());
        }
    }
}
