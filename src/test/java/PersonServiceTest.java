package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonServiceTest {
    private List<Person> persons;
    private PersonService personService;

    @Before
    public void setUp() {
        persons = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("Peter", "Johnson", 17, "Oradea"),
                new Person("Alex", "Brown", 45, "Bucharest"),
                new Person("Mike", "Davis", 65, "Oradea")
        );
        personService = new PersonService(persons);
    }

    @Test
    public void testListAllPersonsNames() {
        List<String> expected = Arrays.asList("John Doe", "Anna Smith", "Peter Johnson", "Alex Brown", "Mike Davis");
        assertEquals(expected, personService.listAllPersonsNames());
    }

    @Test
    public void testListAllMajors() {
        List<Person> expected = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("Alex", "Brown", 45, "Bucharest"),
                new Person("Mike", "Davis", 65, "Oradea")
        );
        assertEquals(expected.size(), personService.listAllMajors().size());
        assertTrue(personService.listAllMajors().containsAll(expected));
    }

    @Test
    public void testListAllFromOradea() {
        List<Person> expected = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Peter", "Johnson", 17, "Oradea"),
                new Person("Mike", "Davis", 65, "Oradea")
        );
        assertEquals(expected.size(), personService.listAllFromOradea().size());
        assertTrue(personService.listAllFromOradea().containsAll(expected));
    }

    @Test
    public void testListAllFromOradeaOrCluj() {
        List<Person> expected = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("Peter", "Johnson", 17, "Oradea"),
                new Person("Mike", "Davis", 65, "Oradea")
        );
        assertEquals(expected.size(), personService.listAllFromOradeaOrCluj().size());
        assertTrue(personService.listAllFromOradeaOrCluj().containsAll(expected));
    }

    @Test
    public void testListAllFirstNamesCapitalized() {
        List<String> expected = Arrays.asList("JOHN", "ANNA", "PETER", "ALEX", "MIKE");
        assertEquals(expected, personService.listAllFirstNamesCapitalized());
    }

    @Test
    public void testListAllNamesWithInitial() {
        List<String> expected = Arrays.asList("John D.", "Anna S.", "Peter J.", "Alex B.", "Mike D.");
        assertEquals(expected, personService.listAllNamesWithInitial());
    }

    @Test
    public void testListPersonsInAgeRange() {
        List<Person> expected = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("Alex", "Brown", 45, "Bucharest")
        );
        assertEquals(expected.size(), personService.listPersonsInAgeRange().size());
        assertTrue(personService.listPersonsInAgeRange().containsAll(expected));
    }

    @Test
    public void testListPersonsWithNameStartingWithA() {
        List<Person> expected = Arrays.asList(
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("Alex", "Brown", 45, "Bucharest")
        );
        assertEquals(expected.size(), personService.listPersonsWithNameStartingWithA().size());
        assertTrue(personService.listPersonsWithNameStartingWithA().containsAll(expected));
    }

    @Test
    public void testListUniqueFirstNames() {
        List<String> expected = Arrays.asList("John", "Anna", "Peter", "Alex", "Mike");
        assertEquals(expected.size(), personService.listUniqueFirstNames().size());
        assertTrue(personService.listUniqueFirstNames().containsAll(expected));
    }

    @Test
    public void testSortPersonsByFirstName() {
        List<Person> expected = Arrays.asList(
                new Person("Alex", "Brown", 45, "Bucharest"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Mike", "Davis", 65, "Oradea"),
                new Person("Peter", "Johnson", 17, "Oradea")
        );
        assertEquals(expected, personService.sortPersonsByFirstName());
    }

    @Test
    public void testSortPersonsByLastName() {
        List<Person> expected = Arrays.asList(
                new Person("Alex", "Brown", 45, "Bucharest"),
                new Person("Mike", "Davis", 65, "Oradea"),
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Peter", "Johnson", 17, "Oradea"),
                new Person("Anna", "Smith", 30, "Cluj")
        );
        assertEquals(expected, personService.sortPersonsByLastName());
    }

    @Test
    public void testSortPersonsByFirstLastNameAndAge() {
        List<Person> expected = Arrays.asList(
                new Person("Alex", "Brown", 45, "Bucharest"),
                new Person("Anna", "Smith", 30, "Cluj"),
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Mike", "Davis", 65, "Oradea"),
                new Person("Peter", "Johnson", 17, "Oradea")
        );
        assertEquals(expected, personService.sortPersonsByFirstLastNameAndAge());
    }
}
