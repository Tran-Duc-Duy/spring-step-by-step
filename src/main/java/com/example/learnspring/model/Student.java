package com.example.learnspring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String studentId;
    private String name;
    private String email;
    private String mark;
    private String faculty;

    private Boolean gender;
    private List<String> hobbies;
}
