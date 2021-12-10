package neu.shravya.midterm;

import java.util.Comparator;

public class StudentNameAscendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student first, Student second) {
            return first.getName().toLowerCase().compareTo(second.getName().toLowerCase());
        }
}
