package ru.job4j.search;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByNull() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Olga");
        assertThat(persons, IsEmptyCollection.empty());
    }
}
