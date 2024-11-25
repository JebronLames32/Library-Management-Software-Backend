package library.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import library.librarymanagement.books.BookRepository;
import library.librarymanagement.users.admin.AdminRepository;
import library.librarymanagement.users.UserRepository;
import library.librarymanagement.users.admin.Admin;
import library.librarymanagement.users.User;
import library.librarymanagement.books.Books;


@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(LibraryManagementApplication.class);

    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    //    inject the BookRepository into the LibraryManagementApplication class using constructor injection
    public LibraryManagementApplication(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
        logger.info("Application started");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Application running");
//        bookRepository.save(new Books("The Alchemist", "Paulo Coelho", true, "Fiction", 1.4));
//        bookRepository.save(new Books("The Da Vinci Code", "Dan Brown", true, "Fiction", 2.5));
//        bookRepository.save(new Books("The Monk Who Sold His Ferrari", "Robin Sharma", true, "Fiction", 3.7));
//        bookRepository.save(new Books("The Lean Startup", "Eric Ries", true, "Business", 4.6));
//        add new users who are admins to the database
        userRepository.save(new Admin("John Doe", "john@gmail.com", "password", "IT", "Manager"));
        logger.info("Number of books in the database: " + bookRepository.count());
//        for(Books book: bookRepository.findAll()) {
////            print the id and name of each book to the console using logger
//            logger.info("Book ID: " + book.getBookId() + " Book Name: " + book.getBookName());
//        }
//        print all books that have the name "The Alchemist" to the console using logger
        for(Books book: bookRepository.findBybookName("The Alchemist")) {
            logger.info("Book ID: " + book.getBookId() + " Book Name: " + book.getBookName() + " Book Status: " + book.isStatus());
        }
//        print the number of books in the database to the console using logger

        logger.info("Application ended");
    }

}
