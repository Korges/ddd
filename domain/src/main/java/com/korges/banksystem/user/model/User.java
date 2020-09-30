package com.korges.banksystem.user.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate birthDate;
    private Address address;
    private boolean isSuspended;
}