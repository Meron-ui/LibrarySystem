package com.example.librarysystem.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @NotNull(message = "isbn cannot be null")
    private String isbn;
    @NotNull(message = "title cannot be null")
    private String title;
    @NotNull(message = "author cannot be null")
    private String author;
    private String description;
    private String location;
    @NotNull(message = "Category cannot be null")
    private String category;
    private boolean checkedOut;

    @ManyToOne
    @JoinColumn(name = "publisherId", referencedColumnName = "publisherId")
    private Publisher publisher;

}
