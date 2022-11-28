package it.nttdata.myschool.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    Integer studentNumber;
    @OneToMany(mappedBy = "schoolClass")
    List<Student> students = new ArrayList<>();
    
    public SchoolClass() {
    }
    

    public SchoolClass(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    
}
