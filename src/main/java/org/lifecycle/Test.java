package org.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lcconfig.xml" );

        //newBean b1=(newBean)ctx.getBean("b1");
       //System.out.println(b1);
       //registering shutdown hook
        ctx.registerShutdownHook();

        //System.out.println("+++++++++");

       // Pepsi p1= (Pepsi) ctx.getBean("p1");
       // System.out.println(p1);


        UsingAnnotations u1= (UsingAnnotations) ctx.getBean("u1");

        System.out.println(u1);
    }
}
