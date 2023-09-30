/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E-LAB-PC57
 */
public class polymorphism {
    void methodA()
    {
        System.out.println("MethodA ");
    }
    void methodA(int a)
    {
        System.out.println("MethodA without return type with args ");
        System.out.println("a :"+a );
       
    }
    void methodA(int a,char ch)
    {
        System.out.println("MethodA without return type with args");
        System.out.println("a :"+a+"ch :"+ch );
    }
    public static void main(String[] arg)
    {
        polymorphism obj = new polymorphism();
        obj.methodA();
        obj.methodA(23);
        obj.methodA(65, 'l');
        
    }
    
}
