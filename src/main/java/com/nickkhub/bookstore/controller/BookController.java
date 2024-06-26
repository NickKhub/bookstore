package com.nickkhub.bookstore.controller;

import com.nickkhub.bookstore.dto.BookDTO;
import com.nickkhub.bookstore.dto.CreateBookRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping("/create")
    public ResponseEntity<BookDTO> createBook(CreateBookRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new BookDTO());
    }

    @PutMapping("/update")
    public ResponseEntity<BookDTO> updateBook(@RequestBody BookDTO bookDTO) {
        return ResponseEntity.ok(bookDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Long id) {
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
