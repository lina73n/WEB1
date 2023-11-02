package task12;

public class Book implements Cloneable,Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int edition;
    private String isbn;

    public Book(String title, String author, int price, int edition, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }
    public Book(String isbn) {
        title = "default";
        author = "anonymous";
        price = 0;
        this.isbn = isbn;
    }
    public Book(String bookTitle, String bookAuthor, int bookPrice) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.price = bookPrice;
        isbn = "";
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public int getEdition(){
        return edition;
    }
    public String getIsbn(){
        return isbn;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", " + edition + ", " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if(! (obj instanceof Book)){
            return false;
        }
        Book testObj = (Book)obj;
        if(testObj.title.equals(title) &&
                testObj.author.equals(author) &&
                testObj.price == price &&
                testObj.edition == edition &&
                testObj.isbn.equals(isbn)){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return title.hashCode() + 2 * author.hashCode() + 3 * Integer.hashCode(price) + 4 * Integer.hashCode(edition) + 5 * isbn.hashCode() + 12345;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(title,author,price,edition,isbn);
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
