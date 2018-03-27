package com.mariosr.Service;

import com.mariosr.DAO.IStudentDAO;
import com.mariosr.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private IStudentDAO IStudentDAO;

    public Collection<Student> getAllStudents() {
        return this.IStudentDAO.getAllStudents();
    }

    public Student getStudenByID(int id) {
        return this.IStudentDAO.getStudenByID(id);
    }

    public void removeStudentByID(int id) {
        this.IStudentDAO.removeStudentByID(id);
    }

    public void updateStudent(Student student) {
        this.IStudentDAO.updateStudentByID(student);
    }

    public void insertStudent(Student student) {
        this.IStudentDAO.insertStudent(student);
    }
}
