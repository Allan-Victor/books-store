package com.thinkconstructive.book_store.mapper;


import com.thinkconstructive.book_store.dto.BookDto;
import com.thinkconstructive.book_store.model.Book;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class BookMapperImpl implements BookMapper{

    @Override
    public BookDto toDto(Book book) {
        return BookDto.builder()
                .bookId(book.bookId())
                .name(book.name())
                .author(book.author())
                .price(book.price())
                .description(book.description())
                .build();
    }

    @Override
    public Book toModel(BookDto dto) {
        return Book.builder()
                .bookId(dto.bookId())
                .name(dto.name())
                .author(dto.author())
                .price(dto.price())
                .description(dto.description())
                .build();
    }
}
