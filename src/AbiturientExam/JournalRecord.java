package AbiturientExam;

public class JournalRecord {
    public Exam Exam;
    public int Mark;
    public Abiturient abiturient;
    public Professor professor;

    public JournalRecord(Exam exam, int mark, Abiturient abiturient, Professor professor) {
        Exam = exam;
        Mark = mark;
        this.abiturient = abiturient;
        this.professor = professor;
    }
}
