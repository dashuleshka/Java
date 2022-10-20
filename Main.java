package Java;
import java.util.zip.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("C:\\Users\\user\\IdeaProjects\\MyProject\\src\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\MyProject\\src\\output.txt")){
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        }


    public class ZipUtil {
        public static void main(String[] args) throws Exception {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream("archive.zip"));

            File file = new File("folder");

            //    doZip(file, out);

            out.close();
        }
    }
}