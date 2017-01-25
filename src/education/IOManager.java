package education;

import java.io.File;
import java.util.LinkedList;

/**
 * Created by Ivaylo on 25-Jan-17.
 */
public class IOManager {

    public void traverseBfs(String path) {
        LinkedList<File> subFolders = new LinkedList<>();
        File root = new File(path);

        subFolders.add(root);

        while (!subFolders.isEmpty()) {
            File current = subFolders.getFirst();
            File[] sub = current.listFiles();
            if (sub != null) {
                for (File file : sub) {
                    if (file.isDirectory()){
                        subFolders.add(file);
                    }
                }
            }
            System.out.println(current.toString());
        }
    }
}
