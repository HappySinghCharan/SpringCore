package org.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("autowireannotation-config.xml");
        Emp emp1= (Emp) ctx.getBean("emp1");

        System.out.println(emp1);

    }
}
