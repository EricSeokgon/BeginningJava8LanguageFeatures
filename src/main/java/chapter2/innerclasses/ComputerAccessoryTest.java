package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ComputerAccessoryTest
 * Date: 2017-03-20
 * Time: 오전 9:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ComputerAccessoryTest {
    public static void main(String[] args) {
        // Create two monitors
        ComputerAccessory.Monitor m17 = new ComputerAccessory.Monitor(17);
        ComputerAccessory.Monitor m19 = new ComputerAccessory.Monitor(19);
        // Create two Keyboards
        ComputerAccessory.Keyboard k122 = new ComputerAccessory.Keyboard(122);
        ComputerAccessory.Keyboard k142 = new ComputerAccessory.Keyboard(142);
        System.out.println(m17);
        System.out.println(m19);
        System.out.println(k122);
        System.out.println(k142);
    }
}
