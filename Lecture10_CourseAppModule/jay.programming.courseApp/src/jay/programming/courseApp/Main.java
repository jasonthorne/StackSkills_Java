package jay.programming.courseApp;

import jay.programming.courseAppDatabase.Course;
import jay.programming.courseAppDatabase.CourseServer;

import java.util.List;

public class Main {
    public static void main(String args[]){

        CourseServer courseServer = new CourseServer();

        List<Course> courses = courseServer.getCourseList(); //coming from 'CourseServer' in other module

        for (Course course : courses){
            System.out.println("Courses " + course.getCourseName());

        }



    }
}
