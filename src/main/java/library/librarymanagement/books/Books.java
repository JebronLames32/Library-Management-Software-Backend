package library.librarymanagement.books;
import jakarta.persistence.*;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence"
    )
    private int bookID;


    @Column(nullable = false)
    private String bookName, Author;

    private String department;
    private double shelfNumber;

    @Column(nullable = false)
    private boolean status;

    public Books() {
    }

    public Books(String bookName, String author, boolean status, String department, double shelfNumber) {
        this.bookName = bookName;
        this.Author = author;
        this.status = status;
        this.department = department;
        this.shelfNumber = shelfNumber;
    }

    public int getBookId() {
        return bookID;
    }

    public void setBookId(int bookId) {
        this.bookID = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getShelfNo() {
        return shelfNumber;
    }

    public void setShelfNo(double shelfNo) {
        this.shelfNumber = shelfNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
