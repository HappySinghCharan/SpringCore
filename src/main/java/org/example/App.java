package org.example;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
import java.lang.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

            ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

            // ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
            Student student1 = (Student) ctx.getBean("Stu1");
            Student student2 = (Student) ctx.getBean("Stu2");

            System.out.println(student1);
            System.out.println(student2);

    }
}
