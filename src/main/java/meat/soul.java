package meat;

import java.io.File;

public class soul{
        public static void processFilesFromFolder(File folder)
        {
            File[] folderEntries = folder.listFiles();
            for (File entry : folderEntries)
            {
                if (entry.isDirectory())
                {
                    processFilesFromFolder(entry);
                    continue;
                }
                // обработка файла
            }
        }
}
