package Task3;

import java.util.ArrayList;

public class Printing {
    public String print(ArrayList<Triangle> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int num = 0;
        stringBuilder.append("========Triangles list:==========\n");
        for (Triangle triangle : list) {
            stringBuilder.append(num++ + ")  " + triangle.getName() + "-->>" + triangle.getArea() + "\n");
        }
        return stringBuilder.toString();
    }
}
