package chapter8.WorkingWithArchiveFiles;

import java.io.*;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: JARUtility
 * Date: 2017-06-26
 * Time: 오후 2:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JARUtility {
    private static Manifest manifest;

    public static void main(String[] args) {
        Manifest manifest = getManifest();

        String jarFileName = "jartest.jar";
        String[] entries = new String[2];
        entries[0] = "images/logo.bmp";
        entries[1] = "com/jdojo/archives/Test.class";

        careateJAR(jarFileName, entries, manifest);
    }

    private static void careateJAR(String jarFileName, String[] jarEntries, Manifest manifest) {
        String currentDirectory = System.getProperty("user.dir");

        try (JarOutputStream jos = new JarOutputStream(
            new BufferedOutputStream(
                new FileOutputStream(jarFileName)), manifest)) {

            for (int i = 0; i < jarEntries.length; i++) {
                File entryFile = new File(jarEntries[i]);
                if (!entryFile.exists()) {
                    System.out.println("The entry file " + entryFile.getAbsolutePath() + "does not exist");
                    System.out.println("Aborted processing.");
                    return;
                }
                JarEntry je = new JarEntry(jarEntries[i]);

                jos.putNextEntry(je);

                addEntryContent(jos, jarEntries[i]);
                jos.closeEntry();
            }
            System.out.println("output has been written to " + currentDirectory + File.separator + jarFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addEntryContent(JarOutputStream jos, String jarEntry) throws IOException, FileNotFoundException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(jarEntry));
        byte[] buffer = new byte[1024];int count = -1;
        while ((count = bis.read(buffer)) != -1) {
            jos.write(buffer, 0, count);
        }
        bis.close();
    }

    public static Manifest getManifest() {
        Manifest manifest = new Manifest();
/* Add main attributes
1. Manifest Version
2. Main-Class
3. Sealed
*/
        Attributes mainAttribs = manifest.getMainAttributes();
        mainAttribs.put(Attributes.Name.MANIFEST_VERSION, "1.0");
        mainAttribs.put(Attributes.Name.MAIN_CLASS, "com.jdojo.archives.Test");
        mainAttribs.put(Attributes.Name.SEALED, "true");
/* Add two individual sections */
/* Do not seal the com/jdojo/archives/ package. Note that you
have sealed the whole JAR file and to exclude this package
you we must add a Sealed: false attribute for this package
separately.
*/
        Map<String, Attributes> attribsMap = manifest.getEntries();
// Create an attribute "Sealed : false" and
// add it for individual entry "Name: com/jdojo/archives/"
        Attributes a1 = getAttribute("Sealed", "false");
        attribsMap.put("com/jdojo/archives/", a1);
// Create an attribute "Content-Type: image/bmp" and
// add it for images/logo.bmp
        Attributes a2 = getAttribute("Content-Type", "image/bmp");
        attribsMap.put("images/logo.bmp", a2);
        return manifest;
    }

    private static Attributes getAttribute(String name, String value) {
        Attributes a = new Attributes();
        Attributes.Name attribName = new Attributes.Name(name);
        a.put(attribName, value);
        return a;
    }
}
