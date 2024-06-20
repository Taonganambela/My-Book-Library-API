package com.example.demo.controller;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;



@RestController
@RequestMapping("/Book")
@CrossOrigin(origins = "*")
public class BookController {
    private final BookService bookService;

   public BookController(BookService bookService) {
      this.bookService = bookService;
   }
   //post
   @PostMapping({"/saveBook"})
   public Book book(@RequestBody Book book) {
      return this.bookService.saveBook(book);
   }
   //update
   @PutMapping({"update/{id}"})
   public String updateBook(@RequestBody Book book, @PathVariable("id") int id) {
      return this.bookService.updateBook(id, book);
   }
   //delete
   @DeleteMapping({"delete/{id}"})
   public String deleteBook(@PathVariable("id") int id) {
      return this.bookService.deleteBook(id);
   }
   //get all
   @GetMapping({"getAll"})
   public List<Book> getAllBooks() {
    return bookService.getAllBooks();
   }

}
