package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petrov I.G.");
        student.setGroup(2);
        student.setAdmission("2020.08.12");

        System.out.println(student.getFullName() + " study in group №"
                + student.getGroup() + " date of admission to the college "
                + student.getAdmission());
    }
}
