package com.example.learnspring.controller;

import com.example.learnspring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("students")
public class StudentController {
    // b2
    @ModelAttribute("genders")
    public Map<Boolean,String> getGenders() {
        Map<Boolean,String> genders = new HashMap<>();
        genders.put(true,"Male");
        genders.put(false,"Female");
        return genders;
    }
    @ModelAttribute("hobbies")
    public Map<String, String> getHobbies(){
        Map<String, String> hobbies = new HashMap<>();

        hobbies.put("M", "Music");
        hobbies.put("S", "Sports");
        return hobbies;
    }
    @ModelAttribute("faculties")
    public List<String> getFaculties(){
        return List.of("Computer Science", "Information Technology", "Electrical Engineering");
    }
    // b1
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
