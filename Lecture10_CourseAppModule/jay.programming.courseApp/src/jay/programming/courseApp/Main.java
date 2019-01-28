package jay.programming.courseApp;

import jay.programming.courseAppDatabase.Course;
import jay.programming.courseAppDatabase.CourseServer;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.*;
import java.util.List;

//++++++++++Lesson 11
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        //==============JAVA 9 way:
        HttpClient httpClient = HttpClient.newHttpClient();//crate client
        try {

            HttpRequest httpRequest; //create request
            httpRequest = HttpRequest.newBuilder().uri(new URI("https://www.google.com")).GET().build();

            try {
                HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandler.asString()); //create response (getting response as string)
                System.out.println(httpResponse.body());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }catch(URISyntaxException e){
            e.printStackTrace();
        }


        //==============Pre JAVA 9 way:
       /*
       URL url = new URL("https://www.buildappswithpaulo.com"); //Specify URL
        URLConnection urlConnection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String inputLine;

        while ((inputLine = reader.readLine()) != null){
            System.out.println(inputLine);
        }
        reader.close();
        */
        //Lesson 11++++++++++



    }
}
