package com.example.learnspring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @NotEmpty
    private String studentId;
    @NotEmpty(message ="{NotEmpty.student.name}")
    @Size(min=5)
    private String name;
    @Email
    @NotEmpty
    private String email;
    @Min(value =0)
    @Max(value =10)
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
