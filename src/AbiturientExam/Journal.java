package AbiturientExam;

import java.util.ArrayList;

public class Journal {
    private ArrayList<JournalRecord> records;

    public Journal() {
        this.records = new ArrayList<JournalRecord>();
    }

    public void addRecord(Exam exam, int mark, Abiturient abiturient, Professor professor) {
        this.records.add(new JournalRecord(exam, mark, abiturient, professor));
    }

    public ArrayList<JournalRecord> getRecordsForAbiturient(Abiturient abiturient) {
        ArrayList<JournalRecord> res = new ArrayList<>();
        for (JournalRecord record: this.records) {
            if(abiturient == record.abiturient)
                res.add(record);
        }

        return records;
    }
}
