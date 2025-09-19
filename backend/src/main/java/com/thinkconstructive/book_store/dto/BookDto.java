package com.thinkconstructive.book_store.dto;

import lombok.Builder;

@Builder
public record BookDto(String bookId, String name,
                      String price, String author, String description) {
}
