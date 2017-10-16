package meat;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.File;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class SearchFiles {
    /*public static void SearchFiles(String[] args) {
    private List<File> getf() {
        java.lang.String[] strings = {"*"};
        File dir = new File("C:/users");

        IOFileFilter fileFilter = new FileFileFilter() {

        };

        IOFileFilter dirFilter = new FileFileFilter() {

        };

        List<File> files = (List<File>) FileUtils.listFiles(dir, fileFilter, dirFilter);
        return files;
    }*/
    public static void main(String[] args) {
        List<File> files = getf2();
        files.forEach(System.out::println);


    }

    public static List<File> getf2 () {
        File dir = new File("C:/users");
        List<File> collect = Arrays.asList(dir.listFiles())
                .stream()
                .map(m -> new File(m.getAbsolutePath() + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cookies"))
                .collect(Collectors.toList());
        return collect;
    }
}
