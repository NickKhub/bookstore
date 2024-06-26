package com.nickkhub.bookstore.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String genre;
    private BigDecimal price;
}
