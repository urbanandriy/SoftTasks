package Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Searching {
    public void search(String[] strings) throws IOException {
        String fileName = strings[0];
        String wordToCount = strings[1];
        Path path = Paths.get(fileName);
        int num = 0;
        String sad = Files.readString(path);
        String[] words = sad.replace(".","").replace(",","").split(" ");
        for(String w: words){
            if(w.equals(wordToCount)){
                num+=1;
            }
        }
        if (num==0){
            System.out.println("No matches was found( ");
        }else System.out.println(num);
    }
}
