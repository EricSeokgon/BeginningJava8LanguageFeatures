package chapter9.NewInputOutput;

import java.nio.ByteOrder;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: MachineByteOrder
 * Date: 2017-07-05
 * Time: 오전 9:09
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MachineByteOrder {
    public static void main(String[] args) {
        ByteOrder b = ByteOrder.nativeOrder();
        if (b.equals(ByteOrder.BIG_ENDIAN)) {
            System.out.println("Big endian");
        } else {
            System.out.println("Little endian");
        }
    }
}
