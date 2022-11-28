package it.nttdata.myschool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String surname;
    Integer age;
    @ManyToOne
    @JoinColumn(name = "schoolClass_id")
    SchoolClass schoolClass;
 
    public Student() {
    }
    
    public Student(String name, String surname, Integer age, SchoolClass schoolClass) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schoolClass = schoolClass;
    }
    public SchoolClass getSchoolClass() {
        return schoolClass;
    }
    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

}
