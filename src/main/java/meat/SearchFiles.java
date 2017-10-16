package meat;


import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SearchFiles {
    public static void main(String[] args) {

        for (Map.Entry<File, Long> entry : getfsize().entrySet()) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
    }

    public static Map<File, Long> getfsize () {
        File dir = new File("C:/users");
        Map<File, Long> collect = Arrays.asList(dir.listFiles())
                .stream()
                .map(m -> new File(m.getAbsolutePath() +  "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cookies"))
                .collect(Collectors.toMap(Function.identity(), File::length));
        return collect;
    }
}
