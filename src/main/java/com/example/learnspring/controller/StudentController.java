package com.example.learnspring.controller;

import com.example.learnspring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentController {
    @GetMapping ("new")
    public String newForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/addOrEdit";
    }
    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(@ModelAttribute("student") Student student) {
        System.out.println(student.getStudentId());
        System.out.println(student.getName());
        return "students/detail";
    }
}
