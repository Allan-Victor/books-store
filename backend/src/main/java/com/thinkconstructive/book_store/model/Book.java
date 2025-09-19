package com.thinkconstructive.book_store.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document
public record Book(
        @Id
        String bookId,
        String name,
        String price,
        String author,
        String description) {
}
