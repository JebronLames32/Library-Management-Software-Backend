package library.librarymanagement.books;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface BookRepository extends CrudRepository<Books, Long> {
//    fetch books by bookName
    @Query("SELECT b FROM Books b WHERE b.bookName = ?1")
    List<Books> findBybookName(String bookName);

//    fetch books by Authon
    @Query("SELECT b FROM Books b WHERE b.Author = ?1")
    List<Books> findByAuthor(String Author);

}
