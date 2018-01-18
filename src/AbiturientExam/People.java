package AbiturientExam;

public abstract class People {
    public String FirstName;
    public String LastName;
    int Age;

    public People(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }
}
