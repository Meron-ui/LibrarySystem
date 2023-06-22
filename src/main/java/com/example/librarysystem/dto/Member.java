package com.example.librarysystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

   @NotNull(message = "airport code cannot be null")
    private String name;
    private String phone;
    @NotNull(message = "address cannot be null")
    private String address;
    @NotNull(message = "frees cannot be null")
    private double fees;
    @NotNull(message = "category cannot be null")
    private String category; // STAFF, STANDARD, SENIOR_CITIZEN
}
