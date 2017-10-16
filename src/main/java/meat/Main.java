package meat;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*File dir = new File("C://");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.startsWith("S");}};
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("Wrong directory");
        } else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }*/

        File myFile = new File("C:\\Users\\ragimov_ra\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cookies");
        System.out.println("Имя файла: " + myFile.getName());
        System.out.println("Родительский каталог: " + myFile.getParent());
        if (myFile.exists())
            System.out.println("Файл существует");
        else
            System.out.println("Файл еще не создан");

        System.out.println("Размер файла: " + myFile.length());
        if (myFile.canRead())
            System.out.println("Файл доступен для чтения");
        else
            System.out.println("Файл не доступен для чтения");

        if (myFile.canWrite())
            System.out.println("Файл доступен для записи");
        else
            System.out.println("Файл не доступен для записи");

        // создадим новый файл
        File dir = new File("C://SomeDir");
        File newFile = new File("C://SomeDir//MyFile");
        try {
            boolean create = dir.mkdir();
            boolean created = newFile.createNewFile();
            if (create)
                System.out.println("Папка создана");
            if (created)
                System.out.println("Файл создан");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}