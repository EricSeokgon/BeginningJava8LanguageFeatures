package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ComputerAccessory
 * Date: 2017-03-20
 * Time: 오전 9:09
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ComputerAccessory {
    public static class Monitor {
        private int size;

        public Monitor(int size) {
            this.size = size;
        }

        public String toString() {
            return "Monitor - Size:" + this.size + " inch";
        }
    }

    // Static member class - Keyboard
    public static class Keyboard {
        private int keys;

        public Keyboard(int keys) {
            this.keys = keys;
        }

        public String toString() {
            return "Keyboard - Keys:" + this.keys;
        }
    }
}
