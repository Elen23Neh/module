package AbiturientExam;

import java.util.ArrayList;

public class Faculty {
    private ArrayList<Professor> professors;
    private ArrayList<Abiturient> abiturients;
    public final Journal Journal;

    public Faculty() {
        this.professors = new ArrayList<>();
        this.abiturients = new ArrayList<>();
        this.professors.add(new Professor("Ivan", "Kaban", 43, "Informatic"));
        this.Journal = new Journal();
    }

    public void registrateAbiturient(Abiturient abiturient){
        this.abiturients.add(abiturient);
    }

    public Professor getProfessor(String firstName, String lastName) throws IllegalArgumentException{
        for (Professor prof: this.professors) {
            if(prof.FirstName == firstName && prof.LastName == lastName)
                return  prof;
        }

        throw new IllegalArgumentException("Not found Professor with these name and last name");
    }
}

