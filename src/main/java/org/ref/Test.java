package org.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("refconfig.xml");
      //  B obje=(B) ctx.getBean("bref");
        A obj=(A) ctx.getBean("aref");

        System.out.println(obj.getX());
        System.out.println(obj.getOb().getY());

        System.out.println(obj);
    }
}
