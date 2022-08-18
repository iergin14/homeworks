package chapter8and9;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Student {
	String no;
	String name;
	String dob;
	Department department;
	Professor advisor;
	Course[] coursesTaken;
	
	Student (String no,
    		String name, 
    		String dob,
    		Department department,
    		Professor advisor,
    		Course[] coursesTaken) {
		this.no=no;
    	this.name=name;
    	this.dob=dob;
    	this.department = department;
    	this.advisor = advisor;
		this.coursesTaken=coursesTaken;		
	}
	Student (String dob,
    		Department department,
    		Professor advisor,
    		Course[] coursesTaken) {
		this("23971","Ilayda Ergin",dob, department, advisor, coursesTaken);
	}
	
    String getNo(){
    	return no;
    }
    void setNo(String newNo) {
    	no = newNo;
    }
    String getName(){
    	return name;
    }
    void setName(String newName) {
    	name = newName;
    }
    String getDob(){
    	return dob;
    }
    void setDob(String newDob) {
    	dob = newDob;
    }
    
    Department getDepartment(){
    	return department;
    }
    void setDepartment(Department newDepartment) {
    	department = newDepartment;
    }
    
    Professor getProfessor(){
    	return advisor;
    }
    void setProfessor(Professor newProfessor) {
    	advisor = newProfessor;
    }
    
    Course[] getCoursesTaken(){
    	return coursesTaken;
    }
    void setCoursesTaken(Course[] newCoursesTaken) {
    	coursesTaken = newCoursesTaken;
    }
}
