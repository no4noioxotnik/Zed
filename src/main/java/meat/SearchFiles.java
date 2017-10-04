package meat;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SearchFiles {
        private Map<String, Boolean> map = new HashMap<String, Boolean>();

        private File root;

        public SearchFiles(File root){
            this.root = root;
        }

              private String[] getTargetFiles(File directory){
            if(directory == null){
                return null;
            }

            String[] files = directory.list(new FilenameFilter(){

                @Override
                public boolean accept(File dir, String name) {
                    // TODO Auto-generated method stub
                    return name.startsWith("Temp") && name.endsWith(".txt");
                }

            });

            return files;
        }

        private void printFiles(String[] targets){
            for(String target: targets){
                System.out.println(target);
            }
        }
    }

