package chapter3.reflection;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PublicPerson
 * Date: 2017-04-11
 * Time: 오전 10:30
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PublicPerson {
    private int id = -1;
    public String name = "Unknown";

    public PublicPerson() {
    }

    @Override
    public String toString() {
        return "PublicPerson{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
