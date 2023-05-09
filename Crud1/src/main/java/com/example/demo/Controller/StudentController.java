package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/customer")

public class StudentController {
	@Autowired
	public StudentService stser;
		
	@PostMapping("/post")
	public Student saveStudent(@RequestBody Student student)
	{
		return stser.saveInfo(student);
	}
	@GetMapping("get")
	public List<Student> getDetails()
	{
		return stser.getInfo();
	}
	
	
	
	
	@PutMapping("update")
	
	public Student updetails(@RequestBody Student std)
	{
		return stser.updateInfo(std);
	}
	@DeleteMapping("delete/{id}")
	 public String deleteDetails(@PathVariable("id") int sid)
	  {
	    stser.deleteInfo(sid);
	    return "Book Id"+sid+"Deleted";
	  }
	
	
	@Autowired
	public StudentRepo brep;
	
	
	@GetMapping("/sortAsc/{name}")
	public List<Student> sortAscend(@PathVariable("name") String BookName)
	{
		return stser.sortAsc(BookName);
	}
	@GetMapping("/sortDesc/{name}")
	public List<Student> sortDesc(@PathVariable("name") String BookName)
	{
		return stser.sortDesc(BookName);
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
	public List<Student> paginationData(@PathVariable("pageNo")int pnu,@PathVariable("pageSize") int psize)
	{
		return stser.paginationData(pnu,psize);
	}
	
	@GetMapping("/pagiantionAndSorting/{pageNo}/{pageSize}/{name}")
	public List<Student> paginationAndSorting(@PathVariable("pageNo") int pnu,@PathVariable("pageSize") int psize,@PathVariable("name") String BookName)
	{
		return stser.paginationAndSorting(pnu, psize, BookName);
	}
}	