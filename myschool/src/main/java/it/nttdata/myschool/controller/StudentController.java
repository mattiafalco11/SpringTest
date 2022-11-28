package it.nttdata.myschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.nttdata.myschool.repository.SchoolClassRepository;
import it.nttdata.myschool.repository.StudentRepository;

@Controller
public class StudentController {
    private StudentRepository studentRepository;
    private SchoolClassRepository schoolClassRepository;

    public StudentController(StudentRepository studentRepository, SchoolClassRepository schoolClassRepository) {
        this.studentRepository = studentRepository;
        this.schoolClassRepository = schoolClassRepository;
    }
    @GetMapping("/students")
    public String getAllStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());

        return "students"; 
    }
    
}
