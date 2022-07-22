package com.example.learnspring.controller;

import com.example.learnspring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("students")
public class StudentController {
    @GetMapping("new")
    public String newForm() {
        return "students/new";
    }
    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(
            @RequestParam("studentId") String studentId,
            @RequestParam("studentName") String studentName,
            Model model) {
        System.out.println(studentId);
        System.out.println(studentName);
        model.addAttribute("studentId",studentId);
        model.addAttribute("studentName",studentName);
        return "students/view-detail";
    }

    @PostMapping("update")
    public String update(
            Student student,
            Model model) {
        System.out.println("update method");
        model.addAttribute("studentId",student.getStudentId());
        model.addAttribute("studentName",student.getStudentName());
        return "students/view-detail";
    }
    @GetMapping("edit/{studentId}")
    public String edit(@PathVariable("studentId") String studentId, Model model) {
        System.out.println("Edit student ID:"+studentId);
        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentName("Trang");
        model.addAttribute("student",student);
        return "students/edit";
    }
    @RequestMapping("list")
    public String list() {
        return "students/list";
    }
    @RequestMapping("search")
    public String search() {
        return "students/search";
    }

}
