package org.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp employee=(Emp) context.getBean("emp1");

        System.out.println(employee.getName());
        System.out.println(employee.getPhones());

        System.out.println(employee.getAddresses());
        System.out.println(employee.getCourses());

        System.out.println(employee.getPhones().getClass().getName());
    }
}
