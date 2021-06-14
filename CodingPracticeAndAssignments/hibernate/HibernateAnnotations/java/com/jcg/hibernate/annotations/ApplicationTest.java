package com.jcg.hibernate.annotations;

import java.util.List;

import org.apache.log4j.Logger;

public class ApplicationTest {

	public final static Logger logger = Logger.getLogger(ApplicationTest.class);

	public static void main(String[] args) {

		Student studentObj1 = new Student(1, "JavaCodeGeek", 20);
		Student studentObj2 = new Student(2, "Harry Potter", 10);
		Student studentObj3 = new Student(3, "Lucifer", 5);

		logger.info("\n=======CREATE RECORDS=======");
		DbOperations.createRecord(studentObj1);
		DbOperations.createRecord(studentObj2);
		DbOperations.createRecord(studentObj3);

		logger.info("\n=======READ RECORDS=======");
		List<Student>viewStudent = DbOperations.displayRecords();
		for(Student student : viewStudent) {
			logger.info(student.toString());
		}

		logger.info("\n=======UPDATE RECORDS=======");
		studentObj1.setStudentAge(25);
		studentObj1.setStudentName("Java Code Geek");
		DbOperations.updateRecord(studentObj1);
		logger.info("\n=======READ RECORDS AFTER UPDATION=======");
		List<Student> updateStudent = DbOperations.displayRecords();
		for(Student student : updateStudent) {
			logger.info(student.toString());
		}

		logger.info("\n=======DELETE RECORD=======");
		DbOperations.deleteRecord(studentObj2.getStudentId());
		logger.info("\n=======READ RECORDS AFTER DELETION=======");
		List<Student> deleteStudentRecord = DbOperations.displayRecords();
		for(Student student : deleteStudentRecord) {
			logger.info(student.toString());
		}

		logger.info("\n=======DELETE ALL RECORDS=======");
		DbOperations.deleteAllRecords();
		logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
		List<Student> deleteAll = DbOperations.displayRecords();
		for(Student student : deleteAll) {
			logger.info(student.toString());
		}
		System.exit(0);
	}
}