package com.dreamteam.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Person {

    private static long static_id;

    @Id
    private Long id = static_id++;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Enum Userlevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Enum getUserlevel() {
        return Userlevel;
    }

    public void setUserlevel(Enum userlevel) {
        Userlevel = userlevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname()) &&
                Objects.equals(getEmail(), person.getEmail()) &&
                Objects.equals(getPassword(), person.getPassword()) &&
                Objects.equals(getUserlevel(), person.getUserlevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getSurname(), getEmail(), getPassword(), getUserlevel());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Userlevel=" + Userlevel +
                '}';
    }

    public enum UserLevel {
        User, Admin, OwnerAdmin;
    }

}


