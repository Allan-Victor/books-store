package com.thinkconstructive.book_store.mapper;

import com.thinkconstructive.book_store.dto.BookDto;
import com.thinkconstructive.book_store.model.Book;



public interface BookMapper {

     BookDto toDto(Book book);

    Book toModel(BookDto dto);

}
