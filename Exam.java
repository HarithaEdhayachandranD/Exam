package com.examtimetable.exam.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer examId;

    private Integer courseId;
    private LocalDate examDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
}
