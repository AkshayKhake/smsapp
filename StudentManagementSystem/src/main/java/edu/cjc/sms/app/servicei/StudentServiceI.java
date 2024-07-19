package edu.cjc.sms.app.servicei;

import java.util.List;

import edu.cjc.sms.app.model.Student;

public interface StudentServiceI 
{

	void saveData(Student s);

	List<Student> showData();

	List<Student> searchStudentByBatch(String batchNumber);

	List<Student> deleteStudentdata(int studentID);

	Student getSingleStudent(int id);

	void updateStudentFees(int id, double ammount);

	



}
