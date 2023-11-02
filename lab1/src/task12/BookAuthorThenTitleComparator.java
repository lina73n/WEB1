package task12;

import java.util.Comparator;
public class BookAuthorThenTitleComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getAuthor().compareTo(o2.getAuthor()) > 0) {
            return 1;
        } else if (o1.getAuthor().compareTo(o2.getAuthor()) < 0) {
            return -1;
        } else {
            return Integer.compare(o1.getTitle().compareTo(o2.getTitle()), 0);
        }
    }
}
