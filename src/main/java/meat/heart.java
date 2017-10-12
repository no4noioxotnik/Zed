package meat;

import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class heart {
    public static void main(String[] args) {
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

    private List<File> getf() {
        String[] strings = {"*"};
        File dir = new File("C:/users");

        IOFileFilter fileFilter = new FileFileFilter(){

        };

        IOFileFilter dirFilter = new FileFileFilter(){

        };

        List<File> files = (List<File>) FileUtils.listFiles(dir, fileFilter, dirFilter);
        return files;
    }


    private List<File> getf2() {
        File dir = new File("C:/users");
        List<File> collect = Arrays.asList(dir.listFiles())
                .stream()
                .map(m -> new File(m.getAbsolutePath() + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cookies"))
                .collect(Collectors.toList());
        return collect;
    }
}
