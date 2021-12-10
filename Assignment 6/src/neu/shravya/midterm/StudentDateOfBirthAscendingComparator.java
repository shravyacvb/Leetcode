package neu.shravya.midterm;

import java.util.Comparator;

public class StudentDateOfBirthAscendingComparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        return first.getDateOfBirth().compareTo(second.getDateOfBirth());
    }

}
