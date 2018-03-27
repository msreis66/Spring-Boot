package com.mariosr.Controller;

import com.mariosr.Entity.Student;
import com.mariosr.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService = new StudentService();

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentByID(@PathVariable("id") int id) {
        return studentService.getStudenByID(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeStudentByID(@PathVariable("id") int id) {
        studentService.removeStudentByID(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }
}
