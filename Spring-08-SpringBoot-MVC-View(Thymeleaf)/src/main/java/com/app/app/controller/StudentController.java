package com.app.app.controller;

import com.app.app.model.Student;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){
        String name = "John";
        String course = "Java";
        int studentId = 27;
        model.addAttribute("name", name);
        model.addAttribute("course", course);
        model.addAttribute("ids", studentId);
        ArrayList<Integer> numArr = new ArrayList<>();
        numArr.add(1);
        numArr.add(2);
        numArr.add(7);
        numArr.add(9);
        numArr.add(14);
        model.addAttribute("numbers", numArr);
        Student student = new Student(studentId, "Mike", "Smith");
        model.addAttribute("student", student);
        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){

        return "student/register";
    }
}
