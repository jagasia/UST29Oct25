// package com.wecp.booksmanagementsystem.controller;


// import com.wecp.booksmanagementsystem.entity.Book;
// import com.wecp.booksmanagementsystem.service.BookService;
// import org.apache.coyote.Response;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;
// @RestController
// @RequestMapping
// public class BookController {
// @Autowired
// private BookService bookService;

//     @GetMapping("/api/books")
//     public ResponseEntity<List<Book>> getAllBooks() {
//         return new ResponseEntity<>(bookService
//         .findAll(), HttpStatus.OK);
//     }
    

        
//     }

//     @GetMapping("/api/books/{id}")
//     public ResponseEntity<Book> getBookById(@PathVariable Long id) {
//         Optional<Book> book = bookService.findById(id);
//         return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//     }
    
//     }

//     @PostMapping("/api/books")
//     public ResponseEntity<Book> createBook(@RequestBody Book book) {
//         // create book and return it with status code 201 CREATED
//         Book b = bookService.save(book);
//         return new ResponseEntity<>(bookService.save(b), HttpStatus.CREATED);
//     }

//     @PutMapping("/api/books/{id}")
//     public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
//         // update book and return it with status code 200 OK
//         if (bookService.existsById(id)) {
//             book.setId(id);
//             return new ResponseEntity<>(bookService.save(book), HttpStatus.OK);
//         } else {
//             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//         }
//     }
    
//     }

//     @DeleteMapping("/api/books/{id}")
//     public ResponseEntity<?> deleteBook(@PathVariable Long id) {
//         // delete book and return status code 204 NO_CONTENT
//         bookRepository.delete(book);
//     return ResponseEntity.ok().build(); 

//     }
// }
package com.wecp.booksmanagementsystem.controller;

import com.wecp.booksmanagementsystem.entity.Book;
import com.wecp.booksmanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // GET all books
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    // GET book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = bookService.getBookById(id);
        return book.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    // POST create book
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book saved = bookService.createBook(book);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // PUT update book
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Book updated = bookService.updateBook(id, updatedBook);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE book
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
