package service;

import dao.StudentDao;
import model.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Integer persistNewStudent(UUID studentId, Student student){
        UUID studentuId= studentId == null ? UUID.randomUUID() :  studentId;
        return studentDao.insertNewStudent(studentuId, student);
    }

    public Student getStudentById(UUID studentId){
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents(){
        return studentDao.selectAllStudents();
    }

    public Integer updateStudentById(UUID studentId, Student studentUpdate){
        return studentDao.updateStudentById(studentId,studentUpdate);
    }

    public Integer deleteStudentById(UUID studentId){
        return studentDao.deleteStudentById(studentId);
    }
}
