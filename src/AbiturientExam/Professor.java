package AbiturientExam;

public class Professor extends People {
    public String Subject;

    public Professor(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        Subject = subject;
    }

    public void putMark(Journal journal, Exam exam, int mark, Abiturient abiturient){
        journal.addRecord(exam, mark, abiturient, this);
    }
}
