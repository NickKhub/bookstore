package com.nickkhub.bookstore.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateBookRequest {
    private String title;
    private String author;
    private String genre;
    private BigDecimal price;
}
