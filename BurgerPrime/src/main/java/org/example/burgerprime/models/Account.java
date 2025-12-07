package org.example.burgerprime.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "accounts")
@Data
@RequiredArgsConstructor
public class Account {
    @Id
    private Integer id;
    private String email;
    private String password;
}
