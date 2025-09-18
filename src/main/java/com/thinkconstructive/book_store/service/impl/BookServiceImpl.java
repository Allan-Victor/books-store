package com.thinkconstructive.book_store.service.impl;

import com.thinkconstructive.book_store.dto.BookDto;
import com.thinkconstructive.book_store.mapper.BookMapper;
import com.thinkconstructive.book_store.model.Book;
import com.thinkconstructive.book_store.repository.BookRepository;
import com.thinkconstructive.book_store.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto getBook(String bookId) {
       return bookRepository.findBookByBookId(bookId)
                .map(bookMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Book does not exist"));

    }

    @Override
    public List<BookDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();

    }

    @Override
    public BookDto createBook(BookDto dto) {
        Book book = bookRepository.insert(bookMapper.toModel(dto));
        return bookMapper.toDto(book) ;
    }

    @Override
    public BookDto updateBookName(BookDto bookDto) {
        String bookId = bookDto.bookId();
        String name = bookDto.name();

        bookRepository.updateBookNameByBookId(bookId, name);

        // check to see if updated book is in the db
        return bookRepository.findBookByBookId(bookId)
                .map(bookMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Book does not exist"));
    }

    @Override
    public void deleteBookByBookId(String bookId) {
        bookRepository.deleteBookByBookId(bookId);
    }
}
