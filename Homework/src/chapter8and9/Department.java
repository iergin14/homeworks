package chapter8and9;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Department {
    String name;
    Professor head;
    Course[] courses;
    Student[] students;
    
    Department (String name, Professor head, Course[] courses, Student[] students){
    	this.name=name;
    	this.head=head;
    	this.courses=courses;
    	this.students=students;

    }
    Department (Professor head, Course[] courses, Student[] students){
    	this("Economics",head,courses,students);
    }
    String getName(){
    	return name;
    }
    void setCode(String newName) {
    	name = newName;
    }
    
    Professor getHead(){
    	return head;
    }
    void setHead(Professor newHead) {
    	head = newHead;
    }
    
    Course[] getCourses(){
    	return courses;
    }
    void setCourse(Course [] newCourses) {
    	courses = newCourses;
    }
    
    Student[] getStudent(){
    	return students;
    }
    void setStudent(Student [] newStudents) {
    	students = newStudents;
    }
    
}
