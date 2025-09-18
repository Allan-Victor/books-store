package com.thinkconstructive.book_store.controller;

import com.thinkconstructive.book_store.dto.BookDto;
import com.thinkconstructive.book_store.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/book-store")
@RequiredArgsConstructor
public class BookController implements BookApi {

    private final BookService bookService;

    @Override
    public ResponseEntity<String> welcomeMessage() {
        return new ResponseEntity<>("Welcome to The Book Store", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BookDto> getBook(String bookId) {
        BookDto bookDto = bookService.getBook(bookId);
        return new ResponseEntity<>(bookDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return new ResponseEntity<>( bookService.getAllBooks(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BookDto> createBook(BookDto bookDto) {
        return new ResponseEntity<>(bookService.createBook(bookDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<BookDto> updateBook(BookDto bookDto) {

        return new ResponseEntity<>(bookService.updateBookName(bookDto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteBook(String bookId) {
        bookService.deleteBookByBookId(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
