package com.restproject.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository  studentRepository;
//---------------------------------------------------------------------------------------	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		return studentRepository.findAll();	
	}
//---------------------------------------------------------------------------------------	
	@PostMapping("/addStudents")
	public Student addStudent(@RequestBody Student student) {

	return studentRepository.save(student);
	}
//---------------------------------------------------------------------------------------	
	@DeleteMapping("/removeStudent/{id}")
	public void deleteStudent(@PathVariable long id) {
		
		studentRepository.deleteById(id);	
		System.out.println("Student Id:"+id +"deleted Sucessfully !!");
	}
//---------------------------------------------------------------------------------------
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable long id) {
	
		Optional<Student> s= studentRepository.findById(id);
		Student student1= s.get();
		student1.setId(id);
		return studentRepository.save(student);
	}
	
}
