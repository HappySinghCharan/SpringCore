package org.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("CIconfig.xml");

        Person obj=(Person) ctx.getBean("person1");
        Addition add=(Addition) ctx.getBean("add1");

        add.doSum();

        System.out.println(obj);
    }
}
