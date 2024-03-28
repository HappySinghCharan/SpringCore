package org.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("alone-config.xml");
        Person p1= (Person) ctx.getBean("p1");

        System.out.println(p1);
       System.out.println(p1.getFriends().getClass().getName());
       System.out.println(p1.getFee().getClass().getName());
        System.out.println(p1.getProp().getClass().getName());
    }
}
