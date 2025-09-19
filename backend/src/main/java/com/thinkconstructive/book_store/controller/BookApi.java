package com.thinkconstructive.book_store.controller;


import com.thinkconstructive.book_store.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BookApi {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeMessage();


    @GetMapping("/{bookId}")
    @PreAuthorize("hasRole('USER')")
    ResponseEntity<BookDto> getBook(@PathVariable("bookId") String bookId);

    @GetMapping("/")
    @PreAuthorize("hasRole('ADMIN')")
    ResponseEntity<List<BookDto>> getAllBooks();

    @PostMapping("/")
    @PreAuthorize("hasRole('ADMIN')")
    ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto);

    @PutMapping("/")
    @PreAuthorize("hasRole('ADMIN')")
    ResponseEntity<BookDto> updateBook(@RequestBody BookDto bookDto);

    @DeleteMapping("/{bookId}")
    @PreAuthorize("hasRole('ADMIN')")
    ResponseEntity<String> deleteBook(@PathVariable("bookId") String bookId);
}
