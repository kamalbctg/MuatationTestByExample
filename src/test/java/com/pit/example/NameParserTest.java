package com.pit.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NameParserTest {

    private NameParser nameParser;
    private String[] names;

    @Before
    public void setUp() {
        nameParser = new NameParser();
        names = new String[]{"Mike Jones", "John Doe"};
    }

    @Test
    public void shouldFindPersonByLastName() {
        Person person = nameParser.findPersonWithLastName(names, "Doe");
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        assertEquals("John", firstName);
//        assertEquals("Doe", lastName);
    }

    @Test
    public void shouldNotFindPersonByLastName() {
        Person person = nameParser.findPersonWithLastName(names, "Doe1");
        assertNull( person);
    }
}