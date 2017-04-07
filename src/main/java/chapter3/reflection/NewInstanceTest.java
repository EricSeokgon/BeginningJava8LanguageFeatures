package chapter3.reflection;

/**
 * Created by Hadeslee on 2017-04-08.
 */
public class NewInstanceTest {
    public static void main(String[] args) throws InstantiationException {
        Class<Person> personClass = Person.class;
        try {
// Create new instance of Person class
            Person p = personClass.newInstance();
            System.out.println(p);
        }
        catch (InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
