package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "\"" + name.substring(9) + "\" "
                + ": \"name\"," + System.lineSeparator() + "\"" + body.substring(9) + "\" "
                + ": \"body\"" + System.lineSeparator() + "}";
    }
}
