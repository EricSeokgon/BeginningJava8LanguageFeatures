package chapter12.Clooections;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: BadKey
 * Date: 2017-08-30
 * Time: 오전 9:43
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class BadKey {
    private int id;
    public BadKey(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int hashCode() {
// Return the value of id as its hash code value
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BadKey) {
            BadKey bk = (BadKey) obj;
            if (bk.getId() == this.id) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
