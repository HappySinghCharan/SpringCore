package org.lifecycle;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.SQLOutput;
//Life Cycle of Bean using Interfaces
public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting pepsi price");
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking Pepsi :Init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to put bottle back to shop : Destroy");
    }
}
