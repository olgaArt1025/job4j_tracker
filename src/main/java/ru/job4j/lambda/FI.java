package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Comparator<Attachment> cmpText = (left, right) -> left.getName().compareTo(right.getName());
        Comparator<Attachment> cmpDescSize = (left, right) ->
                Integer.compare(right.getSize(), left.getSize());
        Arrays.sort(atts, comparator);
        Arrays.sort(atts, cmpText);
        Arrays.sort(atts, cmpDescSize);
    }
}
