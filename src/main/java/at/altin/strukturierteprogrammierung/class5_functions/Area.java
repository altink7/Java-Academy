package at.altin.strukturierteprogrammierung.class5_functions;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        int width = 2;
        int height = 3;
        double width2 = 2.0;
        double height2 = 3.5;
        double radius = 3.0;

        //calls the first function because width and height are int
        double area = calculateArea(width, height);
        System.out.println(area);

        //calls the second function because width2 and height2 are double
        area = calculateArea(width2, height2);
        System.out.println(area);

        area = calculateArea(width, height2);
        System.out.println(area);

        //calls the third function because only one double argument is passed
        area = calculateArea(radius);
        System.out.println(area);
    }

    public static double calculateArea(int width, int height){
        width *= 2;
        int area = width * height;
        return (double) area;
    }

    public static double calculateArea(double width, double height){
        return width * height;
    }

    public static double calculateArea(int width, double height){
        return width * height;
    }

    public static double calculateArea(double width, int height){
        return width * height;
    }

    public static double calculateArea(double radius){
        return 2 * radius * Math.PI;
    }
}
