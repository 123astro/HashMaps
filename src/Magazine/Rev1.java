package Magazine;

public class Rev1 {
}
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String, Integer> hashM = new HashMap<>();
        for(String word : magazine ){
            if(!hashM.containsKey(word)){
                hashM.put(word, 1);
            } else {
                hashM.put(word, hashM.get(word) + 1);
            }
        }

        for(String word : note){
            if(!hashM.containsKey(word)){
                System.out.println("No");
                return;

            } else if (hashM.get(word) < 1){
                System.out.println("No");
                return;

            } else {
                hashM.put(word, hashM.get(word) - 1);
            }

        }
        System.out.println("Yes");

    }

}
