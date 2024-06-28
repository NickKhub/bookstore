package com.nickkhub.bookstore.service;

import com.nickkhub.bookstore.dto.BookDTO;
import com.nickkhub.bookstore.dto.CreateBookRequest;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public BookDTO createBook(CreateBookRequest request) {
        return null;
    }

    @Override
    public BookDTO updateBook(BookDTO bookDTO) {
        return null;
    }

    @Override
    public void deleteBook(Long bookId) {

    }
}
