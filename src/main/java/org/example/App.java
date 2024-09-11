package org.example;

public class App {
    public static void run(){
        Address address = new Address();
        address.setCity("narva");
        address.setState("ida-virumaa");
        address.setZip("41536");
        address.setStreet("Narvskoe shocce");
        address.setHouse("80");
        address.setRoom("20");

        Person person = new Person("Ivan","Ivanov", address, 10, 2000, 10);
        Employee employee = new Employee(person, "Директор", "3000");
        System.out.printf(
                "Name: %s, Family %s, doljnost %s, age %s, salary %s, address %s, %s, %s, %s, %s",
                employee.getPerson().getName(),
                employee.getPerson().getSurname(),
                employee.getAppointment(),
                employee.getPerson().getAge(),
                employee.getSalary(),
                employee.getPerson().getAddress().getState(),
                employee.getPerson().getAddress().getCity(),
                employee.getPerson().getAddress().getStreet(),
                employee.getPerson().getAddress().getHouse(),
                employee.getPerson().getAddress().getRoom());


    }
}
