package com.example.learnspring.controller;

import com.example.learnspring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("students")
public class StudentController {
    //create modelAttribute student
    @ModelAttribute("students")
    public List<Student> getStudents(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("ST1", "Nguyen Van A"));
        list.add(new Student("ST2", "Nguyen Van B"));
        return list;
    }

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
    //@RequestMapping("view-detail")

    @GetMapping("view-detail/{studentId}")
    public String viewDetail(@PathVariable("studentId") String studentId, Model model) {
        System.out.println("View detail student ID:"+studentId);
        Student student = new Student();
        student.setStudentId(studentId);
        for(Student s: getStudents()) {
            if(s.getStudentId().equals(studentId)) {
                student = s;
                break;
            }
        }
        model.addAttribute("student",student);
        return "students/view-detail";
    }
    //  @RequestMapping("delete/{studentId}")
    /*@GetMapping("delete/{studentId}")
    public String delete(@PathVariable("studentId") String studentId, Model model) {
        System.out.println("Delete student ID:"+studentId);
        List<Student> list = new ArrayList();
        list = Stream.of(getStudents()).filter(s -> ! s.getStudentId().equals(studentId)).collect(Collectors.toCollection(ArrayList::new));;
        return "redirect:/students/list";
    }*/
}
