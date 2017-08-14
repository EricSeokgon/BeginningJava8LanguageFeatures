package chapter12.Clooections;

/**
 * Created by hadeslee on 2017-08-15.
 */
public class ComparablePerson extends Person implements Comparable {
    public ComparablePerson(int id, String name) {
        super(id, name);
    }

    @Override
    public int compareTo(Object o) {
        ComparablePerson cp = (ComparablePerson) o;
        int cpId = cp.getId();
        String cpName = cp.getName();

        if (this.getId() < cpId) {
            return -1;
        }
        if (this.getId() > cpId) {
            return 1;
        }
        if (this.getId() == cpId) {
            return this.getName().compareTo(cpName);
        }

        return 0;
    }
}
