package com.javaonlinecourse.b2lesson1.homework.hw03;

/**
 * Created by EvilCorp on 18.11.2016.
 */
public class Circle {
    int X, Y, radius, width;
    String color;

    public Circle(int X, int Y,int radius){
        this.X = X;
        this.Y = Y;
        this.radius = radius;
    }
    public Circle(int X, int Y,int radius,int width){
        this.X = X;
        this.Y = Y;
        this.radius = radius;
        this.width = width;

    }
  public Circle(int X, int Y,int radius,int width, String color){
      this.X = X;
    this.Y = Y;
    this.radius = radius;
    this.width = width;
    this.color = color;
}
}
