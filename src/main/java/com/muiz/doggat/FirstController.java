package com.muiz.doggat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FirstController {

    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    //create a student pojo
    @PostMapping("/students")
    public Student post(
            @RequestBody Student student
    ) {
        return repository.save(student);
    }

    //read all
    @GetMapping("/students/all")
    public List<Student> getAllProducts() {
        return repository.findAll();
    }

    //read by their id
    @GetMapping("/students/{id}")
    public Student getbyid(
            @PathVariable Integer id
    ) {
        return repository.findById(id)
                .orElse(null);
    }


    //read by filtring firstname
    @GetMapping("/students/search/{firstname}")
    public List <Student> getbyname(
            @PathVariable("firstname") String firstname
    ) {
        return repository.findByFirstnameContaining(firstname);
        //  .orElse(null);
    }

    //Deleting at id condition
    @DeleteMapping("/student/remove/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletebyid(
            @PathVariable Integer id
    ) {
        repository.deleteById(id);
    }

    // Update entire student (PUT)
    @PutMapping("/student/update/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Integer id,
            @RequestBody Student updatedStudent) {

        // 1. Find existing student
        Optional<Student> existingStudent = repository.findById(id);

        if (existingStudent.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        // 2. Update fields
        Student studentToUpdate = existingStudent.get();
        studentToUpdate.setFirstname(updatedStudent.getFirstname());
        studentToUpdate.setEmail(updatedStudent.getEmail());
        studentToUpdate.setLastname(updatedStudent.getLastname());

        // 3. Save and return
        Student savedStudent = repository.save(studentToUpdate);
        return ResponseEntity.ok(savedStudent);
    }

    // Partial update using accessors directly first b4 DTO
    @PatchMapping("/student/update_one/{id}")
    public ResponseEntity<Student> partiallyUpdateStudent(
            @PathVariable Integer id,
            @RequestBody Student updatedStudent
    ) {

        return repository.findById(id)
                .map(student -> {
                    // Only update non-null fields
                    if (updatedStudent.getFirstname() != null) {
                        student.setFirstname(updatedStudent.getFirstname());
                    }
                    if (updatedStudent.getEmail() != null) {
                        student.setEmail(updatedStudent.getEmail());
                    }
                    if (updatedStudent.getAge() != 0) { // Assuming grade is primitive int
                        student.setAge(updatedStudent.getAge());
                    }
                    if (updatedStudent.getLastname() != null) {
                        student.setLastname(updatedStudent.getLastname());
                    }

                    return ResponseEntity.ok(repository.save(student));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

