package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	public StudentRepo repository;
	
	public Student saveInfo(Student student)
	{
		return repository.save(student);
	}
	public List<Student> getInfo()
	{
		return repository.findAll();
	}
	
	public Student updateInfo(Student std)
	{
		return repository.saveAndFlush(std);
	}
	public void deleteInfo(int id)
	{
		repository.deleteById(id);
	}
	
	
	
	//sorting
			public List<Student> sortAsc(String BookName)
			{
				return repository.findAll(Sort.by(BookName).ascending());
			}
			
			public List<Student> sortDesc(String BookName)
			{
				return  repository.findAll(Sort.by(BookName).descending());
			}
			
			//pagination
			public List<Student> paginationData(int pageNo, int pageSize)
			{
				Page<Student> p =  repository.findAll(PageRequest.of(pageNo, pageSize));
				return p.getContent();
			}
			
			//paginationAndSorting
			public List<Student> paginationAndSorting(int pageNo,int pageSize,String BookName)
			{
				Page<Student> p =  repository.findAll(PageRequest.of(pageNo, pageSize, Sort.by(BookName).ascending()));
				return p.getContent();
			}
}
