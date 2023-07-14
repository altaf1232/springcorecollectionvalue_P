package com.springcores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("collection.xml");
        TestStudent testStudent=context.getBean("testStudent",TestStudent.class);
        System.out.println(testStudent);
        System.out.println(testStudent.getAddress());
        System.out.println(testStudent.getAddress().getClass().getName());
    }
}
