package com.examtimetable.exam.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String name;
    private String email;
    private String contactno;
}
