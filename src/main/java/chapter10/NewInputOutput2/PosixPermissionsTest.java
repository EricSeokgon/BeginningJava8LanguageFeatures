package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Set;

import static java.nio.file.attribute.PosixFilePermission.GROUP_READ;
import static java.nio.file.attribute.PosixFilePermission.OWNER_READ;
import static java.nio.file.attribute.PosixFilePermission.OWNER_WRITE;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PosixPermissionsTest
 * Date: 2017-07-18
 * Time: 오전 9:18
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PosixPermissionsTest {
    public static void main(String[] args) {
        Path path = Paths.get("luci");
        PosixFileAttributeView posixView =
            Files.getFileAttributeView(path, PosixFileAttributeView.class);
        if (posixView == null) {
            System.out.format("POSIX attribute view is not supported%n.");
            return;
        }
        readPermissions(posixView);
        updatePermissions(posixView);
    }

    public static void readPermissions(PosixFileAttributeView posixView) {
        try {
            PosixFileAttributes attribs;
            attribs = posixView.readAttributes();
            Set<PosixFilePermission> permissions = attribs.permissions();
            // Convert the set of posix file permissions into rwxrwxrwx form
            String rwxFormPermissions = PosixFilePermissions.toString(permissions);
            System.out.println(rwxFormPermissions);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void updatePermissions(PosixFileAttributeView posixView) {
        try {
            Set<PosixFilePermission> permissions =
                EnumSet.of(OWNER_READ, OWNER_WRITE, GROUP_READ);
            posixView.setPermissions(permissions);
            System.out.println("Permissions set successfully.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
