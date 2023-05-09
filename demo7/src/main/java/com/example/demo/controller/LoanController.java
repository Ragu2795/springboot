package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminModel;
import com.example.demo.model.LoanApplictionModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.LoanService;

@RestController
@CrossOrigin("*")
@Service
public class LoanController {
	@Autowired
	public LoanService lser;
	@PostMapping("/saveuser")
	public UserModel addDetails(@RequestBody UserModel phm)
	{
		return lser.saveInfo(phm);
	}
	@GetMapping("/getuser")
	public List <UserModel> getD(){
		return lser.getInfo();
	}
	@PutMapping("/updateuser")
	public UserModel display(@RequestBody UserModel p)
	{
		return lser.UpdateInfo(p);
	}
	@DeleteMapping("/deleteuser/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		lser.deleteInfo(id);
		return "Id "+id+" deleted";
	}
	
//login
	@PostMapping("/savelogin")
	public void addLogin(@RequestBody LoginModel nn)
	{
		lser.saveLogin(nn);
	}
	@GetMapping("/getlogin")
	public List <LoginModel> getLog(){
		return lser.getLogin();
	}
	@PutMapping("/updatelogin")
	public LoginModel displayLogin(@RequestBody LoginModel m)
	{
		return lser.UpdateLogin(m);
	}
	@DeleteMapping("/deletelogin/{email}")
	public String deleteL(@PathVariable String email)
	{
		lser.deleteLogin(email);
		return email+" deleted";
	}
	
//admin
	@PostMapping("/saveadmin")
	public AdminModel addAdmin(@RequestBody AdminModel n)
	{
		return lser.saveAdmin(n);
	}
	@GetMapping("/getadmin")
	public List <AdminModel> getAdd(){
		return lser.getAdmin();
	}
	@PutMapping("/updateadmin")
	public AdminModel displayAdmin(@RequestBody AdminModel mo)
	{
		return lser.UpdateAdmin(mo);
	}
	@DeleteMapping("/deleteadmin/{email}")
	public String deleteA(@PathVariable String email)
	{
		lser.deleteAdmin(email);
		return email+" deleted";
	}
	
//loan
	@PostMapping("/saveloan")
	public LoanApplictionModel addLoan(@RequestBody LoanApplictionModel lom)
	{
		return lser.saveLoan(lom);
	}
	@GetMapping("/getloan")
	public List <LoanApplictionModel> getAd(){
		return lser.getLoan();
	}
	@PutMapping("/updateloan")
	public LoanApplictionModel displayLoan(@RequestBody LoanApplictionModel mo)
	{
		return lser.UpdateLoan(mo);
	}
	@DeleteMapping("/deleteloan/{loanId}")
	public String deleteLo(@PathVariable int loanId)
	{
		lser.deleteLoan(loanId);
		return "loanId "+loanId+" deleted";
	}

}