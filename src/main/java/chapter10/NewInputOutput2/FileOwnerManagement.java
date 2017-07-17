package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FileOwnerManagement
 * Date: 2017-07-17
 * Time: 오전 9:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileOwnerManagement {
    public static void main(String[] args) {
        try {
            // Change the file path to an existing file on your machine
            Path path = Paths.get("C:\\poems\\luci1.txt");
            FileOwnerAttributeView foav =
                Files.getFileAttributeView(
                    path,FileOwnerAttributeView.class);
            UserPrincipal owner = foav.getOwner();
            System.out.format("Original owner of %s is %s%n",
                path, owner.getName());
            FileSystem fs = FileSystems.getDefault();
            UserPrincipalLookupService upls =
                fs.getUserPrincipalLookupService();
            // Change the file owner to brice
            UserPrincipal newOwner =
                upls.lookupPrincipalByName("brice");
            foav.setOwner(newOwner);
            UserPrincipal changedOwner = foav.getOwner();
            System.out.format("New owner of %s is %s%n",
                path, changedOwner.getName());
        }
        catch (UnsupportedOperationException | IOException e) {
            e.printStackTrace();
        }
    }
}
