package com.AmansApi.StudentManagmentSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.*;
import  java.util.HashMap;
import  java.util.Map;

@RestController
public class StudentController {

    // te.mpeory data base;

// this is for path variable;
//    @GetMapping("/get_Student/{admitNo}")
//    public Student getStudent (@PathVariable("admitNo") int admitNo){
//        return db.get(admitNo);
//   }

    @Autowired
    StudentService studentService;

    //this is for RequestParam
    @GetMapping("/get_Student")
    public ResponseEntity getStudent (@RequestParam("q") int admitNo){
        Student student=studentService.getStudent(admitNo);
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }

    @PostMapping("/add_Student")
    public ResponseEntity addStudent (@RequestBody Student student){
        String response=studentService.addStudent(student);

        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    // for deleti.ng the data of student
    @DeleteMapping("/delet_Student/{admitNo}")
    public ResponseEntity deletStudent(@PathVariable("admitNo") int admitNo){
        String response=studentService.deletStudent(admitNo);
        if(response.equals("DataBase is Empty")){
            return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        }
         return new ResponseEntity<>(response,HttpStatus.FOUND);
    }

    @PutMapping("/update_Student")
    public ResponseEntity updateStudent(@RequestParam("admitNo") int admitNo,@RequestParam("age") int age){
    String response=studentService.updateStudent(admitNo,age);
    if(response==null){
        return new ResponseEntity<>("Invalid request",HttpStatus.NOT_FOUND);
    }
      return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

}
