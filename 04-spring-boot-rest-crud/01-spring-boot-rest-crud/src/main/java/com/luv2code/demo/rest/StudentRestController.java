package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    //define @Postconstruct to load the student data ... only once
    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();
        theStudents.add(new Student("Poorniema", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Tossino"));
    }

    //define endpoint for "/students" - return a list of students
    //http://localhost:8080/api/students
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    //http://localhost:8080/api/students/Jan/Novak       "/students/{firstname}/{lastName}
    @PostMapping("/students/{firstname}/{lastname}")
    public Student addStudent(@PathVariable String firstname, @PathVariable String lastname) {
        Student a = new Student(firstname, lastname);
        theStudents.add(a);
        return a;
    }

    //my tests
    //http://localhost:8080/api/test/Pukac/45
    @GetMapping("/test/{a}/{b}")
    public String test(@PathVariable String a, @PathVariable double b){
        return a + " "+b;
    }

    //http://localhost:8080/api/test?name=pavel&age=50
    @GetMapping("/test")
    public String test(@RequestParam("name") String name, @RequestParam("age") int age){
        return name + " " + age;
    }


    //http://localhost:8080/api/studentsadd?firstname=Jan&lastname=Naka
    @GetMapping("/studentsadd")
    public Student addStudent1(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {
        Student a = new Student(firstname, lastname);
        theStudents.add(a);
        return a;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        theStudents.add(student);
        return ResponseEntity.ok("Student added successfully");
    }

    // define endpoint or "/students/{studentId}" - return student at index
    // http://localhost:8080/api/students/2
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        // just index into the list ... keep it simple for now

        //check the studentId again list size
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - "+studentId);
        }
        return theStudents.get(studentId);
    }

    //add an exception handler using @ExceptionHandler
//    @ExceptionHandler   //exception handler method
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){      //StudentErrorResponse - type of the response body   StudentNotFoundException - exception type to handle
//
//        //create a StudentErrorResponse
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        //return ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }

    //add another exception handler ... to catch any axception (catch all)

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
//
//        //create a StudentErrorResponse
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        //return ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//    }

}
