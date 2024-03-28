package org.lifecycle;
//Life Cycle of Bean using configuration file (xml).
public class newBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public newBean() {
        super();
    }

    @Override
    public String toString() {
        return "newBean{" +
                "price=" + price +
                '}';
    }

    public  void init()
    {
        System.out.println("Inside init method");

    }

    public void destroy()
    {
        System.out.println("Inside destroy method");
    }
}
