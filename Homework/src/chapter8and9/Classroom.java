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
public class Classroom {
	Course []course_list;
	String name;
	
	Classroom (String name,Course[] course_list) {
		this.course_list=course_list;
		this.name=name;
				
	}
	Classroom (Course[] course_list) {
		this("Math", course_list);
	}
	
	Course[] getCourse(){
    	return course_list;
    }
    void setCourse(Course[] newCourse) {
    	course_list = newCourse;
    }	
    
    String getName(){
    	return name;
    }
    void setName(String newName) {
    	name = newName;
    }	
}


