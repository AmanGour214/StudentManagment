package com.AmansApi.StudentManagmentSystem;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db=new HashMap<>();

    public Student getStudent ( int admitNo){
        return db.get(admitNo);
    }
    public String addStudent ( Student student){
        int admitNo=student.getAdmitNo();
        db.put(admitNo,student);
        return "Student added Successfully";
    }

    public String deletStudent( int admitNo){
        if(db.containsKey(admitNo)){
            db.remove(admitNo);
            return "details delet successfully";
        }
        return "DataBase is Empty";
    }

    public String updateStudent(int admitNo,int age){

        if(!db.containsKey(admitNo)){
            return "null";
        }
        Student student=db.get(admitNo);
        student.setAge(age);
        return "Update Added Successfully";
    }

}
