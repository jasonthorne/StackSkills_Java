package jay.programming.courseAppDatabase;

import java.util.ArrayList;
import java.util.List;

public class CourseServer {

    public List<Course>getCourseList(){
        List<Course>courseList = new ArrayList();
        Course course = new Course();

        for (int i=0;i<10;i++){
            course.setCourseName("Course Name" + i);
            course.setCourseAuthor("Course Author" + i);

            courseList.add(course);
        }

        return courseList;
    }
}
