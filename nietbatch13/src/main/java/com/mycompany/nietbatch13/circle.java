/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nietbatch13;

/**
 *
 * @author E-LAB-PC57
 */
  public class circle {
    static float pi=3.14f;
    int radius;
    circle(int r)
    {
        radius=r;
    }
    void diameter()
    {
        System.out.println("Method call through object :"+radius);
    }
    void circumference()
    {
        System.out.println("circumference :");
        System.out.println(2*circle.pi*radius);
    }
    void area()
    {
        System.out.println("Area :");
        System.out.println(circle.pi*(radius*radius));
    }
    public static void main(String[] args)
    {
        circle c1 = new circle(5);
        c1.area();
        c1.circumference();
        c1.diameter();
    }
}
