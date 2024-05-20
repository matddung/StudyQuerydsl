package com.studyjun.studyQuerydsl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private Integer age;
}