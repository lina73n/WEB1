package task13;

import task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        if (!obj.getClass().equals(ProgrammerBook.class))
            return false;
        if (!super.equals(obj))
            return false;
        ProgrammerBook testObj = (ProgrammerBook) obj;
        if(language.equals(testObj.language) && level == testObj.level){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + language + ", " + level + ") ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }
}
