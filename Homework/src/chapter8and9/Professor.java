package chapter8and9;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Professor {
	String no;
    String name;
    String dob;
    String rank;
    Department department;
    Student[] advisee;
    Course[] coursesGiven;
    
    Professor (String no,
    		String name, 
    		String dob, 
    		String rank, 
    		Department department, 
    		Student[] advisee, 
    		Course[] coursesGiven ){
    	this.no=no;
    	this.name=name;
    	this.dob=dob;
    	this.rank=rank;
    	this.department=department;
    	this.advisee=advisee;
    	this.coursesGiven=coursesGiven;
    }
    
    
    Professor ( 
    		String dob, 
    		String rank, 
    		Department department, 
    		Student[] advisee, 
    		Course[] coursesGiven ){
    	this("5","Özgür Demirtas", dob,rank,department,advisee,coursesGiven);

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
    String getRank(){
    	return rank;
    }
    void setRank(String newRank) {
    	rank = newRank;
    }
    Department  getDepartment(){
    	return department;
    }
    void setAdvisee(Department newDepartment) {
    	department = newDepartment;
    }
    
    Student [] getAdvisee(){
    	return advisee;
    }
    void setAdvisee(Student[] newAdvisee) {
    	advisee = newAdvisee;
    }
    Course [] getcoursesGiven(){
    	return coursesGiven;
    }
    void setCourse(Course[] newCourse) {
    	coursesGiven = newCourse;
    }
}
