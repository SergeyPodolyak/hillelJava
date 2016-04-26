package IO;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by MBCNEWMAIN on 15.04.2016.
 */
public class IO {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan");
        Car myCar = new Car("BMW", 1985, ivan);
        ivan.setCar(myCar);
        myCar.setRentor(new Rentor("Nikolay"));



        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/car.dat"))){
            Car myCar = (Car) inputStream.readObject();
            System.out.println(myCar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void save (Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/car.dat"))) {

            outputStream.writeObject(myCar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Car load(){

    }



    private static void propertys() {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("myFolder/Новый текстовый документ.txt")){
            properties.load( fileInputStream);
            String db = properties.getProperty("DB");
            String pasword = properties.getProperty("password");
            int timeout = Integer.parseInt(properties.getProperty("timeout"));
            System.out.println(db+" "+pasword+" "+timeout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveObject() {
        try ( ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/object.dat"))){
           int[] date = new int[]{15,4,2016};
            outputStream.writeObject(date);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/object.dat"))){
    int[] date = (int[])inputStream.readObject();
        }         catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void InputData() {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myFolder/primitives.dat"))){
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("myFolder/primitives.dat"))){
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            //    System.out.println(dataInputStream.readLong());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251"))) {
            String value = null;

            while ((value = reader.readLine()) != null) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithCodePage() {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251")) {
            int value = 0;
            while ((value = reader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
        try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt");
             OutputStream outputStream = new FileOutputStream("myFolder/myFile_copy.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void tryWithResources() {
        try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uglyPriorJava7Style() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("myFolder/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void absoluteAndRelativePaths() {
        System.out.println("yes\\no");
        System.out.println("c:\\temp\\myFile.txt");
        System.out.println("/temp/myFile.txt");

        File file = new File("c:/temp/myFolder");
        System.out.println(file.exists());
        file.mkdirs();
        System.out.println(file.exists());

        File relativeFile = new File("myFolder/myFile.txt");
        System.out.println(relativeFile.getAbsolutePath());

        Path relativePath = Paths.get("myFolder/myFile.txt");
        Path parent = relativePath.getParent();
        Path resolve = parent.resolve(relativePath);
        System.out.println(parent);
        System.out.println(resolve);
        Path absolutePath = relativePath.toAbsolutePath();
        System.out.println("absolute: " + absolutePath + ", is absolute: " + absolutePath.isAbsolute());
        System.out.println("relative: " + relativePath + ", is absolute: " + relativePath.isAbsolute());

        try {
            Files.createDirectories(relativePath.getParent());
            Files.createFile(relativePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void someMethodCaller() {
        someMethod(1, 3, 4, 2, 3, 4, 3, 2, 3, 2);
        someMethod();
    }

    public static void someMethod(Integer... integers) {
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
    }
}