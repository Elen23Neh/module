package AbiturientExam;

import java.util.ArrayList;

public class MarkSystem {
    public static void main(String[] args){
        Faculty faculty = new Faculty();
        Abiturient abiturient = new Abiturient("Vasya", "Pupkin", 16, "Poltava");
        faculty.registrateAbiturient(abiturient);

        Professor professor = faculty.getProfessor("Ivan", "Kaban");

        Exam exam = new Exam("Informatic");
        professor.putMark(faculty.Journal, exam, 4, abiturient);

        exam = new Exam("Mathematic");
        professor.putMark(faculty.Journal, exam, 5, abiturient);

        exam = new Exam("Language");
        professor.putMark(faculty.Journal, exam, 3, abiturient);

        exam = new Exam("History");
        professor.putMark(faculty.Journal, exam, 3, abiturient);

        ArrayList<JournalRecord> abiturientResults = faculty.Journal.getRecordsForAbiturient(abiturient);
        int sum=0;
        for (JournalRecord record: abiturientResults) {
            sum+=record.Mark;
        }

        double avgMark = (double)sum / abiturientResults.size();

        System.out.println("Abiturient " + abiturient.FirstName + " " + abiturient.LastName + " has average mark " + avgMark);
        if(avgMark > 3){
            System.out.println("Zachislen");
        }
        else {
            System.out.println("Ne zachislen");
        }
    }
}
