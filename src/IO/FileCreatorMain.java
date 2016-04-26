package IO;

import java.io.Serializable;

/**
 * Created by ADMIN on 31.12.01.
 */
public class FileCreatorMain implements Serializable{
    public static void main(String[] args) {
        FileCreator fileCreator =new FileCreator();
        fileCreator.fileCreator(5000,"file2");
     fileCreator.fileCopy("file2","A5");

    }
}
