package com.nickkhub.bookstore.controller;

import com.nickkhub.bookstore.dto.BookDTO;
import com.nickkhub.bookstore.dto.CreateBookRequest;
import com.nickkhub.bookstore.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<BookDTO> createBook(CreateBookRequest request) {
        BookDTO createdBook = bookService.createBook(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdBook);
    }

    @PutMapping("/update")
    public ResponseEntity<BookDTO> updateBook(@RequestBody BookDTO bookDTO) {
        return ResponseEntity.ok(bookService.updateBook(bookDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
