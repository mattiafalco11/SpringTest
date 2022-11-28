package it.nttdata.myschool.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.nttdata.myschool.model.SchoolClass;
import it.nttdata.myschool.model.Student;
import it.nttdata.myschool.repository.SchoolClassRepository;
import it.nttdata.myschool.repository.StudentRepository;

@Component
public class BootStrapData implements CommandLineRunner{
    @Autowired
    SchoolClassRepository schoolClassRepository;
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception{
        SchoolClass schoolClass = new SchoolClass("1C");
        Student student = new Student("Mark", "Son", 19, schoolClass);

        studentRepository.save(student);
        schoolClassRepository.save(schoolClass);
    }
}
