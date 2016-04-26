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
                dataOutputStream.write(1);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }


    }
    public void fileCopy(String nameWhat,String nameWere){
        String pathToFile1 = "c:temp/myfolder/"+nameWhat+".dat";
        String pathToFile2 = "c:temp/myfolder/"+nameWere+".dat";
        Path newFile1 = Paths.get(pathToFile1);
        Path newFile2 = Paths.get(pathToFile2);
        try {
            Files.copy(newFile1,newFile2,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

