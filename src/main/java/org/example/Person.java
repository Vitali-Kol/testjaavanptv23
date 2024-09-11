package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Address address;
    private int birthDay;
    private int birthYear;
    private int birthMonth;
            ;

    public Person() {
    }

    public Person(String name, String surname, Address address, int birthDay, int birthYear, int birthMonth) {
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && birthDay == person.birthDay && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, birthDay, address);

    }
    public int getAge(){
        LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate, LocalDate.now());
                return age.getYears();
    }
}

