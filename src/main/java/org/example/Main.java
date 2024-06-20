package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("Peter", "Johnson", 17, "Oradea"),
                new Person("Alex", "Brown", 45, "Bucharest"),
                new Person("Mike", "Davis", 65, "Oradea")
        );

        PersonService personService = new PersonService(persons);

        System.out.println("All Persons Names:");
        personService.listAllPersonsNames().forEach(System.out::println);

        System.out.println("\nAll Majors:");
        personService.listAllMajors().forEach(System.out::println);

        System.out.println("\nAll from Oradea:");
        personService.listAllFromOradea().forEach(System.out::println);

        System.out.println("\nAll from Oradea or Cluj:");
        personService.listAllFromOradeaOrCluj().forEach(System.out::println);

        System.out.println("\nAll First Names Capitalized:");
        personService.listAllFirstNamesCapitalized().forEach(System.out::println);

        System.out.println("\nAll Names with Initial:");
        personService.listAllNamesWithInitial().forEach(System.out::println);

        System.out.println("\nAll Persons with Age 18 < Age < 60:");
        personService.listPersonsInAgeRange().forEach(System.out::println);

        System.out.println("\nAll Persons with First Name starting with A:");
        personService.listPersonsWithNameStartingWithA().forEach(System.out::println);

        System.out.println("\nUnique First Names:");
        personService.listUniqueFirstNames().forEach(System.out::println);

        System.out.println("\nPersons sorted by First Name:");
        personService.sortPersonsByFirstName().forEach(System.out::println);

        System.out.println("\nPersons sorted by Last Name:");
        personService.sortPersonsByLastName().forEach(System.out::println);

        System.out.println("\nPersons sorted by First Name, Last Name, and Age:");
        personService.sortPersonsByFirstLastNameAndAge().forEach(System.out::println);
    }
}
