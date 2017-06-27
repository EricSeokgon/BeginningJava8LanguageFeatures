package chapter9.NewInputOutput;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: BufferInfo
 * Date: 2017-06-27
 * Time: 오전 9:31
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class BufferInfo {
    public static void main(String[] args) {
        // Create a byte buffer of capacity 8
        ByteBuffer bb = ByteBuffer.allocate(8);
        System.out.println("Capacity: " + bb.capacity());
        System.out.println("Limit: " + bb.limit());
        System.out.println("Position: " + bb.position());
        // The mark is not set for a new buffer. Calling the
        // reset() method throws a runtime exception if the mark is not set.
        // If the mark is set, the position is set to the mark value.
        try {
            bb.reset();
            System.out.println("Mark: " + bb.position());
        } catch (InvalidMarkException e) {
            System.out.println("Mark is not set");
        }
    }
}
