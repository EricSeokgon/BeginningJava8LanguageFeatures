package chapter6.threads;


/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ScheduledTaskTest
 * Date: 2017-06-13
 * Time: 오후 5:16
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TaskResult {
    private int taskId;
    private int result;

    public TaskResult(int taskId, int result) {
        this.taskId = taskId;
        this.result = result;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "TaskResult{" +
            "taskId=" + taskId +
            ", result=" + result + " seconds" +
            '}';
    }
}
