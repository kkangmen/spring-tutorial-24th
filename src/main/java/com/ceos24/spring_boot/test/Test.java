package com.ceos24.spring_boot.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Test {

    @Id
    private Long id;

    private String name;
}
