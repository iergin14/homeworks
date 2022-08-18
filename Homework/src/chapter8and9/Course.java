package chapter8and9;

import java.util.Date;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Course {
	String code;
    String name;
    Department department;
    Professor teacher;
    Student[] students;
    String[] days;
    Date time;
    
   Course(String newCode, 
		  String newName, 
		  Department newDepartment,
		  Professor newTeacher,
		  Student[] newStudents,
		  String[] newDays, 
		  Date newTime){
	   this.code = newCode;
	   this.name = newName;
	   this.department = newDepartment;
	   this.teacher = newTeacher;
	   this.students = newStudents;
	   this.days = newDays;
	   this.time = newTime;
   }
   
   Course(
		  Department newDepartment,
		  Professor newTeacher,
		  Student[] newStudents,
		  String[] newDays, 
		  Date newTime
	){
	   this("201", "MacroEconomy", newDepartment,newTeacher, newStudents, newDays, newTime);

   }
   
	    
    
    String getCode(){
    	return code;
    }
    void setCode(String newCode) {
    	code = newCode;
    }	
    
    String getName(){
    	return name;
    }
    void setName(String newName) {
    	name = newName;
    }	
    
    Department getDepartment(){
    	return department;
    }
    void setDepartment(Department newDepartment) {
    	department = newDepartment;
    }	
    
    Professor getProfessor(){
    	return teacher;
    }
    void setProfessor(Professor newProfessor) {
    	teacher = newProfessor;
    }	
    
    Student[] getStudents(){
    	return students;
    }
    void setStudents(Student[]  newStudents) {
    	students = newStudents;
    }	
    
    String[] getDays(){
    	return days;
    }
    void setDays(String[]  newDays) {
    	days = newDays;
    }
    
    Date getTime(){
    	return time;
    }
    void setTime(Date  newTime) {
    	time = newTime;
    }
}


