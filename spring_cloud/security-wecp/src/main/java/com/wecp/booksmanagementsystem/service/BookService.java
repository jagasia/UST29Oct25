package com.wecp.booksmanagementsystem.service;

import com.wecp.booksmanagementsystem.entity.Book;
import com.wecp.booksmanagementsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


import com.wecp.booksmanagementsystem.entity.Book;
import com.wecp.booksmanagementsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Save new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // Update existing book
    public Book updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id)
                .map(existingBook -> {
                    existingBook.setTitle(updatedBook.getTitle());
                    existingBook.setAuthor(updatedBook.getAuthor());
                    return bookRepository.save(existingBook);
                })
                .orElse(null); // If book doesn't exist
    }

    // Delete book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    // Check if book exists (used optionally in controller)
    public boolean existsById(Long id) {
        return bookRepository.existsById(id);
    }
}
