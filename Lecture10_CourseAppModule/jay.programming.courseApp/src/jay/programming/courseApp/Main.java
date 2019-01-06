package jay.programming.courseApp;

import jay.programming.courseAppDatabase.Course;
import jay.programming.courseAppDatabase.CourseServer;

import java.util.List;

//++++++++++Lesson 11
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
//Lesson 11++++++++++

public class Main {


    public Main () throws MalformedURLException{

    }

    public static void main(String args[])throws IOException{

        CourseServer courseServer = new CourseServer();

        List<Course> courses = courseServer.getCourseList(); //coming from 'CourseServer' in other module

        for (Course course : courses){
            System.out.println("Courses " + course.getCourseName());

        }



        //++++++++++Lesson 11
        URL url = new URL("https://www.buildappswithpaulo.com"); //Specify URL
        URLConnection urlConnection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String inputLine;

        while ((inputLine = reader.readLine()) != null){
            System.out.println(inputLine);
        }
        reader.close();
        //Lesson 11++++++++++



    }
}
