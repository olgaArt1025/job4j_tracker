package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> containsName = s -> s.getName().contains(key);
        Predicate<Person> containsSurname = s -> s.getSurname().contains(key);
        Predicate<Person> containsPhone = s -> s.getPhone().contains(key);
        Predicate<Person> containsAddress = s -> s.getAddress().contains(key);
        Predicate<Person> combine =
                containsName.or(containsSurname).or(containsPhone).or(containsAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
