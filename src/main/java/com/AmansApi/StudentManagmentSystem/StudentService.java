package com.AmansApi.StudentManagmentSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent ( int admitNo){
        return studentRepository.getStudent(admitNo);
    }

    public String addStudent ( Student student){

        return studentRepository.addStudent(student);
    }

    public String deletStudent( int admitNo){
        return studentRepository.deletStudent(admitNo);
    }
    public String updateStudent(int admitNo,int age){
        return studentRepository.updateStudent(admitNo,age);
    }
}
