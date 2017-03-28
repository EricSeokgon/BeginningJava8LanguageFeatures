package chapter2.innerclasses;

import java.util.ArrayList;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CallbackTest
 * Date: 2017-03-28
 * Time: 오전 11:16
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CallbackTest {
    private ArrayList<Callable> callableList = new ArrayList<>();

    public static void main(String[] args) {
        CallbackTest cbt = new CallbackTest();

        //Create three Callable objects and register them
        Callable c1 = cbt.generateCallable(1);
        cbt.register(c1);

        Callable c2 = cbt.generateCallable(2);
        cbt.register(c2);

        Callable c3 = cbt.generateCallable(3);
        cbt.register(c3);

        //Callback all the registered Callable objects
        cbt.callback();


    }

    private void callback() {
        int count = this.callableList.size();

        //Callback all the registered Callable objects
        for (int i = 0; i < count; i++) {
            Callable c = this.callableList.get(i);
            c.call();
        }
    }

    private void register(Callable c) {
        this.callableList.add(c);
    }

    private Callable generateCallable(final int no) {
        Callable c = new Callable() {
            public void call() {

                System.out.println("Called # " + no);
            }
        };
        return c;

    }

}
