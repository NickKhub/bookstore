package com.nickkhub.bookstore.service;

import com.nickkhub.bookstore.dto.BookDTO;
import com.nickkhub.bookstore.dto.CreateBookRequest;

public interface BookService {
    BookDTO createBook(CreateBookRequest request);
    BookDTO updateBook(BookDTO bookDTO);
    void deleteBook(Long bookId);
}
