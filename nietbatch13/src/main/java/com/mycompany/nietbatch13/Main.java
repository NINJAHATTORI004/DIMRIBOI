/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nietbatch13;


public class Main
{
    Main()
    {
        System.out.println("caling constructor" );
    }
    void diameter(int radius)
    {
        System.out.println(radius*2 );
    }
public static void main(String[] args)
    {
        Main c = new Main();
        c.diameter(5);
    }
}
