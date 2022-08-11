package jm.task.core.jdbc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class User {
    @Id
    private static Long id;

    @Column
    private static String name;

    @Column
    private static String lastName;

    @Column
    private static Byte age;

    public User() {

    }

    public User(String name, String lastName, Byte age) {
        User.name = name;
        User.lastName = lastName;
        User.age = age;
    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        User.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        User.name = name;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        User.lastName = lastName;
    }

    public static Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        User.age = age;
    }

    @Override
    public String toString() {
        return String.format("User { id = '%s', name = '%s', lastName = '%s', age = '%d'}",
                getId(), getName(), getLastName(), getAge());
    }
}
