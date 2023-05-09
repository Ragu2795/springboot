package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;
import com.example.demo.model.LoanApplictionModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.AdminRepo;
import com.example.demo.repository.LoanApplicationRepo;
import com.example.demo.repository.LoginRepo;
import com.example.demo.repository.UserRepo;
@Service
public class LoanService {
	@Autowired
	public UserRepo urep;
	public List <UserModel> getInfo()
	{
		return urep.findAll();
	}
	public UserModel saveInfo(UserModel ob)
	{
		return urep.save(ob);
	}
	public UserModel UpdateInfo(UserModel io)
	{
		return urep.saveAndFlush(io);
	}
	public void deleteInfo(int id)
	{
		urep.deleteById(id);
	}
	
	//login
	@Autowired
	public LoginRepo lrep;
	public void saveLogin(LoginModel o)
	{
		lrep.save(o);
	}
	public List <LoginModel> getLogin()
	{
		return lrep.findAll();
	}
	public LoginModel UpdateLogin(LoginModel i)
	{
		return lrep.saveAndFlush(i);
	}
	public void deleteLogin(String email)
	{
		lrep.deleteAll();
	}
	
	//admin
	@Autowired
	public AdminRepo arep;
	public AdminModel saveAdmin(AdminModel ab)
	{
		return arep.save(ab);
	}
	public List <AdminModel> getAdmin()
	{
		return arep.findAll();
	}
	public AdminModel UpdateAdmin(AdminModel oi)
	{
		return arep.saveAndFlush(oi);
	}
	public void deleteAdmin(String email)
	{
		lrep.deleteAll();
	}
	//loan
	@Autowired
	public LoanApplicationRepo lorep;
	public LoanApplictionModel saveLoan(LoanApplictionModel lm)
	{
		return lorep.save(lm);
	}
	public List <LoanApplictionModel> getLoan()
	{
		return lorep.findAll();
	}
	public LoanApplictionModel UpdateLoan(LoanApplictionModel i)
	{
		return lorep.saveAndFlush(i);
	}
	public void deleteLoan(int loanId)
	{
		lorep.deleteAll();
	}
	
}