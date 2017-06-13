package chapter6.threads;

import java.util.concurrent.Phaser;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: StartTogetherTaskTest
 * Date: 2017-06-13
 * Time: 오전 11:40
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StartTogetherTaskTest {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);

        final int TASK_COUNT = 3;
        for (int i = 1; i <= TASK_COUNT; i++) {
            phaser.register();

            String taskName = "Task #" + i;
            StartTogetherTask task = new StartTogetherTask(taskName, phaser);
            task.start();
        }
    }
}
