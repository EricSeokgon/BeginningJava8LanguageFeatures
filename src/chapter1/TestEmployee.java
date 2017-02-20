package chapter1;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TestEmployee
 * Date: 2017-02-20
 * Time: 오전 9:09
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee ken = new Manager();
        int salary = 200;
        ken.setSalary(salary);
    }
}
