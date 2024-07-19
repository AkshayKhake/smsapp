package edu.cjc.sms.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.servicei.StudentServiceI;


@Controller
public class AdminController 
{
	@Autowired
	StudentServiceI ssi;
	int a=10;
	String name="cjc";
	@RequestMapping("/")
	public String preLogin()
	{
		return "Login";
	}
	
	@RequestMapping("/log")
	public String onHome(@RequestParam ("username") String username, @RequestParam ("password") String password, Model m)
	{
		if(username.equals("ADMIN") && password.equals("ADMIN"))
		{
			List<Student> list=ssi.showData();
			m.addAttribute("data", list);
			return "adminscreen";
		}
		else
		{
			m.addAttribute("msg", "Invalid Username OR Password");
			return "Login";
		}
	
	}
	
	@RequestMapping("/enroll_student")
	public String saveStudentDetails(@ModelAttribute Student s)
	{
		ssi.saveData(s);
		
		return "adminscreen";
	}
	
	@RequestMapping("/search")
	public String getBatchStudent(@RequestParam ("batchNumber") String batchNumber,Model m)
	{
		List<Student> students=ssi.searchStudentByBatch(batchNumber);
		if(students.size()>0)
		{
		m.addAttribute("data", students);
		return "adminscreen";
		}
		else
		{
			List<Student> l=ssi.showData();
			m.addAttribute("data", l);
			m.addAttribute("message", "No records are available for this Batch "+batchNumber);
			return "adminscreen";
			
		}
	}
	
	@RequestMapping("/remove")
	public String removeStudent(@RequestParam ("studentId") int studentID,Model m)
	{
		List<Student> l=ssi.deleteStudentdata(studentID);
		m.addAttribute("data", l);
		return "adminscreen";
	}
	
	@RequestMapping("/fee")
	public String studentFees(@RequestParam ("studentId") int id,Model m)
	{
		Student st=ssi.getSingleStudent(id);
		m.addAttribute("stu", st);
		return "fees";
	}
	
	@RequestMapping("/payfees")
	public String payFees(@RequestParam ("studentId") int id,@RequestParam ("ammount") double ammount,Model m)
	{
		ssi.updateStudentFees(id,ammount);
		List<Student> l=ssi.showData();
		m.addAttribute("data", l);
		return "adminscreen";
	}
	
	
}
