package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> listAllPersonsNames() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }

    public List<Person> listAllMajors() {
        return persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public List<Person> listAllFromOradea() {
        return persons.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("Oradea"))
                .collect(Collectors.toList());
    }

    public List<Person> listAllFromOradeaOrCluj() {
        return persons.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("Oradea") || person.getCity().equalsIgnoreCase("Cluj"))
                .collect(Collectors.toList());
    }

    public List<String> listAllFirstNamesCapitalized() {
        return persons.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> listAllNamesWithInitial() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".")
                .collect(Collectors.toList());
    }

    public List<Person> listPersonsInAgeRange() {
        return persons.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .collect(Collectors.toList());
    }

    public List<Person> listPersonsWithNameStartingWithA() {
        return persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
    }

    public List<String> listUniqueFirstNames() {
        return persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByFirstName() {
        return persons.stream()
                .sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByLastName() {
        return persons.stream()
                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByFirstLastNameAndAge() {
        return persons.stream()
                .sorted((p1, p2) -> {
                    int compareFirstName = p1.getFirstName().compareTo(p2.getFirstName());
                    if (compareFirstName != 0) {
                        return compareFirstName;
                    }
                    int compareLastName = p1.getLastName().compareTo(p2.getLastName());
                    if (compareLastName != 0) {
                        return compareLastName;
                    }
                    return Integer.compare(p1.getAge(), p2.getAge());
                })
                .collect(Collectors.toList());
    }
}
