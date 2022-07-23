package com.example.learnspring.controller;

import com.example.learnspring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.servlet.ServletContext;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("students")
public class StudentController {
    //b3
    @Autowired
    ServletContext application; //dung de upload file b3 (application.getRealPath("/")

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
    public String saveOrUpdate(@Validated @ModelAttribute("student") Student student,
                               BindingResult result) {
        //b4
        if (result.hasErrors()) {
            return "students/addOrEdit";
        }

        //b3 update
        if(!student.getImageFile().isEmpty()) {
            String path = application.getRealPath("/");//getRealPath() lấy đường dẫn thư mục webapps
            System.out.println("path: " + path);
            try {
                student.setImageUrl(student.getImageFile().getOriginalFilename());//getOriginalFilename() lấy tên file
                String filePath = path + "/images/" + student.getImageUrl(); // lấy đường dẫn file
                student.getImageFile().transferTo(Path.of(filePath));// transferTo() lưu file vào đường dẫn
                student.setImageFile(null);// xóa file trong thể hiện
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(student.getStudentId());
        System.out.println(student.getName());
        return "students/detail";
    }
}
