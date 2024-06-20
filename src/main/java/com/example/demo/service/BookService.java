package com.example.demo.service;
import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class BookService {
    public final BookRepo bookRepo;
    String message = null;
 
    public BookService(BookRepo bookRepo) {
       this.bookRepo = bookRepo;
    }
 
    public Book saveBook(Book book) {
       Book book1 = new Book();
       book1.setAuthor(book.getAuthor());
       book1.setBook(book.getBook());
       book1.setNumber(book.getNumber());
       
       return (Book)this.bookRepo.save(book1);
    }
 
    public String updateBook(int id, Book book) {
       Optional<Book> theBook = this.bookRepo.findById(id);
       theBook.ifPresentOrElse((a) -> {
          a.setAuthor(book.getAuthor());
          a.setBook(book.getBook());
          a.setNumber(book.getNumber());
          this.bookRepo.save(a);
          this.message = "Book Updated";
       }, () -> {
          this.message = "Book Not Updated";
       });
       return this.message;
    }
 
    public String deleteBook(int id) {
       String response = "failed to delete";
       Optional<Book> book = this.bookRepo.findById(id);
       if (book.isPresent()) {
          this.bookRepo.deleteById(id);
          response = "Book Deleted Succesful";
       }
 
       return response;
    }
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
       }
}
