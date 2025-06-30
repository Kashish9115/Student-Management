package com.student.Student.Management.controller;

import com.student.Student.Management.entity.Studententity;
import com.student.Student.Management.service.StudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


  @Tag(name = "Get all students record")
    @GetMapping
    public List<Studententity> getStudent(){
      return  studentService.getAllStudent();

    }

    @Tag(name = "Create Student record")
    @PostMapping("/createEntry")
    public ResponseEntity<Studententity> insertStudent(@RequestBody Studententity student){
   studentService.postStudent(student);
    return new  ResponseEntity<>(HttpStatus.CREATED);
    }




    @Tag(name = "Get student by Id")
    @GetMapping("/id/{myId}")
  public Studententity getStudentById(@PathVariable String myId , @RequestBody Studententity student){
     studentService.getById(myId);
      return student;
  }


    @Tag(name = "Update  Students record by Id")
  @PutMapping("/id/{myId}")
  public ResponseEntity<Studententity> updateStudentById(@PathVariable String myId, @RequestBody Studententity student) throws Exception {
  Studententity saved=studentService.updateStudent(myId,student);
 return ResponseEntity.ok(saved);
  }



    @Tag(name = "Delete Students record by Id")
  @DeleteMapping("/id/{myId}")
  public Studententity deleteStudentById(@PathVariable String myId, @RequestBody Studententity student){
       studentService.deleteById(myId);
       return student;
  }




}
