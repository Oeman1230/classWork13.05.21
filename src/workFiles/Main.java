package workFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        //zipOutputStream
        //zipInputStream
        String zipPath = "test.zip";
        String Path = "test.txt";
        /*try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath)))
        {
            FileInputStream fins = new FileInputStream(Path);
            ZipEntry zipEntry = new ZipEntry(Path);
            zos.putNextEntry(zipEntry);
            byte[] buffer = new byte[fins.available()];
            fins.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
        }*/
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(zipPath))) {
            ZipEntry zipEntry;
            String name;
            long size;
            while((zipEntry = zis.getNextEntry())!= null)
            {
                name = zipEntry.getName();
                size = zipEntry.getSize();
                System.out.println("File name:" + name +
                        " file size" + size);
                FileOutputStream fos = new FileOutputStream("new\\" + name);
                int c;
                while ((c = zis.read())!= -1)
                {
                    fos.write(c);
                }

                fos.flush();
                zis.close();
                fos.close();

            }
        }
        catch (Exception exception)
        {
            System.err.println(exception);
        }
        //try(ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(Paths.get(zipPath))))

    }
}
