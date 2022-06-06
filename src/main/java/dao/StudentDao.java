package dao;

import model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {
    Integer insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    Integer updateStudentById(UUID studentId, Student studentUpdate);

    Integer deleteStudentById(UUID studentId);
}
