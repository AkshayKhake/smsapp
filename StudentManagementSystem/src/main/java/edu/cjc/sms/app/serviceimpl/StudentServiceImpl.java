package edu.cjc.sms.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.repository.StudentRepository;
import edu.cjc.sms.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{

	@Autowired
	StudentRepository sr;

	@Override
	public void saveData(Student s) 
	{
		sr.save(s);	
	}

	@Override
	public List<Student> showData() {
		
		return sr.findAll();
	}

	@Override
	public List<Student> searchStudentByBatch(String batchNumber) {
		
		List<Student> batchStudents=sr.findAllByBatchNumber(batchNumber);
		return batchStudents;
	}

	@Override
	public List<Student> deleteStudentdata(int studentID) {
		
		 sr.deleteById(studentID);
		 return sr.findAll();
	}

	

	
}
