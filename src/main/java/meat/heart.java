package meat;

import java.io.File;


public class heart {

    static boolean flag;

    public static void main(String[] args) {
        func("c:","Test");
        f(null);
    }public static void f(NullPointerException e) {
        try {
            func("C:", "readme");
            throw e;
        } catch (NullPointerException npe) {
            //f(npe);
        }
    }

    static void func(String path, String find) {
        File f = new File(path);
        String[] list = f.list();
        for (String file : list) {
                if (find.equals(file)) {
                flag=true;
                System.out.println(path + "\\" + file + " !!!!!!!!!!!!!!!!!!");
                return;
            }
            if (!path.endsWith("\\")) {
                path += "\\";
            }
            File tempfile = new File(path + file);
            System.out.println(path + file);
            if (!file.equals(".") && !file.equals("..")) {
                if (tempfile.isDirectory()) {
                    //path += file;
                    func(path + file, find);
                    if(flag) return;
                }
            }
        }
        if (list == null) {
            return;
    }

}
}



