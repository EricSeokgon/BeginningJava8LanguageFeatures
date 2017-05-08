package chapter5.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static chapter5.lambda.Gender.FEMALE;
import static chapter5.lambda.Gender.MALE;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Person
 * Date: 2017-05-08
 * Time: 오전 9:02
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Gender gender;
    public Person(String firstName, String lastName, LocalDate dob, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + gender + ", " + dob;
    }
    // A utility method
    public static List<Person> getPersons() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", "Jacobs", LocalDate.of(1975, 1, 20), MALE));
        list.add(new Person("Wally", "Inman", LocalDate.of(1965, 9, 12), MALE));
        list.add(new Person("Donna", "Jacobs", LocalDate.of(1970, 9, 12), FEMALE));
        return list;
    }
}
