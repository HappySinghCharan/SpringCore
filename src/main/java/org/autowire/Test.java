package org.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("autowire-config.xml");
        Emp emp1= (Emp) ctx.getBean("emp1");

        System.out.println(emp1);

    }
}
