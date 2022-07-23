package com.example.learnspring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studentId;
    private String name;
    private String email;
    private String mark;
    private String faculty;

    //dung de chon gioi tinh
    private Boolean gender;
    // dung de chon so thich
    private List<String> hobbies;

    //dung de upload file b3
    private MultipartFile imageFile;
    private String imageUrl;
}
