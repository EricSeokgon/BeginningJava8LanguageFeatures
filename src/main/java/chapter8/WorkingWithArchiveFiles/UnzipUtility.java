package chapter8.WorkingWithArchiveFiles;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: UnzipUtility
 * Date: 2017-06-26
 * Time: 오후 2:15
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class UnzipUtility {
    public static void main(String[] args) {
        String zipFileName = "ziptest.zip";
        String unzipdirectory = "extracted";
        unzip(zipFileName, unzipdirectory);
    }

    private static void unzip(String zipFileName, String unzipdir) {
        try (ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFileName)))) {
            ZipEntry entry = null;
            while ((entry = zis.getNextEntry()) != null) {
                extractEntryContent(zis, entry, unzipdir);
            }
            System.out.println("ZIP file's contents have been extracted to " + (new File(unzipdir)).getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extractEntryContent(ZipInputStream zis, ZipEntry entry, String unzipdir) throws IOException, FileNotFoundException {
        String entryFileName = entry.getName();
        String entryPath = unzipdir + File.separator + entryFileName;

        createFile(entryPath);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(entryPath));

        byte[] buffer = new byte[1024];
        int count = -1;
        while ((count = zis.read(buffer)) != -1) {
            bos.write(buffer, 0, count);
        }
        bos.close();
    }

    private static void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        File parent = file.getParentFile();

        if (!parent.exists()) {
            parent.mkdirs();
        }
        file.createNewFile();
    }
}
