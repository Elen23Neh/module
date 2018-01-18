package AbiturientExam;

public class Abiturient extends People {
    String City;

    public Abiturient(String firstName, String lastName, int age, String city) {
        super(firstName, lastName, age);
        City = city;
    }
}
