package IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;

/**
 * Created by ADMIN on 31.12.01.
 */
public class FileCreator {
    public void fileCreator(int size, String name){
        String pathToFile = "c:temp/myfolder/"+name+".dat";
        Path newFile = Paths.get(pathToFile);


        try {
            Files.createDirectories(newFile.getParent());
            System.out.println(newFile.toAbsolutePath());
            Files.createFile(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }



      try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(pathToFile))){
            for (int i=0; i<size;i++){
                dataOutputStream.write(0);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }


    }
    }

