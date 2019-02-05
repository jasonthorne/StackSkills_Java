package com.jay.InnerClasses;

public class Ball { //Outer class
    private String ballName;
    private int ballSize;

    public void setUpBall(){

        //outer class can see inner classes
       new OrangeBall().setUpOrangeBall(); //creating orangeBall object and calling its method
    }

    //Inner Class
    class OrangeBall{

        public void setUpOrangeBall(){

            //private instances above can be accessed
            ballName = "Inside Inner Class Ball";
            ballSize = 23;
            System.out.println(ballName + " " + ballSize);

        }
    }
}
