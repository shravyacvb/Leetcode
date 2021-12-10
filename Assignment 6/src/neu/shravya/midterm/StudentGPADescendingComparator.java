package neu.shravya.midterm;

import java.util.Comparator;

public class StudentGPADescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return Double.compare(second.getGPA(), first.getGPA());
    }
}
