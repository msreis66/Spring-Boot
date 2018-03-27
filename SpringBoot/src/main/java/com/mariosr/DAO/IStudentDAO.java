package com.mariosr.DAO;

import com.mariosr.Entity.Student;

import java.util.Collection;

public interface IStudentDAO {
    Collection<Student> getAllStudents();

    Student getStudenByID(int id);

    void removeStudentByID(int id);

    void updateStudentByID(Student student);

    void insertStudent(Student student);
}
